/**
 */
package mvc;

import annotate.AnnotatePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mvc.MvcFactory
 * @model kind="package"
 * @generated
 */
public interface MvcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mvc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co.edu.uniandes.csw.mvc/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mvc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MvcPackage eINSTANCE = mvc.impl.MvcPackageImpl.init();

	/**
	 * The meta object id for the '{@link mvc.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ModelImpl
	 * @see mvc.impl.MvcPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ROOT_ENTITY = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ASSOCIATIONS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.EntityImpl
	 * @see mvc.impl.MvcPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENDS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.AttributeImpl
	 * @see mvc.impl.MvcPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.AssociationImpl
	 * @see mvc.impl.MvcPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CONTAINMENT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LOWER_BOUND = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UPPER_BOUND = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ViewImpl
	 * @see mvc.impl.MvcPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ROOT_COMPONENT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.UIComponentImpl <em>UI Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.UIComponentImpl
	 * @see mvc.impl.MvcPackageImpl#getUIComponent()
	 * @generated
	 */
	int UI_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT__TYPE = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UI Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_COMPONENT_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.MVCModelImpl <em>MVC Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.MVCModelImpl
	 * @see mvc.impl.MvcPackageImpl#getMVCModel()
	 * @generated
	 */
	int MVC_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__MODELS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__VIEWS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__EVENTS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__VERSION = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__CONTROLLERS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__COMPONENTS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL__IMPORT_URI = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>MVC Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>MVC Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_MODEL_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ControllerImpl
	 * @see mvc.impl.MvcPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ACTIONS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__VIEWS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__EVENT_ACTIONS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.EventImpl
	 * @see mvc.impl.MvcPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ActionImpl
	 * @see mvc.impl.MvcPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Execution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PRE_EXECUTION_EVENT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post Execution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__POST_EXECUTION_EVENT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TRIGGER_EVENTS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ControllerViewImpl <em>Controller View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ControllerViewImpl
	 * @see mvc.impl.MvcPackageImpl#getControllerView()
	 * @generated
	 */
	int CONTROLLER_VIEW = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIEW__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIEW__VIEW = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIEW__MODELS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIEW_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIEW_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ComponentImpl
	 * @see mvc.impl.MvcPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTROLLERS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.EventActionImpl <em>Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.EventActionImpl
	 * @see mvc.impl.MvcPackageImpl#getEventAction()
	 * @generated
	 */
	int EVENT_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__ANNOTATIONS = AnnotatePackage.ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__ACTION = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__EVENTS = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION_FEATURE_COUNT = AnnotatePackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION_OPERATION_COUNT = AnnotatePackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.UILayoutImpl <em>UI Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.UILayoutImpl
	 * @see mvc.impl.MvcPackageImpl#getUILayout()
	 * @generated
	 */
	int UI_LAYOUT = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__ANNOTATIONS = UI_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__NAME = UI_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__TYPE = UI_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__ORIENTATION = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__COLUMNS = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__COMPONENTS = UI_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import View</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__IMPORT_VIEW = UI_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>UI Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.UIInputImpl <em>UI Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.UIInputImpl
	 * @see mvc.impl.MvcPackageImpl#getUIInput()
	 * @generated
	 */
	int UI_INPUT = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INPUT__ANNOTATIONS = UI_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INPUT__NAME = UI_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INPUT__TYPE = UI_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INPUT__VALUE = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INPUT_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UI Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_INPUT_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.UIActionsImpl <em>UI Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.UIActionsImpl
	 * @see mvc.impl.MvcPackageImpl#getUIActions()
	 * @generated
	 */
	int UI_ACTIONS = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTIONS__ANNOTATIONS = UI_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTIONS__NAME = UI_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTIONS__TYPE = UI_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTIONS__TRIGGER_EVENT = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTIONS_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UI Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ACTIONS_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.UILabelImpl <em>UI Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.UILabelImpl
	 * @see mvc.impl.MvcPackageImpl#getUILabel()
	 * @generated
	 */
	int UI_LABEL = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LABEL__ANNOTATIONS = UI_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LABEL__NAME = UI_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LABEL__TYPE = UI_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LABEL__VALUE = UI_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LABEL__TEXT = UI_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LABEL_FEATURE_COUNT = UI_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UI Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LABEL_OPERATION_COUNT = UI_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.AssociationType <em>Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.AssociationType
	 * @see mvc.impl.MvcPackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link mvc.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see mvc.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link mvc.Model#getRootEntity <em>Root Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Entity</em>'.
	 * @see mvc.Model#getRootEntity()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_RootEntity();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.Model#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see mvc.Model#getAssociations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Associations();

	/**
	 * Returns the meta object for class '{@link mvc.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see mvc.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see mvc.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link mvc.Entity#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see mvc.Entity#getExtends()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Extends();

	/**
	 * Returns the meta object for class '{@link mvc.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see mvc.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvc.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link mvc.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see mvc.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link mvc.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see mvc.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Association#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Association#getName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Association#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see mvc.Association#isContainment()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Containment();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Association#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see mvc.Association#getLowerBound()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Association#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see mvc.Association#getUpperBound()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Association#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvc.Association#getType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Type();

	/**
	 * Returns the meta object for the reference '{@link mvc.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mvc.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for class '{@link mvc.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see mvc.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link mvc.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mvc.View#getRootComponent <em>Root Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Component</em>'.
	 * @see mvc.View#getRootComponent()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_RootComponent();

	/**
	 * Returns the meta object for class '{@link mvc.UIComponent <em>UI Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Component</em>'.
	 * @see mvc.UIComponent
	 * @generated
	 */
	EClass getUIComponent();

	/**
	 * Returns the meta object for the attribute '{@link mvc.UIComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.UIComponent#getName()
	 * @see #getUIComponent()
	 * @generated
	 */
	EAttribute getUIComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvc.UIComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvc.UIComponent#getType()
	 * @see #getUIComponent()
	 * @generated
	 */
	EAttribute getUIComponent_Type();

	/**
	 * Returns the meta object for class '{@link mvc.MVCModel <em>MVC Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MVC Model</em>'.
	 * @see mvc.MVCModel
	 * @generated
	 */
	EClass getMVCModel();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MVCModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.MVCModel#getName()
	 * @see #getMVCModel()
	 * @generated
	 */
	EAttribute getMVCModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MVCModel#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see mvc.MVCModel#getModels()
	 * @see #getMVCModel()
	 * @generated
	 */
	EReference getMVCModel_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MVCModel#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see mvc.MVCModel#getViews()
	 * @see #getMVCModel()
	 * @generated
	 */
	EReference getMVCModel_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MVCModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see mvc.MVCModel#getEvents()
	 * @see #getMVCModel()
	 * @generated
	 */
	EReference getMVCModel_Events();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MVCModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mvc.MVCModel#getVersion()
	 * @see #getMVCModel()
	 * @generated
	 */
	EAttribute getMVCModel_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MVCModel#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see mvc.MVCModel#getControllers()
	 * @see #getMVCModel()
	 * @generated
	 */
	EReference getMVCModel_Controllers();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MVCModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see mvc.MVCModel#getComponents()
	 * @see #getMVCModel()
	 * @generated
	 */
	EReference getMVCModel_Components();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MVCModel#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see mvc.MVCModel#getImportURI()
	 * @see #getMVCModel()
	 * @generated
	 */
	EAttribute getMVCModel_ImportURI();

	/**
	 * Returns the meta object for class '{@link mvc.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see mvc.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Controller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Controller#getName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.Controller#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see mvc.Controller#getActions()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.Controller#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see mvc.Controller#getViews()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.Controller#getEventActions <em>Event Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Actions</em>'.
	 * @see mvc.Controller#getEventActions()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_EventActions();

	/**
	 * Returns the meta object for class '{@link mvc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see mvc.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link mvc.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see mvc.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the reference '{@link mvc.Action#getPreExecutionEvent <em>Pre Execution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Execution Event</em>'.
	 * @see mvc.Action#getPreExecutionEvent()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_PreExecutionEvent();

	/**
	 * Returns the meta object for the reference '{@link mvc.Action#getPostExecutionEvent <em>Post Execution Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Execution Event</em>'.
	 * @see mvc.Action#getPostExecutionEvent()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_PostExecutionEvent();

	/**
	 * Returns the meta object for the reference list '{@link mvc.Action#getTriggerEvents <em>Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger Events</em>'.
	 * @see mvc.Action#getTriggerEvents()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_TriggerEvents();

	/**
	 * Returns the meta object for class '{@link mvc.ControllerView <em>Controller View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller View</em>'.
	 * @see mvc.ControllerView
	 * @generated
	 */
	EClass getControllerView();

	/**
	 * Returns the meta object for the reference '{@link mvc.ControllerView#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see mvc.ControllerView#getView()
	 * @see #getControllerView()
	 * @generated
	 */
	EReference getControllerView_View();

	/**
	 * Returns the meta object for the reference list '{@link mvc.ControllerView#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see mvc.ControllerView#getModels()
	 * @see #getControllerView()
	 * @generated
	 */
	EReference getControllerView_Models();

	/**
	 * Returns the meta object for class '{@link mvc.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see mvc.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link mvc.Component#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controllers</em>'.
	 * @see mvc.Component#getControllers()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Controllers();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link mvc.EventAction <em>Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Action</em>'.
	 * @see mvc.EventAction
	 * @generated
	 */
	EClass getEventAction();

	/**
	 * Returns the meta object for the reference '{@link mvc.EventAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see mvc.EventAction#getAction()
	 * @see #getEventAction()
	 * @generated
	 */
	EReference getEventAction_Action();

	/**
	 * Returns the meta object for the reference list '{@link mvc.EventAction#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see mvc.EventAction#getEvents()
	 * @see #getEventAction()
	 * @generated
	 */
	EReference getEventAction_Events();

	/**
	 * Returns the meta object for class '{@link mvc.UILayout <em>UI Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Layout</em>'.
	 * @see mvc.UILayout
	 * @generated
	 */
	EClass getUILayout();

	/**
	 * Returns the meta object for the attribute '{@link mvc.UILayout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see mvc.UILayout#getOrientation()
	 * @see #getUILayout()
	 * @generated
	 */
	EAttribute getUILayout_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link mvc.UILayout#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see mvc.UILayout#getColumns()
	 * @see #getUILayout()
	 * @generated
	 */
	EAttribute getUILayout_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.UILayout#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see mvc.UILayout#getComponents()
	 * @see #getUILayout()
	 * @generated
	 */
	EReference getUILayout_Components();

	/**
	 * Returns the meta object for the reference list '{@link mvc.UILayout#getImportView <em>Import View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import View</em>'.
	 * @see mvc.UILayout#getImportView()
	 * @see #getUILayout()
	 * @generated
	 */
	EReference getUILayout_ImportView();

	/**
	 * Returns the meta object for class '{@link mvc.UIInput <em>UI Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Input</em>'.
	 * @see mvc.UIInput
	 * @generated
	 */
	EClass getUIInput();

	/**
	 * Returns the meta object for the reference '{@link mvc.UIInput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see mvc.UIInput#getValue()
	 * @see #getUIInput()
	 * @generated
	 */
	EReference getUIInput_Value();

	/**
	 * Returns the meta object for class '{@link mvc.UIActions <em>UI Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Actions</em>'.
	 * @see mvc.UIActions
	 * @generated
	 */
	EClass getUIActions();

	/**
	 * Returns the meta object for the reference '{@link mvc.UIActions#getTriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Event</em>'.
	 * @see mvc.UIActions#getTriggerEvent()
	 * @see #getUIActions()
	 * @generated
	 */
	EReference getUIActions_TriggerEvent();

	/**
	 * Returns the meta object for class '{@link mvc.UILabel <em>UI Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Label</em>'.
	 * @see mvc.UILabel
	 * @generated
	 */
	EClass getUILabel();

	/**
	 * Returns the meta object for the reference '{@link mvc.UILabel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see mvc.UILabel#getValue()
	 * @see #getUILabel()
	 * @generated
	 */
	EReference getUILabel_Value();

	/**
	 * Returns the meta object for the attribute '{@link mvc.UILabel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mvc.UILabel#getText()
	 * @see #getUILabel()
	 * @generated
	 */
	EAttribute getUILabel_Text();

	/**
	 * Returns the meta object for enum '{@link mvc.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Type</em>'.
	 * @see mvc.AssociationType
	 * @generated
	 */
	EEnum getAssociationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MvcFactory getMvcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mvc.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ModelImpl
		 * @see mvc.impl.MvcPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Root Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ROOT_ENTITY = eINSTANCE.getModel_RootEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ASSOCIATIONS = eINSTANCE.getModel_Associations();

		/**
		 * The meta object literal for the '{@link mvc.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.EntityImpl
		 * @see mvc.impl.MvcPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__EXTENDS = eINSTANCE.getEntity_Extends();

		/**
		 * The meta object literal for the '{@link mvc.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.AttributeImpl
		 * @see mvc.impl.MvcPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link mvc.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.AssociationImpl
		 * @see mvc.impl.MvcPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NAME = eINSTANCE.getAssociation_Name();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__CONTAINMENT = eINSTANCE.getAssociation_Containment();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__LOWER_BOUND = eINSTANCE.getAssociation_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__UPPER_BOUND = eINSTANCE.getAssociation_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '{@link mvc.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ViewImpl
		 * @see mvc.impl.MvcPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Root Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__ROOT_COMPONENT = eINSTANCE.getView_RootComponent();

		/**
		 * The meta object literal for the '{@link mvc.impl.UIComponentImpl <em>UI Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.UIComponentImpl
		 * @see mvc.impl.MvcPackageImpl#getUIComponent()
		 * @generated
		 */
		EClass UI_COMPONENT = eINSTANCE.getUIComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT__NAME = eINSTANCE.getUIComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_COMPONENT__TYPE = eINSTANCE.getUIComponent_Type();

		/**
		 * The meta object literal for the '{@link mvc.impl.MVCModelImpl <em>MVC Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.MVCModelImpl
		 * @see mvc.impl.MvcPackageImpl#getMVCModel()
		 * @generated
		 */
		EClass MVC_MODEL = eINSTANCE.getMVCModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_MODEL__NAME = eINSTANCE.getMVCModel_Name();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_MODEL__MODELS = eINSTANCE.getMVCModel_Models();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_MODEL__VIEWS = eINSTANCE.getMVCModel_Views();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_MODEL__EVENTS = eINSTANCE.getMVCModel_Events();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_MODEL__VERSION = eINSTANCE.getMVCModel_Version();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_MODEL__CONTROLLERS = eINSTANCE.getMVCModel_Controllers();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_MODEL__COMPONENTS = eINSTANCE.getMVCModel_Components();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_MODEL__IMPORT_URI = eINSTANCE.getMVCModel_ImportURI();

		/**
		 * The meta object literal for the '{@link mvc.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ControllerImpl
		 * @see mvc.impl.MvcPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__ACTIONS = eINSTANCE.getController_Actions();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__VIEWS = eINSTANCE.getController_Views();

		/**
		 * The meta object literal for the '<em><b>Event Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__EVENT_ACTIONS = eINSTANCE.getController_EventActions();

		/**
		 * The meta object literal for the '{@link mvc.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.EventImpl
		 * @see mvc.impl.MvcPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link mvc.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ActionImpl
		 * @see mvc.impl.MvcPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Pre Execution Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PRE_EXECUTION_EVENT = eINSTANCE.getAction_PreExecutionEvent();

		/**
		 * The meta object literal for the '<em><b>Post Execution Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__POST_EXECUTION_EVENT = eINSTANCE.getAction_PostExecutionEvent();

		/**
		 * The meta object literal for the '<em><b>Trigger Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TRIGGER_EVENTS = eINSTANCE.getAction_TriggerEvents();

		/**
		 * The meta object literal for the '{@link mvc.impl.ControllerViewImpl <em>Controller View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ControllerViewImpl
		 * @see mvc.impl.MvcPackageImpl#getControllerView()
		 * @generated
		 */
		EClass CONTROLLER_VIEW = eINSTANCE.getControllerView();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_VIEW__VIEW = eINSTANCE.getControllerView_View();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_VIEW__MODELS = eINSTANCE.getControllerView_Models();

		/**
		 * The meta object literal for the '{@link mvc.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ComponentImpl
		 * @see mvc.impl.MvcPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTROLLERS = eINSTANCE.getComponent_Controllers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link mvc.impl.EventActionImpl <em>Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.EventActionImpl
		 * @see mvc.impl.MvcPackageImpl#getEventAction()
		 * @generated
		 */
		EClass EVENT_ACTION = eINSTANCE.getEventAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ACTION__ACTION = eINSTANCE.getEventAction_Action();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ACTION__EVENTS = eINSTANCE.getEventAction_Events();

		/**
		 * The meta object literal for the '{@link mvc.impl.UILayoutImpl <em>UI Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.UILayoutImpl
		 * @see mvc.impl.MvcPackageImpl#getUILayout()
		 * @generated
		 */
		EClass UI_LAYOUT = eINSTANCE.getUILayout();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_LAYOUT__ORIENTATION = eINSTANCE.getUILayout_Orientation();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_LAYOUT__COLUMNS = eINSTANCE.getUILayout_Columns();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LAYOUT__COMPONENTS = eINSTANCE.getUILayout_Components();

		/**
		 * The meta object literal for the '<em><b>Import View</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LAYOUT__IMPORT_VIEW = eINSTANCE.getUILayout_ImportView();

		/**
		 * The meta object literal for the '{@link mvc.impl.UIInputImpl <em>UI Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.UIInputImpl
		 * @see mvc.impl.MvcPackageImpl#getUIInput()
		 * @generated
		 */
		EClass UI_INPUT = eINSTANCE.getUIInput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_INPUT__VALUE = eINSTANCE.getUIInput_Value();

		/**
		 * The meta object literal for the '{@link mvc.impl.UIActionsImpl <em>UI Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.UIActionsImpl
		 * @see mvc.impl.MvcPackageImpl#getUIActions()
		 * @generated
		 */
		EClass UI_ACTIONS = eINSTANCE.getUIActions();

		/**
		 * The meta object literal for the '<em><b>Trigger Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ACTIONS__TRIGGER_EVENT = eINSTANCE.getUIActions_TriggerEvent();

		/**
		 * The meta object literal for the '{@link mvc.impl.UILabelImpl <em>UI Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.UILabelImpl
		 * @see mvc.impl.MvcPackageImpl#getUILabel()
		 * @generated
		 */
		EClass UI_LABEL = eINSTANCE.getUILabel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_LABEL__VALUE = eINSTANCE.getUILabel_Value();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_LABEL__TEXT = eINSTANCE.getUILabel_Text();

		/**
		 * The meta object literal for the '{@link mvc.AssociationType <em>Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.AssociationType
		 * @see mvc.impl.MvcPackageImpl#getAssociationType()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

	}

} //MvcPackage
