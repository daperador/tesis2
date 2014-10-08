package co.edu.uniandes.csw.spl.dsl.serializer;

import annotate.AnnotatePackage;
import annotate.Annotation;
import annotate.AnnotationAttribute;
import annotate.AnnotationType;
import annotate.AnnotationTypeAttribute;
import annotate.SimpleValue;
import annotate.Type;
import co.edu.uniandes.csw.spl.dsl.services.AnnotateitGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractAnnotateitSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnnotateitGrammarAccess grammarAccess;
	
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
			case AnnotatePackage.ANNOTATION_TYPE:
				if(context == grammarAccess.getAnnotationTypeRule()) {
					sequence_AnnotationType(context, (AnnotationType) semanticObject); 
					return; 
				}
				else break;
			case AnnotatePackage.ANNOTATION_TYPE_ATTRIBUTE:
				if(context == grammarAccess.getAnnotationTypeAttributeRule()) {
					sequence_AnnotationTypeAttribute(context, (AnnotationTypeAttribute) semanticObject); 
					return; 
				}
				else break;
			case AnnotatePackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (annotate.Package) semanticObject); 
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
			case AnnotatePackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attribute=[AnnotationTypeAttribute|EString] value=AnnotationAttributeValue?)
	 */
	protected void sequence_AnnotationAttribute(EObject context, AnnotationAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=[Type|EString]?)
	 */
	protected void sequence_AnnotationTypeAttribute(EObject context, AnnotationTypeAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString context=EString? (attributes+=AnnotationTypeAttribute attributes+=AnnotationTypeAttribute*)?)
	 */
	protected void sequence_AnnotationType(EObject context, AnnotationType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotationType=[AnnotationType|EString] (attributes+=AnnotationAttribute attributes+=AnnotationAttribute*)?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (types+=Type types+=Type*)? 
	 *         (annotationTypes+=AnnotationType annotationTypes+=AnnotationType*)?
	 *     )
	 */
	protected void sequence_Package(EObject context, annotate.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=EString?)
	 */
	protected void sequence_SimpleValue(EObject context, SimpleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (annotations+=Annotation annotations+=Annotation*)? (attributes+=AnnotationTypeAttribute attributes+=AnnotationTypeAttribute*)?)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
