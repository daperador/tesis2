/**
 */
package annotate.tests;

import annotate.AnnotateFactory;
import annotate.SimpleValue;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleValueTest extends AnnotationAttributeValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleValueTest.class);
	}

	/**
	 * Constructs a new Simple Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleValue getFixture() {
		return (SimpleValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnnotateFactory.eINSTANCE.createSimpleValue());
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

} //SimpleValueTest
