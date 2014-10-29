/**
 */
package mvc.tests;

import annotate.tests.AnnotableTest;

import junit.textui.TestRunner;

import mvc.Entities;
import mvc.MvcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entities</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntitiesTest extends AnnotableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntitiesTest.class);
	}

	/**
	 * Constructs a new Entities test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitiesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Entities getFixture() {
		return (Entities)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createEntities());
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

} //EntitiesTest
