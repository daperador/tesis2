/**
 */
package mvc.tests;

import annotate.tests.AnnotableTest;

import junit.textui.TestRunner;

import mvc.ControllerView;
import mvc.MvcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Controller View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerViewTest extends AnnotableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ControllerViewTest.class);
	}

	/**
	 * Constructs a new Controller View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Controller View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ControllerView getFixture() {
		return (ControllerView)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createControllerView());
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

} //ControllerViewTest
