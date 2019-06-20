/**
 */
package testProgram.tests;

import junit.textui.TestRunner;

import testProgram.TestProgramFactory;
import testProgram.TestSuite;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestSuiteTest extends SuiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestSuiteTest.class);
	}

	/**
	 * Constructs a new Test Suite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Suite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TestSuite getFixture() {
		return (TestSuite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestProgramFactory.eINSTANCE.createTestSuite());
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

} //TestSuiteTest
