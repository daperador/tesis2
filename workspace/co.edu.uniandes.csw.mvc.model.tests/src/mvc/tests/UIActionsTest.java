/**
 */
package mvc.tests;

import junit.textui.TestRunner;

import mvc.MvcFactory;
import mvc.UIActions;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Actions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIActionsTest extends UIComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UIActionsTest.class);
	}

	/**
	 * Constructs a new UI Actions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIActionsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UI Actions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UIActions getFixture() {
		return (UIActions)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createUIActions());
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

} //UIActionsTest
