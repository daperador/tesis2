package co.edu.uniandes.csw.dsl.serializer;

import annotate.AnnotatePackage;
import annotate.Annotation;
import annotate.AnnotationAttribute;
import annotate.SimpleValue;
import co.edu.uniandes.csw.dsl.services.EntitiesGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import mvc.Association;
import mvc.Attribute;
import mvc.Entities;
import mvc.Entity;
import mvc.Import;
import mvc.MvcPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractEntitiesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntitiesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnnotatePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnnotatePackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotatePackage.ANNOTATION_ATTRIBUTE:
				if(context == grammarAccess.getAnnotationAttributeRule()) {
					sequence_AnnotationAttribute(context, (AnnotationAttribute) semanticObject); 
					return; 
				}
				else break;
			case AnnotatePackage.SIMPLE_VALUE:
				if(context == grammarAccess.getAnnotationAttributeValueRule() ||
				   context == grammarAccess.getSimpleValueRule()) {
					sequence_SimpleValue(context, (SimpleValue) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == MvcPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MvcPackage.ASSOCIATION:
				if(context == grammarAccess.getAssociationRule()) {
					sequence_Association(context, (Association) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.ENTITIES:
				if(context == grammarAccess.getEntitiesRule()) {
					sequence_Entities(context, (Entities) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.IMPORT:
				if(context == grammarAccess.getImportsRule()) {
					sequence_imports(context, (Import) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attribute=[AnnotationTypeAttribute|ID] value=AnnotationAttributeValue?)
	 */
	protected void sequence_AnnotationAttribute(EObject context, AnnotationAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationType=[AnnotationType|ID] (attributes+=AnnotationAttribute attributes+=AnnotationAttribute*)?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (containment?='containment'? annotations+=Annotation? name=ID target=[Entity|ID] (lowerBound=EInt upperBound=EInt)?)
	 */
	protected void sequence_Association(EObject context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? name=ID type=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=imports* entities+=Entity*)
	 */
	protected void sequence_Entities(EObject context, Entities semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation? 
	 *         name=ID 
	 *         (extends+=[Entity|ID] extends+=[Entity|ID]*)? 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (associations+=Association associations+=Association*)?
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_SimpleValue(EObject context, SimpleValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnnotatePackage.Literals.SIMPLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnotatePackage.Literals.SIMPLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleValueAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_imports(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MvcPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MvcPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportsAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
}
