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
 *   <li>{@link mvc.MVCModel#getVersion <em>Version</em>}</li>
 *   <li>{@link mvc.MVCModel#getComponents <em>Components</em>}</li>
 *   <li>{@link mvc.MVCModel#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link mvc.MVCModel#getEntities <em>Entities</em>}</li>
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
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link mvc.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see mvc.MvcPackage#getMVCModel_Components()
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference.
	 * @see #setEntities(Entities)
	 * @see mvc.MvcPackage#getMVCModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	Entities getEntities();

	/**
	 * Sets the value of the '{@link mvc.MVCModel#getEntities <em>Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entities</em>' containment reference.
	 * @see #getEntities()
	 * @generated
	 */
	void setEntities(Entities value);

} // MVCModel
