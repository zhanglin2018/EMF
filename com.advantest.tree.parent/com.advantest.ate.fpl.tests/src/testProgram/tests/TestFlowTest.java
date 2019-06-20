/**
 */
package testProgram.tests;

import junit.textui.TestRunner;

import testProgram.TestFlow;
import testProgram.TestProgramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestFlowTest extends SuiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestFlowTest.class);
	}

	/**
	 * Constructs a new Test Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TestFlow getFixture() {
		return (TestFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestProgramFactory.eINSTANCE.createTestFlow());
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

} //TestFlowTest
