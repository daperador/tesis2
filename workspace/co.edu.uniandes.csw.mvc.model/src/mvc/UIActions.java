/**
 */
package mvc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.UIActions#getTriggerEvent <em>Trigger Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getUIActions()
 * @model annotation="doc Descripci&oacute;n='Representa los botones en la interfaz de usuario.'"
 * @generated
 */
public interface UIActions extends UIComponent {
	/**
	 * Returns the value of the '<em><b>Trigger Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Event</em>' reference.
	 * @see #setTriggerEvent(Event)
	 * @see mvc.MvcPackage#getUIActions_TriggerEvent()
	 * @model
	 * @generated
	 */
	Event getTriggerEvent();

	/**
	 * Sets the value of the '{@link mvc.UIActions#getTriggerEvent <em>Trigger Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Event</em>' reference.
	 * @see #getTriggerEvent()
	 * @generated
	 */
	void setTriggerEvent(Event value);

} // UIActions
