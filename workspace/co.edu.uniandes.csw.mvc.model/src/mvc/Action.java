/**
 */
package mvc;

import annotate.Annotable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.Action#getName <em>Name</em>}</li>
 *   <li>{@link mvc.Action#getPreExecutionEvent <em>Pre Execution Event</em>}</li>
 *   <li>{@link mvc.Action#getPostExecutionEvent <em>Post Execution Event</em>}</li>
 *   <li>{@link mvc.Action#getTriggerEvents <em>Trigger Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getAction()
 * @model annotation="doc Descripci&oacute;n='Define las acciones que posee un controlador, bien sea sobre la vista o sobre el modelo.'"
 * @generated
 */
public interface Action extends Annotable {
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
	 * @see mvc.MvcPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pre Execution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Execution Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Execution Event</em>' reference.
	 * @see #setPreExecutionEvent(Event)
	 * @see mvc.MvcPackage#getAction_PreExecutionEvent()
	 * @model
	 * @generated
	 */
	Event getPreExecutionEvent();

	/**
	 * Sets the value of the '{@link mvc.Action#getPreExecutionEvent <em>Pre Execution Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Execution Event</em>' reference.
	 * @see #getPreExecutionEvent()
	 * @generated
	 */
	void setPreExecutionEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Post Execution Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Execution Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Execution Event</em>' reference.
	 * @see #setPostExecutionEvent(Event)
	 * @see mvc.MvcPackage#getAction_PostExecutionEvent()
	 * @model
	 * @generated
	 */
	Event getPostExecutionEvent();

	/**
	 * Sets the value of the '{@link mvc.Action#getPostExecutionEvent <em>Post Execution Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Execution Event</em>' reference.
	 * @see #getPostExecutionEvent()
	 * @generated
	 */
	void setPostExecutionEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Trigger Events</b></em>' reference list.
	 * The list contents are of type {@link mvc.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Events</em>' reference list.
	 * @see mvc.MvcPackage#getAction_TriggerEvents()
	 * @model
	 * @generated
	 */
	EList<Event> getTriggerEvents();

} // Action
