/**
 */
package mvc.tests;

import junit.textui.TestRunner;

import mvc.MvcFactory;
import mvc.UIInput;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIInputTest extends UIComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UIInputTest.class);
	}

	/**
	 * Constructs a new UI Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIInputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UI Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UIInput getFixture() {
		return (UIInput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createUIInput());
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

} //UIInputTest
