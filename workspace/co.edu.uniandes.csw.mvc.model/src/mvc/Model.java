/**
 */
package mvc;

import annotate.Annotable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.Model#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link mvc.Model#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getModel()
 * @model annotation="doc Descripci&oacute;n='Es la representaci&oacute;n de la informaci&oacute;n con la cual el sistema opera, por lo tanto gestiona todos los accesos a dicha informaci&oacute;n, tanto consultas como actualizaciones, implementando tambi&eacute;n los privilegios de acceso que se hayan descrito en las especificaciones de la aplicaci&oacute;n (l&oacute;gica de negocio). Env&iacute;a a la \'vista\' aquella parte de la informaci&oacute;n que en cada momento se le solicita para que sea mostrada (t&iacute;picamente a un usuario). Las peticiones de acceso o manipulaci&oacute;n de informaci&oacute;n llegan al \'modelo\' a trav&eacute;s del \'controlador\'. Tomado de <a href=\"http://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador\">MVC</a>'"
 * @generated
 */
public interface Model extends Annotable {
	/**
	 * Returns the value of the '<em><b>Root Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Entity</em>' reference.
	 * @see #setRootEntity(Entity)
	 * @see mvc.MvcPackage#getModel_RootEntity()
	 * @model
	 * @generated
	 */
	Entity getRootEntity();

	/**
	 * Sets the value of the '{@link mvc.Model#getRootEntity <em>Root Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Entity</em>' reference.
	 * @see #getRootEntity()
	 * @generated
	 */
	void setRootEntity(Entity value);

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
	 * @see mvc.MvcPackage#getModel_Name()
	 * @model annotation="doc Descripci&oacute;n='Nombre del modelo a utilizar'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Model
