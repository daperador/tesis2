/**
 */
package mvc.tests;

import annotate.tests.AnnotableTest;

import junit.textui.TestRunner;

import mvc.EventAction;
import mvc.MvcFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventActionTest extends AnnotableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventActionTest.class);
	}

	/**
	 * Constructs a new Event Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventAction getFixture() {
		return (EventAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MvcFactory.eINSTANCE.createEventAction());
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

} //EventActionTest
