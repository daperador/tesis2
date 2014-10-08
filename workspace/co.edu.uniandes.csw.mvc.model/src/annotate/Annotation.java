/**
 */
package annotate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link annotate.Annotation#getAnnotationType <em>Annotation Type</em>}</li>
 *   <li>{@link annotate.Annotation#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see annotate.AnnotatePackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Type</em>' reference.
	 * @see #setAnnotationType(AnnotationType)
	 * @see annotate.AnnotatePackage#getAnnotation_AnnotationType()
	 * @model required="true"
	 * @generated
	 */
	AnnotationType getAnnotationType();

	/**
	 * Sets the value of the '{@link annotate.Annotation#getAnnotationType <em>Annotation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Type</em>' reference.
	 * @see #getAnnotationType()
	 * @generated
	 */
	void setAnnotationType(AnnotationType value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link annotate.AnnotationAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see annotate.AnnotatePackage#getAnnotation_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationAttribute> getAttributes();

} // Annotation
