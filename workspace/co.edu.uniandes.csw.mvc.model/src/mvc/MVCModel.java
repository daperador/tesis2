/**
 */
package mvc;

import annotate.Annotable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MVC Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.MVCModel#getName <em>Name</em>}</li>
 *   <li>{@link mvc.MVCModel#getModels <em>Models</em>}</li>
 *   <li>{@link mvc.MVCModel#getViews <em>Views</em>}</li>
 *   <li>{@link mvc.MVCModel#getEvents <em>Events</em>}</li>
 *   <li>{@link mvc.MVCModel#getVersion <em>Version</em>}</li>
 *   <li>{@link mvc.MVCModel#getControllers <em>Controllers</em>}</li>
 *   <li>{@link mvc.MVCModel#getComponents <em>Components</em>}</li>
 *   <li>{@link mvc.MVCModel#getImportURI <em>Import URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getMVCModel()
 * @model annotation="doc Descripci&oacute;n='Define la raiz del modelo a generar'"
 * @generated
 */
public interface MVCModel extends Annotable {
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
	 * @see mvc.MvcPackage#getMVCModel_Name()
	 * @model annotation="doc Descripci&oacute;n='Nombre de la aplicacion a generar'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.MVCModel#getName <em>Name</em>}' attribute.
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
	 * @see mvc.MvcPackage#getMVCModel_Models()
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
	 * @see mvc.MvcPackage#getMVCModel_Views()
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
	 * @see mvc.MvcPackage#getMVCModel_Events()
	 * @model containment="true"
	 *        annotation="doc Descripci&oacute;n='Contiene el listado de eventos a ser utilizados por la aplicaci&oacute;n '"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mvc.MvcPackage#getMVCModel_Version()
	 * @model annotation="doc Descripci&oacute;n='Version de la aplicacion a generar'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mvc.MVCModel#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see mvc.MvcPackage#getMVCModel_Controllers()
	 * @model containment="true"
	 *        annotation="doc Descripci&oacute;n='Contiene el listado de controladores a ser utilizados por la aplicaci&oacute;n '"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see mvc.MvcPackage#getMVCModel_Components()
	 * @model containment="true" required="true"
	 *        annotation="doc Descripci&oacute;n='Contiene el listado de componentes a ser utilizados por la aplicaci&oacute;n '"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see mvc.MvcPackage#getMVCModel_ImportURI()
	 * @model
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link mvc.MVCModel#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

} // MVCModel
