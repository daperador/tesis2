package co.edu.uniandes.csw.spl.dsl.serializer;

import annotate.AnnotatePackage;
import annotate.Annotation;
import annotate.AnnotationAttribute;
import annotate.AnnotationType;
import annotate.AnnotationTypeAttribute;
import annotate.SimpleValue;
import annotate.Type;
import co.edu.uniandes.csw.spl.dsl.services.MVCDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import mvc.Action;
import mvc.Association;
import mvc.Attribute;
import mvc.Component;
import mvc.Controller;
import mvc.ControllerView;
import mvc.Entity;
import mvc.Event;
import mvc.EventAction;
import mvc.MVCModel;
import mvc.Model;
import mvc.MvcPackage;
import mvc.UIActions;
import mvc.UIInput;
import mvc.UILabel;
import mvc.UILayout;
import mvc.View;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

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
		else if(semanticObject.eClass().getEPackage() == MvcPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MvcPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
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
			case MvcPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
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
			case MvcPackage.MVC_MODEL:
				if(context == grammarAccess.getMVCModelRule()) {
					sequence_MVCModel(context, (MVCModel) semanticObject); 
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
	 *         name=EString 
	 *         preExecutionEvent=[Event|EString]? 
	 *         postExecutionEvent=[Event|EString]? 
	 *         (triggerEvents+=[Event|EString] triggerEvents+=[Event|EString]*)? 
	 *         (annotations+=Annotation annotations+=Annotation*)?
	 *     )
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *         containment?='containment'? 
	 *         name=EString 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         source=[Entity|EString] 
	 *         target=[Entity|EString] 
	 *         (annotations+=Annotation annotations+=Annotation*)?
	 *     )
	 */
	protected void sequence_Association(EObject context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=EString? (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString controllers+=[Controller|EString] controllers+=[Controller|EString]* (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (view=[View|EString] (models+=[Model|EString] models+=[Model|EString]*)? (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_ControllerView(EObject context, ControllerView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (views+=ControllerView views+=ControllerView*)? 
	 *         (actions+=Action actions+=Action*)? 
	 *         (eventActions+=EventAction eventActions+=EventAction*)?
	 *     )
	 */
	protected void sequence_Controller(EObject context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (extends+=[Entity|EString] extends+=[Entity|EString]*)? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (attributes+=Attribute attributes+=Attribute*)?
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=[Action|EString] (events+=[Event|EString] events+=[Event|EString]*)? (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_EventAction(EObject context, EventAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         importURI=STRING 
	 *         name=EString 
	 *         version=EString? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (models+=Model models+=Model*)? 
	 *         (views+=View views+=View*)? 
	 *         (events+=Event events+=Event*)? 
	 *         (controllers+=Controller controllers+=Controller*)? 
	 *         components+=Component 
	 *         components+=Component*
	 *     )
	 */
	protected void sequence_MVCModel(EObject context, MVCModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (annotations+=Annotation annotations+=Annotation*)? rootEntity=Entity? (associations+=Association associations+=Association*)?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
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
	
	
	/**
	 * Constraint:
	 *     (name=EString type=EString? triggerEvent=[Event|EString]? (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_UIActions(EObject context, UIActions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=EString? value=[Attribute|EString]? (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_UIInput(EObject context, UIInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=EString? text=EString? value=[Attribute|EString]? (annotations+=Annotation annotations+=Annotation*)?)
	 */
	protected void sequence_UILabel(EObject context, UILabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         type=EString? 
	 *         orientation=EString? 
	 *         columns=EInt? 
	 *         (importView+=[View|EString] importView+=[View|EString]*)? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         (components+=UIComponent components+=UIComponent*)?
	 *     )
	 */
	protected void sequence_UILayout(EObject context, UILayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (annotations+=Annotation annotations+=Annotation*)? rootComponent=UILayout?)
	 */
	protected void sequence_View(EObject context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
