/**
 */
package mvc;

import annotate.Annotable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mvc.ControllerView#getView <em>View</em>}</li>
 *   <li>{@link mvc.ControllerView#getModels <em>Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see mvc.MvcPackage#getControllerView()
 * @model annotation="doc Descripci&oacute;n='Relaciona el controlador con las vistas y los modelos.'"
 * @generated
 */
public interface ControllerView extends Annotable {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see mvc.MvcPackage#getControllerView_View()
	 * @model required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link mvc.ControllerView#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link mvc.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see mvc.MvcPackage#getControllerView_Models()
	 * @model
	 * @generated
	 */
	EList<Model> getModels();

} // ControllerView
