/**
 */
package testProgram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import testProgram.TestProgram;
import testProgram.TestProgramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Program</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestProgramTest extends TestCase {

	/**
	 * The fixture for this Test Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestProgram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestProgramTest.class);
	}

	/**
	 * Constructs a new Test Program test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestProgramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Test Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TestProgram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Test Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestProgram getFixture() {
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
		setFixture(TestProgramFactory.eINSTANCE.createTestProgram());
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

} //TestProgramTest
