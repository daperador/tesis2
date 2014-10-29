/**
 */
package mvc.impl;

import annotate.AnnotatePackage;

import annotate.impl.AnnotatePackageImpl;

import mvc.Action;
import mvc.Association;
import mvc.AssociationType;
import mvc.Attribute;
import mvc.Component;
import mvc.Controller;
import mvc.ControllerView;
import mvc.Entities;
import mvc.Entity;
import mvc.Event;
import mvc.EventAction;
import mvc.Import;
import mvc.MVCModel;
import mvc.Model;
import mvc.MvcFactory;
import mvc.MvcPackage;
import mvc.UIActions;
import mvc.UIComponent;
import mvc.UIInput;
import mvc.UILabel;
import mvc.UILayout;
import mvc.View;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MvcPackageImpl extends EPackageImpl implements MvcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mvcModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mvc.MvcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MvcPackageImpl() {
		super(eNS_URI, MvcFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MvcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MvcPackage init() {
		if (isInited) return (MvcPackage)EPackage.Registry.INSTANCE.getEPackage(MvcPackage.eNS_URI);

		// Obtain or create and register package
		MvcPackageImpl theMvcPackage = (MvcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MvcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MvcPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotatePackageImpl theAnnotatePackage = (AnnotatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotatePackage.eNS_URI) instanceof AnnotatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotatePackage.eNS_URI) : AnnotatePackage.eINSTANCE);

		// Create package meta-data objects
		theMvcPackage.createPackageContents();
		theAnnotatePackage.createPackageContents();

		// Initialize created meta-data
		theMvcPackage.initializePackageContents();
		theAnnotatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMvcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MvcPackage.eNS_URI, theMvcPackage);
		return theMvcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_RootEntity() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Extends() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Associations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Name() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Containment() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_LowerBound() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_UpperBound() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Type() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Target() {
		return (EReference)associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_RootComponent() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIComponent() {
		return uiComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponent_Name() {
		return (EAttribute)uiComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIComponent_Type() {
		return (EAttribute)uiComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMVCModel() {
		return mvcModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMVCModel_Name() {
		return (EAttribute)mvcModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMVCModel_Version() {
		return (EAttribute)mvcModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMVCModel_Components() {
		return (EReference)mvcModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMVCModel_ImportURI() {
		return (EAttribute)mvcModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMVCModel_Entities() {
		return (EReference)mvcModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Name() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Actions() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Views() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_EventActions() {
		return (EReference)controllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_PreExecutionEvent() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_PostExecutionEvent() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_TriggerEvents() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerView() {
		return controllerViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerView_View() {
		return (EReference)controllerViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerView_Models() {
		return (EReference)controllerViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Models() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Views() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Events() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Controllers() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Imports() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventAction() {
		return eventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventAction_Action() {
		return (EReference)eventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventAction_Events() {
		return (EReference)eventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUILayout() {
		return uiLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUILayout_Orientation() {
		return (EAttribute)uiLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUILayout_Columns() {
		return (EAttribute)uiLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUILayout_Components() {
		return (EReference)uiLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUILayout_ImportView() {
		return (EReference)uiLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIInput() {
		return uiInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIInput_Value() {
		return (EReference)uiInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIActions() {
		return uiActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIActions_TriggerEvent() {
		return (EReference)uiActionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUILabel() {
		return uiLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUILabel_Value() {
		return (EReference)uiLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUILabel_Text() {
		return (EAttribute)uiLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntities() {
		return entitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntities_Entities() {
		return (EReference)entitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntities_Imports() {
		return (EReference)entitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociationType() {
		return associationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvcFactory getMvcFactory() {
		return (MvcFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__ROOT_ENTITY);
		createEAttribute(modelEClass, MODEL__NAME);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__EXTENDS);
		createEReference(entityEClass, ENTITY__ASSOCIATIONS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__NAME);
		createEAttribute(associationEClass, ASSOCIATION__CONTAINMENT);
		createEAttribute(associationEClass, ASSOCIATION__LOWER_BOUND);
		createEAttribute(associationEClass, ASSOCIATION__UPPER_BOUND);
		createEAttribute(associationEClass, ASSOCIATION__TYPE);
		createEReference(associationEClass, ASSOCIATION__TARGET);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__NAME);
		createEReference(viewEClass, VIEW__ROOT_COMPONENT);

		uiComponentEClass = createEClass(UI_COMPONENT);
		createEAttribute(uiComponentEClass, UI_COMPONENT__NAME);
		createEAttribute(uiComponentEClass, UI_COMPONENT__TYPE);

		mvcModelEClass = createEClass(MVC_MODEL);
		createEAttribute(mvcModelEClass, MVC_MODEL__NAME);
		createEAttribute(mvcModelEClass, MVC_MODEL__VERSION);
		createEReference(mvcModelEClass, MVC_MODEL__COMPONENTS);
		createEAttribute(mvcModelEClass, MVC_MODEL__IMPORT_URI);
		createEReference(mvcModelEClass, MVC_MODEL__ENTITIES);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__NAME);
		createEReference(controllerEClass, CONTROLLER__ACTIONS);
		createEReference(controllerEClass, CONTROLLER__VIEWS);
		createEReference(controllerEClass, CONTROLLER__EVENT_ACTIONS);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEReference(actionEClass, ACTION__PRE_EXECUTION_EVENT);
		createEReference(actionEClass, ACTION__POST_EXECUTION_EVENT);
		createEReference(actionEClass, ACTION__TRIGGER_EVENTS);

		controllerViewEClass = createEClass(CONTROLLER_VIEW);
		createEReference(controllerViewEClass, CONTROLLER_VIEW__VIEW);
		createEReference(controllerViewEClass, CONTROLLER_VIEW__MODELS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__MODELS);
		createEReference(componentEClass, COMPONENT__VIEWS);
		createEReference(componentEClass, COMPONENT__EVENTS);
		createEReference(componentEClass, COMPONENT__CONTROLLERS);
		createEReference(componentEClass, COMPONENT__IMPORTS);

		eventActionEClass = createEClass(EVENT_ACTION);
		createEReference(eventActionEClass, EVENT_ACTION__ACTION);
		createEReference(eventActionEClass, EVENT_ACTION__EVENTS);

		uiLayoutEClass = createEClass(UI_LAYOUT);
		createEAttribute(uiLayoutEClass, UI_LAYOUT__ORIENTATION);
		createEAttribute(uiLayoutEClass, UI_LAYOUT__COLUMNS);
		createEReference(uiLayoutEClass, UI_LAYOUT__COMPONENTS);
		createEReference(uiLayoutEClass, UI_LAYOUT__IMPORT_VIEW);

		uiInputEClass = createEClass(UI_INPUT);
		createEReference(uiInputEClass, UI_INPUT__VALUE);

		uiActionsEClass = createEClass(UI_ACTIONS);
		createEReference(uiActionsEClass, UI_ACTIONS__TRIGGER_EVENT);

		uiLabelEClass = createEClass(UI_LABEL);
		createEReference(uiLabelEClass, UI_LABEL__VALUE);
		createEAttribute(uiLabelEClass, UI_LABEL__TEXT);

		entitiesEClass = createEClass(ENTITIES);
		createEReference(entitiesEClass, ENTITIES__ENTITIES);
		createEReference(entitiesEClass, ENTITIES__IMPORTS);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);

		// Create enums
		associationTypeEEnum = createEEnum(ASSOCIATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AnnotatePackage theAnnotatePackage = (AnnotatePackage)EPackage.Registry.INSTANCE.getEPackage(AnnotatePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		entityEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		attributeEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		associationEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		viewEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		uiComponentEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		mvcModelEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		controllerEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		eventEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		actionEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		controllerViewEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		componentEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		eventActionEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());
		uiLayoutEClass.getESuperTypes().add(this.getUIComponent());
		uiInputEClass.getESuperTypes().add(this.getUIComponent());
		uiActionsEClass.getESuperTypes().add(this.getUIComponent());
		uiLabelEClass.getESuperTypes().add(this.getUIComponent());
		entitiesEClass.getESuperTypes().add(theAnnotatePackage.getAnnotable());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_RootEntity(), this.getEntity(), null, "rootEntity", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Extends(), this.getEntity(), null, "extends", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Associations(), this.getAssociation(), null, "associations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Containment(), ecorePackage.getEBoolean(), "containment", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Type(), this.getAssociationType(), "type", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Target(), this.getEntity(), null, "target", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_RootComponent(), this.getUILayout(), null, "rootComponent", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComponentEClass, UIComponent.class, "UIComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIComponent_Type(), ecorePackage.getEString(), "type", null, 0, 1, UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mvcModelEClass, MVCModel.class, "MVCModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMVCModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, MVCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMVCModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, MVCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMVCModel_Components(), this.getComponent(), null, "components", null, 1, -1, MVCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMVCModel_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, MVCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMVCModel_Entities(), this.getEntities(), null, "entities", null, 0, 1, MVCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Name(), ecorePackage.getEString(), "name", null, 1, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Actions(), this.getAction(), null, "actions", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Views(), this.getControllerView(), null, "views", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_EventActions(), this.getEventAction(), null, "eventActions", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_PreExecutionEvent(), this.getEvent(), null, "preExecutionEvent", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_PostExecutionEvent(), this.getEvent(), null, "postExecutionEvent", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_TriggerEvents(), this.getEvent(), null, "triggerEvents", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerViewEClass, ControllerView.class, "ControllerView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerView_View(), this.getView(), null, "view", null, 1, 1, ControllerView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerView_Models(), this.getModel(), null, "models", null, 0, -1, ControllerView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Models(), this.getModel(), null, "models", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Views(), this.getView(), null, "views", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Events(), this.getEvent(), null, "events", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Controllers(), this.getController(), null, "controllers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Imports(), this.getImport(), null, "imports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventActionEClass, EventAction.class, "EventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventAction_Action(), this.getAction(), null, "action", null, 1, 1, EventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventAction_Events(), this.getEvent(), null, "events", null, 0, -1, EventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLayoutEClass, UILayout.class, "UILayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUILayout_Orientation(), ecorePackage.getEString(), "orientation", null, 0, 1, UILayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUILayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, UILayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUILayout_Components(), this.getUIComponent(), null, "components", null, 0, -1, UILayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUILayout_ImportView(), this.getView(), null, "importView", null, 0, -1, UILayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiInputEClass, UIInput.class, "UIInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIInput_Value(), this.getAttribute(), null, "value", null, 0, 1, UIInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiActionsEClass, UIActions.class, "UIActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIActions_TriggerEvent(), this.getEvent(), null, "triggerEvent", null, 0, 1, UIActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLabelEClass, UILabel.class, "UILabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUILabel_Value(), this.getAttribute(), null, "value", null, 0, 1, UILabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUILabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, UILabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entitiesEClass, Entities.class, "Entities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntities_Entities(), this.getEntity(), null, "entities", null, 0, -1, Entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntities_Imports(), this.getImport(), null, "imports", null, 0, -1, Entities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(associationTypeEEnum, AssociationType.class, "AssociationType");

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// doc
		createDocAnnotations();
	}

	/**
	 * Initializes the annotations for <b>doc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocAnnotations() {
		String source = "doc";	
		addAnnotation
		  (modelEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Es la representaci&oacute;n de la informaci&oacute;n con la cual el sistema opera, por lo tanto gestiona todos los accesos a dicha informaci&oacute;n, tanto consultas como actualizaciones, implementando tambi&eacute;n los privilegios de acceso que se hayan descrito en las especificaciones de la aplicaci&oacute;n (l&oacute;gica de negocio). Env&iacute;a a la \'vista\' aquella parte de la informaci&oacute;n que en cada momento se le solicita para que sea mostrada (t&iacute;picamente a un usuario). Las peticiones de acceso o manipulaci&oacute;n de informaci&oacute;n llegan al \'modelo\' a trav&eacute;s del \'controlador\'. Tomado de <a href=\"http://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador\">MVC</a>"
		   });	
		addAnnotation
		  (getModel_Name(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Nombre del modelo a utilizar"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Representa la Entidad de datos de la aplicaci&oacute;n"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Representa los atributos que contiene la entidad de datos"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Representa las relaciones que existen entre entidades de datos."
		   });	
		addAnnotation
		  (associationTypeEEnum, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Define los tipos de asociaci&oacute;n entre entidades."
		   });	
		addAnnotation
		  (viewEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Presenta el \'modelo\' (informaci&oacute;n y l&oacute;gica de negocio) en un formato adecuado para interactuar (usualmente la interfaz de usuario) por tanto requiere de dicho \'modelo\' la informaci&oacute;n que debe representar como salida. Tomado de <a href=\"http://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador\">MVC</a>"
		   });	
		addAnnotation
		  (uiComponentEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Supertipo de los posibles tipos de componentes que se visualizan dentro de una vista"
		   });	
		addAnnotation
		  (mvcModelEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Define la raiz del modelo a generar"
		   });	
		addAnnotation
		  (getMVCModel_Name(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Nombre de la aplicacion a generar"
		   });	
		addAnnotation
		  (getMVCModel_Version(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Version de la aplicacion a generar"
		   });	
		addAnnotation
		  (getMVCModel_Components(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Contiene el listado de componentes a ser utilizados por la aplicaci&oacute;n "
		   });	
		addAnnotation
		  (controllerEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Responde a eventos (usualmente acciones del usuario) e invoca peticiones al \'modelo\' cuando se hace alguna solicitud sobre la informaci&oacute;n (por ejemplo, editar un documento o un registro en una base de datos). Tambi&eacute;n puede enviar comandos a su \'vista\' asociada si se solicita un cambio en la forma en que se presenta de \'modelo\' (por ejemplo, desplazamiento o scroll por un documento o por los diferentes registros de una base de datos), por tanto se podr&iacute;a decir que el \'controlador\' hace de intermediario entre la \'vista\' y el \'modelo\'. Tomado de <a href=\"http://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador\">MVC</a>"
		   });	
		addAnnotation
		  (eventEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Define los eventos que utiliza la aplicaci&oacute;n para comunicar los diferentes componentes "
		   });	
		addAnnotation
		  (actionEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Define las acciones que posee un controlador, bien sea sobre la vista o sobre el modelo."
		   });	
		addAnnotation
		  (controllerViewEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Relaciona el controlador con las vistas y los modelos."
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Es la agrupacion logica de los proyectos que forman parte de la aplicaci&oacute;n"
		   });	
		addAnnotation
		  (getComponent_Models(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Contiene los modelos que representan los datos que van a ser utilizados en la aplicaci&oacute;n"
		   });	
		addAnnotation
		  (getComponent_Views(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Contiene la definici&oacute;n de las vistas que van a ser utilizadas en la aplicaci&oacute;n"
		   });	
		addAnnotation
		  (getComponent_Events(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Contiene el listado de eventos a ser utilizados por la aplicaci&oacute;n "
		   });	
		addAnnotation
		  (getComponent_Controllers(), 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Contiene el listado de controladores a ser utilizados por la aplicaci&oacute;n "
		   });	
		addAnnotation
		  (eventActionEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Relaciona los eventos de los controladores con sus acciones"
		   });	
		addAnnotation
		  (uiLayoutEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Representa componentes de agrupaci&oacute;n y distribuci&oacute;n de elementos de tipo de interfaz de usuario."
		   });	
		addAnnotation
		  (uiInputEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Representa los elementos de interfaz de usuario que se utilizar&aacute;n para recibir la informaci&oacute;n de entrada en las vistas."
		   });	
		addAnnotation
		  (uiActionsEClass, 
		   source, 
		   new String[] {
			 "Descripci&oacute;n", "Representa los botones en la interfaz de usuario."
		   });
	}

} //MvcPackageImpl
