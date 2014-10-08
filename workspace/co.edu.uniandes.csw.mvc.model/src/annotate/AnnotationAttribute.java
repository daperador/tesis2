/**
 */
package annotate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link annotate.AnnotationAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link annotate.AnnotationAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see annotate.AnnotatePackage#getAnnotationAttribute()
 * @model
 * @generated
 */
public interface AnnotationAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AnnotationTypeAttribute)
	 * @see annotate.AnnotatePackage#getAnnotationAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	AnnotationTypeAttribute getAttribute();

	/**
	 * Sets the value of the '{@link annotate.AnnotationAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AnnotationTypeAttribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AnnotationAttributeValue)
	 * @see annotate.AnnotatePackage#getAnnotationAttribute_Value()
	 * @model containment="true"
	 * @generated
	 */
	AnnotationAttributeValue getValue();

	/**
	 * Sets the value of the '{@link annotate.AnnotationAttribute#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AnnotationAttributeValue value);

} // AnnotationAttribute
