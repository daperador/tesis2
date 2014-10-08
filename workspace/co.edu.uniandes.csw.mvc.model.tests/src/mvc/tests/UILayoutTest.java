/**
 */
package mvc.tests;

import junit.textui.TestRunner;

import mvc.MvcFactory;
import mvc.UILayout;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Layout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UILayoutTest extends UIComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UILayoutTest.class);
	}

	/**
	 * Constructs a new UI Layout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UILayoutTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UI Layout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UILayout getFixture() {
		return (UILayout)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createUILayout());
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

} //UILayoutTest
