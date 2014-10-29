package co.edu.uniandes.csw.dsl.serializer;

import annotate.AnnotatePackage;
import annotate.Annotation;
import annotate.AnnotationAttribute;
import annotate.SimpleValue;
import co.edu.uniandes.csw.dsl.services.ComponentGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import mvc.Action;
import mvc.Component;
import mvc.Controller;
import mvc.ControllerView;
import mvc.Event;
import mvc.EventAction;
import mvc.Import;
import mvc.Model;
import mvc.MvcPackage;
import mvc.UIActions;
import mvc.UIInput;
import mvc.UILabel;
import mvc.UILayout;
import mvc.View;
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
public abstract class AbstractComponentSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentGrammarAccess grammarAccess;
	
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
			case MvcPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.CONTROLLER:
				if(context == grammarAccess.getControllerRule()) {
					sequence_Controller(context, (Controller) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.CONTROLLER_VIEW:
				if(context == grammarAccess.getControllerViewRule()) {
					sequence_ControllerView(context, (ControllerView) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.EVENT_ACTION:
				if(context == grammarAccess.getEventActionRule()) {
					sequence_EventAction(context, (EventAction) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.UI_ACTIONS:
				if(context == grammarAccess.getUIActionsRule() ||
				   context == grammarAccess.getUIComponentRule()) {
					sequence_UIActions(context, (UIActions) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.UI_INPUT:
				if(context == grammarAccess.getUIComponentRule() ||
				   context == grammarAccess.getUIInputRule()) {
					sequence_UIInput(context, (UIInput) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.UI_LABEL:
				if(context == grammarAccess.getUIComponentRule() ||
				   context == grammarAccess.getUILabelRule()) {
					sequence_UILabel(context, (UILabel) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.UI_LAYOUT:
				if(context == grammarAccess.getUIComponentRule() ||
				   context == grammarAccess.getUILayoutRule()) {
					sequence_UILayout(context, (UILayout) semanticObject); 
					return; 
				}
				else break;
			case MvcPackage.VIEW:
				if(context == grammarAccess.getViewRule()) {
					sequence_View(context, (View) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation? 
	 *         name=ID 
	 *         preExecutionEvent=[Event|ID]? 
	 *         postExecutionEvent=[Event|ID]? 
	 *         (triggerEvents+=[Event|ID] triggerEvents+=[Event|ID]*)?
	 *     )
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=[AnnotationTypeAttribute|ID] value=AnnotationAttributeValue)
	 */
	protected void sequence_AnnotationAttribute(EObject context, AnnotationAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnnotatePackage.Literals.ANNOTATION_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnotatePackage.Literals.ANNOTATION_ATTRIBUTE__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, AnnotatePackage.Literals.ANNOTATION_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnotatePackage.Literals.ANNOTATION_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotationAttributeAccess().getAttributeAnnotationTypeAttributeIDTerminalRuleCall_0_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getAnnotationAttributeAccess().getValueAnnotationAttributeValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
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
	 *         imports+=Import* 
	 *         annotations+=Annotation? 
	 *         name=ID 
	 *         (models+=Model models+=Model*)? 
	 *         (views+=View views+=View*)? 
	 *         (events+=Event events+=Event*)? 
	 *         (controllers+=Controller controllers+=Controller*)?
	 *     )
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? view=[View|ID] (models+=[Model|ID] models+=[Model|ID]*)?)
	 */
	protected void sequence_ControllerView(EObject context, ControllerView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation? 
	 *         name=ID 
	 *         (actions+=Action actions+=Action*)? 
	 *         (views+=ControllerView views+=ControllerView*)? 
	 *         (eventActions+=EventAction eventActions+=EventAction*)?
	 *     )
	 */
	protected void sequence_Controller(EObject context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? action=[Action|ID] (events+=[Event|ID] events+=[Event|ID]*)?)
	 */
	protected void sequence_EventAction(EObject context, EventAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? name=STRING)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MvcPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MvcPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? name=ID rootEntity=[Entity|ID]?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
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
	 *     (annotations+=Annotation? name=ID type=STRING? triggerEvent=[Event|ID]?)
	 */
	protected void sequence_UIActions(EObject context, UIActions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? name=ID type=ID? value=[Attribute|ID]?)
	 */
	protected void sequence_UIInput(EObject context, UIInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? name=ID type=STRING? text=STRING? value=[Attribute|ID]?)
	 */
	protected void sequence_UILabel(EObject context, UILabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID components+=UIComponent+)
	 */
	protected void sequence_UILayout(EObject context, UILayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation? name=ID rootComponent=UILayout)
	 */
	protected void sequence_View(EObject context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
