/**
 */
package annotate.impl;

import annotate.AnnotateFactory;
import annotate.AnnotatePackage;
import annotate.Annotation;
import annotate.AnnotationAttribute;
import annotate.AnnotationType;
import annotate.AnnotationTypeAttribute;
import annotate.SimpleValue;
import annotate.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotateFactoryImpl extends EFactoryImpl implements AnnotateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotateFactory init() {
		try {
			AnnotateFactory theAnnotateFactory = (AnnotateFactory)EPackage.Registry.INSTANCE.getEFactory(AnnotatePackage.eNS_URI);
			if (theAnnotateFactory != null) {
				return theAnnotateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnnotateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnnotatePackage.ANNOTATION: return createAnnotation();
			case AnnotatePackage.PACKAGE: return createPackage();
			case AnnotatePackage.ANNOTATION_TYPE_ATTRIBUTE: return createAnnotationTypeAttribute();
			case AnnotatePackage.TYPE: return createType();
			case AnnotatePackage.ANNOTATION_TYPE: return createAnnotationType();
			case AnnotatePackage.ANNOTATION_ATTRIBUTE: return createAnnotationAttribute();
			case AnnotatePackage.SIMPLE_VALUE: return createSimpleValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public annotate.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeAttribute createAnnotationTypeAttribute() {
		AnnotationTypeAttributeImpl annotationTypeAttribute = new AnnotationTypeAttributeImpl();
		return annotationTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationAttribute createAnnotationAttribute() {
		AnnotationAttributeImpl annotationAttribute = new AnnotationAttributeImpl();
		return annotationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleValue createSimpleValue() {
		SimpleValueImpl simpleValue = new SimpleValueImpl();
		return simpleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatePackage getAnnotatePackage() {
		return (AnnotatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnnotatePackage getPackage() {
		return AnnotatePackage.eINSTANCE;
	}

} //AnnotateFactoryImpl
