/**
 */
package annotate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see annotate.AnnotateFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co.edu.uniandes.csw.mvc.annotate/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annotate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotatePackage eINSTANCE = annotate.impl.AnnotatePackageImpl.init();

	/**
	 * The meta object id for the '{@link annotate.impl.AnnotableImpl <em>Annotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.AnnotableImpl
	 * @see annotate.impl.AnnotatePackageImpl#getAnnotable()
	 * @generated
	 */
	int ANNOTABLE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link annotate.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.AnnotationImpl
	 * @see annotate.impl.AnnotatePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Annotation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link annotate.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.PackageImpl
	 * @see annotate.impl.AnnotatePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ANNOTATIONS = ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TYPES = ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ANNOTATION_TYPES = ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link annotate.impl.AnnotationTypeAttributeImpl <em>Annotation Type Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.AnnotationTypeAttributeImpl
	 * @see annotate.impl.AnnotatePackageImpl#getAnnotationTypeAttribute()
	 * @generated
	 */
	int ANNOTATION_TYPE_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Annotation Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link annotate.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.TypeImpl
	 * @see annotate.impl.AnnotatePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTES = ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link annotate.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.AnnotationTypeImpl
	 * @see annotate.impl.AnnotatePackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link annotate.impl.AnnotationAttributeImpl <em>Annotation Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.AnnotationAttributeImpl
	 * @see annotate.impl.AnnotatePackageImpl#getAnnotationAttribute()
	 * @generated
	 */
	int ANNOTATION_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ATTRIBUTE__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link annotate.impl.AnnotationAttributeValueImpl <em>Annotation Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.AnnotationAttributeValueImpl
	 * @see annotate.impl.AnnotatePackageImpl#getAnnotationAttributeValue()
	 * @generated
	 */
	int ANNOTATION_ATTRIBUTE_VALUE = 7;

	/**
	 * The number of structural features of the '<em>Annotation Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ATTRIBUTE_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Annotation Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ATTRIBUTE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link annotate.impl.SimpleValueImpl <em>Simple Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.SimpleValueImpl
	 * @see annotate.impl.AnnotatePackageImpl#getSimpleValue()
	 * @generated
	 */
	int SIMPLE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE__VALUE = ANNOTATION_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_FEATURE_COUNT = ANNOTATION_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_OPERATION_COUNT = ANNOTATION_ATTRIBUTE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link annotate.impl.ComplexValueImpl <em>Complex Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see annotate.impl.ComplexValueImpl
	 * @see annotate.impl.AnnotatePackageImpl#getComplexValue()
	 * @generated
	 */
	int COMPLEX_VALUE = 9;

	/**
	 * The number of structural features of the '<em>Complex Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_FEATURE_COUNT = ANNOTATION_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_OPERATION_COUNT = ANNOTATION_ATTRIBUTE_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link annotate.Annotable <em>Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotable</em>'.
	 * @see annotate.Annotable
	 * @generated
	 */
	EClass getAnnotable();

	/**
	 * Returns the meta object for the containment reference list '{@link annotate.Annotable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see annotate.Annotable#getAnnotations()
	 * @see #getAnnotable()
	 * @generated
	 */
	EReference getAnnotable_Annotations();

	/**
	 * Returns the meta object for class '{@link annotate.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see annotate.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link annotate.Annotation#getAnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotation Type</em>'.
	 * @see annotate.Annotation#getAnnotationType()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotationType();

	/**
	 * Returns the meta object for the containment reference list '{@link annotate.Annotation#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see annotate.Annotation#getAttributes()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Attributes();

	/**
	 * Returns the meta object for class '{@link annotate.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see annotate.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link annotate.Package#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see annotate.Package#getTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link annotate.Package#getAnnotationTypes <em>Annotation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Types</em>'.
	 * @see annotate.Package#getAnnotationTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_AnnotationTypes();

	/**
	 * Returns the meta object for the attribute '{@link annotate.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see annotate.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for class '{@link annotate.AnnotationTypeAttribute <em>Annotation Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Attribute</em>'.
	 * @see annotate.AnnotationTypeAttribute
	 * @generated
	 */
	EClass getAnnotationTypeAttribute();

	/**
	 * Returns the meta object for the reference '{@link annotate.AnnotationTypeAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see annotate.AnnotationTypeAttribute#getType()
	 * @see #getAnnotationTypeAttribute()
	 * @generated
	 */
	EReference getAnnotationTypeAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link annotate.AnnotationTypeAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see annotate.AnnotationTypeAttribute#getName()
	 * @see #getAnnotationTypeAttribute()
	 * @generated
	 */
	EAttribute getAnnotationTypeAttribute_Name();

	/**
	 * Returns the meta object for class '{@link annotate.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see annotate.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link annotate.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see annotate.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link annotate.Type#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see annotate.Type#getAttributes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Attributes();

	/**
	 * Returns the meta object for class '{@link annotate.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see annotate.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for the container reference '{@link annotate.AnnotationType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see annotate.AnnotationType#getPackage()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Package();

	/**
	 * Returns the meta object for the attribute '{@link annotate.AnnotationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see annotate.AnnotationType#getName()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link annotate.AnnotationType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see annotate.AnnotationType#getAttributes()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link annotate.AnnotationType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see annotate.AnnotationType#getContext()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Context();

	/**
	 * Returns the meta object for class '{@link annotate.AnnotationAttribute <em>Annotation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Attribute</em>'.
	 * @see annotate.AnnotationAttribute
	 * @generated
	 */
	EClass getAnnotationAttribute();

	/**
	 * Returns the meta object for the reference '{@link annotate.AnnotationAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see annotate.AnnotationAttribute#getAttribute()
	 * @see #getAnnotationAttribute()
	 * @generated
	 */
	EReference getAnnotationAttribute_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link annotate.AnnotationAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see annotate.AnnotationAttribute#getValue()
	 * @see #getAnnotationAttribute()
	 * @generated
	 */
	EReference getAnnotationAttribute_Value();

	/**
	 * Returns the meta object for class '{@link annotate.AnnotationAttributeValue <em>Annotation Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Attribute Value</em>'.
	 * @see annotate.AnnotationAttributeValue
	 * @generated
	 */
	EClass getAnnotationAttributeValue();

	/**
	 * Returns the meta object for class '{@link annotate.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value</em>'.
	 * @see annotate.SimpleValue
	 * @generated
	 */
	EClass getSimpleValue();

	/**
	 * Returns the meta object for the attribute '{@link annotate.SimpleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see annotate.SimpleValue#getValue()
	 * @see #getSimpleValue()
	 * @generated
	 */
	EAttribute getSimpleValue_Value();

	/**
	 * Returns the meta object for class '{@link annotate.ComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Value</em>'.
	 * @see annotate.ComplexValue
	 * @generated
	 */
	EClass getComplexValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotateFactory getAnnotateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link annotate.impl.AnnotableImpl <em>Annotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.AnnotableImpl
		 * @see annotate.impl.AnnotatePackageImpl#getAnnotable()
		 * @generated
		 */
		EClass ANNOTABLE = eINSTANCE.getAnnotable();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTABLE__ANNOTATIONS = eINSTANCE.getAnnotable_Annotations();

		/**
		 * The meta object literal for the '{@link annotate.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.AnnotationImpl
		 * @see annotate.impl.AnnotatePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotation Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATION_TYPE = eINSTANCE.getAnnotation_AnnotationType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ATTRIBUTES = eINSTANCE.getAnnotation_Attributes();

		/**
		 * The meta object literal for the '{@link annotate.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.PackageImpl
		 * @see annotate.impl.AnnotatePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TYPES = eINSTANCE.getPackage_Types();

		/**
		 * The meta object literal for the '<em><b>Annotation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ANNOTATION_TYPES = eINSTANCE.getPackage_AnnotationTypes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '{@link annotate.impl.AnnotationTypeAttributeImpl <em>Annotation Type Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.AnnotationTypeAttributeImpl
		 * @see annotate.impl.AnnotatePackageImpl#getAnnotationTypeAttribute()
		 * @generated
		 */
		EClass ANNOTATION_TYPE_ATTRIBUTE = eINSTANCE.getAnnotationTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE_ATTRIBUTE__TYPE = eINSTANCE.getAnnotationTypeAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE_ATTRIBUTE__NAME = eINSTANCE.getAnnotationTypeAttribute_Name();

		/**
		 * The meta object literal for the '{@link annotate.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.TypeImpl
		 * @see annotate.impl.AnnotatePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

		/**
		 * The meta object literal for the '{@link annotate.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.AnnotationTypeImpl
		 * @see annotate.impl.AnnotatePackageImpl#getAnnotationType()
		 * @generated
		 */
		EClass ANNOTATION_TYPE = eINSTANCE.getAnnotationType();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE__PACKAGE = eINSTANCE.getAnnotationType_Package();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__NAME = eINSTANCE.getAnnotationType_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE__ATTRIBUTES = eINSTANCE.getAnnotationType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TYPE__CONTEXT = eINSTANCE.getAnnotationType_Context();

		/**
		 * The meta object literal for the '{@link annotate.impl.AnnotationAttributeImpl <em>Annotation Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.AnnotationAttributeImpl
		 * @see annotate.impl.AnnotatePackageImpl#getAnnotationAttribute()
		 * @generated
		 */
		EClass ANNOTATION_ATTRIBUTE = eINSTANCE.getAnnotationAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getAnnotationAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ATTRIBUTE__VALUE = eINSTANCE.getAnnotationAttribute_Value();

		/**
		 * The meta object literal for the '{@link annotate.impl.AnnotationAttributeValueImpl <em>Annotation Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.AnnotationAttributeValueImpl
		 * @see annotate.impl.AnnotatePackageImpl#getAnnotationAttributeValue()
		 * @generated
		 */
		EClass ANNOTATION_ATTRIBUTE_VALUE = eINSTANCE.getAnnotationAttributeValue();

		/**
		 * The meta object literal for the '{@link annotate.impl.SimpleValueImpl <em>Simple Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.SimpleValueImpl
		 * @see annotate.impl.AnnotatePackageImpl#getSimpleValue()
		 * @generated
		 */
		EClass SIMPLE_VALUE = eINSTANCE.getSimpleValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VALUE__VALUE = eINSTANCE.getSimpleValue_Value();

		/**
		 * The meta object literal for the '{@link annotate.impl.ComplexValueImpl <em>Complex Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see annotate.impl.ComplexValueImpl
		 * @see annotate.impl.AnnotatePackageImpl#getComplexValue()
		 * @generated
		 */
		EClass COMPLEX_VALUE = eINSTANCE.getComplexValue();

	}

} //AnnotatePackage
