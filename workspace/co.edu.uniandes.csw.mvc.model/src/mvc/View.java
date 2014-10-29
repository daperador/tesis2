/**
 */
package mvc;

import annotate.Annotable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.View#getName <em>Name</em>}</li>
 *   <li>{@link mvc.View#getRootComponent <em>Root Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getView()
 * @model annotation="doc Descripci&oacute;n='Presenta el \'modelo\' (informaci&oacute;n y l&oacute;gica de negocio) en un formato adecuado para interactuar (usualmente la interfaz de usuario) por tanto requiere de dicho \'modelo\' la informaci&oacute;n que debe representar como salida. Tomado de <a href=\"http://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador\">MVC</a>'"
 * @generated
 */
public interface View extends Annotable {
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
	 * @see mvc.MvcPackage#getView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.View#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Component</em>' containment reference.
	 * @see #setRootComponent(UILayout)
	 * @see mvc.MvcPackage#getView_RootComponent()
	 * @model containment="true"
	 * @generated
	 */
	UILayout getRootComponent();

	/**
	 * Sets the value of the '{@link mvc.View#getRootComponent <em>Root Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Component</em>' containment reference.
	 * @see #getRootComponent()
	 * @generated
	 */
	void setRootComponent(UILayout value);

} // View
