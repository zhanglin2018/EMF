/**
 */
package testProgram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import testProgram.Suite;
import testProgram.TestProgramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuiteTest extends TestCase {

	/**
	 * The fixture for this Suite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Suite fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuiteTest.class);
	}

	/**
	 * Constructs a new Suite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuiteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Suite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Suite fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Suite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Suite getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestProgramFactory.eINSTANCE.createSuite());
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

} //SuiteTest
