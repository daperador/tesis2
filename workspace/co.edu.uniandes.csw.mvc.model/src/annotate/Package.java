/**
 */
package annotate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link annotate.Package#getTypes <em>Types</em>}</li>
 *   <li>{@link annotate.Package#getAnnotationTypes <em>Annotation Types</em>}</li>
 *   <li>{@link annotate.Package#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see annotate.AnnotatePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Annotable {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link annotate.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see annotate.AnnotatePackage#getPackage_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Annotation Types</b></em>' containment reference list.
	 * The list contents are of type {@link annotate.AnnotationType}.
	 * It is bidirectional and its opposite is '{@link annotate.AnnotationType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Types</em>' containment reference list.
	 * @see annotate.AnnotatePackage#getPackage_AnnotationTypes()
	 * @see annotate.AnnotationType#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<AnnotationType> getAnnotationTypes();

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
	 * @see annotate.AnnotatePackage#getPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link annotate.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Package
