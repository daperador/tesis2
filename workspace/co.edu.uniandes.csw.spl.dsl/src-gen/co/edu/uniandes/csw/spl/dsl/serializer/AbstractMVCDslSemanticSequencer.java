package co.edu.uniandes.csw.spl.dsl.serializer;

import annotate.AnnotatePackage;
import annotate.Annotation;
import annotate.AnnotationAttribute;
import annotate.SimpleValue;
import co.edu.uniandes.csw.spl.dsl.services.MVCDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import mvc.MVCModel;
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
public abstract class AbstractMVCDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MVCDslGrammarAccess grammarAccess;
	
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
			case MvcPackage.MVC_MODEL:
				if(context == grammarAccess.getMVCModelRule()) {
					sequence_MVCModel(context, (MVCModel) semanticObject); 
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
	 *     (
	 *         importURI=STRING 
	 *         annotations+=Annotation* 
	 *         name=ID 
	 *         version=STRING? 
	 *         components+=[Component|ID] 
	 *         components+=[Component|ID]*
	 *     )
	 */
	protected void sequence_MVCModel(EObject context, MVCModel semanticObject) {
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
}
