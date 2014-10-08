/**
 */
package mvc;

import annotate.Annotable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.Controller#getName <em>Name</em>}</li>
 *   <li>{@link mvc.Controller#getActions <em>Actions</em>}</li>
 *   <li>{@link mvc.Controller#getViews <em>Views</em>}</li>
 *   <li>{@link mvc.Controller#getEventActions <em>Event Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getController()
 * @model annotation="doc Descripci&oacute;n='Responde a eventos (usualmente acciones del usuario) e invoca peticiones al \'modelo\' cuando se hace alguna solicitud sobre la informaci&oacute;n (por ejemplo, editar un documento o un registro en una base de datos). Tambi&eacute;n puede enviar comandos a su \'vista\' asociada si se solicita un cambio en la forma en que se presenta de \'modelo\' (por ejemplo, desplazamiento o scroll por un documento o por los diferentes registros de una base de datos), por tanto se podr&iacute;a decir que el \'controlador\' hace de intermediario entre la \'vista\' y el \'modelo\'. Tomado de <a href=\"http://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador\">MVC</a>'"
 * @generated
 */
public interface Controller extends Annotable {
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
	 * @see mvc.MvcPackage#getController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.Controller#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see mvc.MvcPackage#getController_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.ControllerView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see mvc.MvcPackage#getController_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControllerView> getViews();

	/**
	 * Returns the value of the '<em><b>Event Actions</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.EventAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Actions</em>' containment reference list.
	 * @see mvc.MvcPackage#getController_EventActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventAction> getEventActions();

} // Controller
