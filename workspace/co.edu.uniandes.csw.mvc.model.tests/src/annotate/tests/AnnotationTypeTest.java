/**
 */
package annotate.tests;

import annotate.AnnotateFactory;
import annotate.AnnotationType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationTypeTest extends TestCase {

	/**
	 * The fixture for this Annotation Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnnotationTypeTest.class);
	}

	/**
	 * Constructs a new Annotation Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Annotation Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AnnotationType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Annotation Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnnotateFactory.eINSTANCE.createAnnotationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AnnotationTypeTest
