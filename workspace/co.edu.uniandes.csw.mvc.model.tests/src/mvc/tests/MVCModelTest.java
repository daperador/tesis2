/**
 */
package mvc.tests;

import annotate.tests.AnnotableTest;

import junit.textui.TestRunner;

import mvc.MVCModel;
import mvc.MvcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MVC Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MVCModelTest extends AnnotableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MVCModelTest.class);
	}

	/**
	 * Constructs a new MVC Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVCModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MVC Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MVCModel getFixture() {
		return (MVCModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createMVCModel());
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

} //MVCModelTest
