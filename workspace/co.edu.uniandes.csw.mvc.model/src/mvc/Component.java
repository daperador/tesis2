/**
 */
package mvc;

import annotate.Annotable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.Component#getName <em>Name</em>}</li>
 *   <li>{@link mvc.Component#getModels <em>Models</em>}</li>
 *   <li>{@link mvc.Component#getViews <em>Views</em>}</li>
 *   <li>{@link mvc.Component#getEvents <em>Events</em>}</li>
 *   <li>{@link mvc.Component#getControllers <em>Controllers</em>}</li>
 *   <li>{@link mvc.Component#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getComponent()
 * @model annotation="doc Descripci&oacute;n='Es la agrupacion logica de los proyectos que forman parte de la aplicaci&oacute;n'"
 * @generated
 */
public interface Component extends Annotable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mvc.MvcPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see mvc.MvcPackage#getComponent_Models()
	 * @model containment="true"
	 *        annotation="doc Descripci&oacute;n='Contiene los modelos que representan los datos que van a ser utilizados en la aplicaci&oacute;n'"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see mvc.MvcPackage#getComponent_Views()
	 * @model containment="true"
	 *        annotation="doc Descripci&oacute;n='Contiene la definici&oacute;n de las vistas que van a ser utilizadas en la aplicaci&oacute;n'"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see mvc.MvcPackage#getComponent_Events()
	 * @model containment="true"
	 *        annotation="doc Descripci&oacute;n='Contiene el listado de eventos a ser utilizados por la aplicaci&oacute;n '"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Controller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see mvc.MvcPackage#getComponent_Controllers()
	 * @model containment="true"
	 *        annotation="doc Descripci&oacute;n='Contiene el listado de controladores a ser utilizados por la aplicaci&oacute;n '"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see mvc.MvcPackage#getComponent_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // Component
