/**
 */
package mvc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.UIInput#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getUIInput()
 * @model annotation="doc Descripci&oacute;n='Representa los elementos de interfaz de usuario que se utilizar&aacute;n para recibir la informaci&oacute;n de entrada en las vistas.'"
 * @generated
 */
public interface UIInput extends UIComponent {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Attribute)
	 * @see mvc.MvcPackage#getUIInput_Value()
	 * @model
	 * @generated
	 */
	Attribute getValue();

	/**
	 * Sets the value of the '{@link mvc.UIInput#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Attribute value);

} // UIInput
