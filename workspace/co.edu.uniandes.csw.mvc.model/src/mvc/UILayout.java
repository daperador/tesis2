/**
 */
package mvc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.UILayout#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mvc.UILayout#getColumns <em>Columns</em>}</li>
 *   <li>{@link mvc.UILayout#getComponents <em>Components</em>}</li>
 *   <li>{@link mvc.UILayout#getImportView <em>Import View</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getUILayout()
 * @model annotation="doc Descripci&oacute;n='Representa componentes de agrupaci&oacute;n y distribuci&oacute;n de elementos de tipo de interfaz de usuario.'"
 * @generated
 */
public interface UILayout extends UIComponent {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see mvc.MvcPackage#getUILayout_Orientation()
	 * @model
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link mvc.UILayout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see mvc.MvcPackage#getUILayout_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link mvc.UILayout#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.UIComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see mvc.MvcPackage#getUILayout_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Import View</b></em>' reference list.
	 * The list contents are of type {@link mvc.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import View</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import View</em>' reference list.
	 * @see mvc.MvcPackage#getUILayout_ImportView()
	 * @model
	 * @generated
	 */
	EList<View> getImportView();

} // UILayout
