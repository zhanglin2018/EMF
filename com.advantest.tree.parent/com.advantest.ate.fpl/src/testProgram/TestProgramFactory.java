/**
 */
package testProgram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testProgram.TestProgramPackage
 * @generated
 */
public interface TestProgramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestProgramFactory eINSTANCE = testProgram.impl.TestProgramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suite</em>'.
	 * @generated
	 */
	Suite createSuite();

	/**
	 * Returns a new object of class '<em>Test Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Suite</em>'.
	 * @generated
	 */
	TestSuite createTestSuite();

	/**
	 * Returns a new object of class '<em>Test Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Flow</em>'.
	 * @generated
	 */
	TestFlow createTestFlow();

	/**
	 * Returns a new object of class '<em>Test Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Program</em>'.
	 * @generated
	 */
	TestProgram createTestProgram();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestProgramPackage getTestProgramPackage();

} //TestProgramFactory
