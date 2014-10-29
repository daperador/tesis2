/**
 */
package mvc.tests;

import junit.textui.TestRunner;

import mvc.MvcFactory;
import mvc.UILabel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UILabelTest extends UIComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UILabelTest.class);
	}

	/**
	 * Constructs a new UI Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UILabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this UI Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UILabel getFixture() {
		return (UILabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createUILabel());
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

} //UILabelTest
