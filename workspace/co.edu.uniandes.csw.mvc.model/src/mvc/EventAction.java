/**
 */
package mvc;

import annotate.Annotable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.EventAction#getAction <em>Action</em>}</li>
 *   <li>{@link mvc.EventAction#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getEventAction()
 * @model annotation="doc Descripci&oacute;n='Relaciona los eventos de los controladores con sus acciones'"
 * @generated
 */
public interface EventAction extends Annotable {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see mvc.MvcPackage#getEventAction_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link mvc.EventAction#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link mvc.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see mvc.MvcPackage#getEventAction_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

} // EventAction
