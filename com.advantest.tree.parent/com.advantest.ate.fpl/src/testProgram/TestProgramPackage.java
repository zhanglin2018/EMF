/**
 */
package testProgram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testProgram.TestProgramFactory
 * @model kind="package"
 * @generated
 */
public interface TestProgramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testProgram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.advantest.ate.fpl/testProgram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testProgram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestProgramPackage eINSTANCE = testProgram.impl.TestProgramPackageImpl.init();

	/**
	 * The meta object id for the '{@link testProgram.impl.SuiteImpl <em>Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testProgram.impl.SuiteImpl
	 * @see testProgram.impl.TestProgramPackageImpl#getSuite()
	 * @generated
	 */
	int SUITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testProgram.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testProgram.impl.TestSuiteImpl
	 * @see testProgram.impl.TestProgramPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__NAME = SUITE__NAME;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = SUITE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_OPERATION_COUNT = SUITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testProgram.impl.TestFlowImpl <em>Test Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testProgram.impl.TestFlowImpl
	 * @see testProgram.impl.TestProgramPackageImpl#getTestFlow()
	 * @generated
	 */
	int TEST_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FLOW__NAME = SUITE__NAME;

	/**
	 * The feature id for the '<em><b>Suites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FLOW__SUITES = SUITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FLOW_FEATURE_COUNT = SUITE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FLOW_OPERATION_COUNT = SUITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testProgram.impl.TestProgramImpl <em>Test Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testProgram.impl.TestProgramImpl
	 * @see testProgram.impl.TestProgramPackageImpl#getTestProgram()
	 * @generated
	 */
	int TEST_PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROGRAM__FLOWS = 1;

	/**
	 * The number of structural features of the '<em>Test Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PROGRAM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link testProgram.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testProgram.impl.RootImpl
	 * @see testProgram.impl.TestProgramPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 4;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PROGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link testProgram.Suite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suite</em>'.
	 * @see testProgram.Suite
	 * @generated
	 */
	EClass getSuite();

	/**
	 * Returns the meta object for the attribute '{@link testProgram.Suite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testProgram.Suite#getName()
	 * @see #getSuite()
	 * @generated
	 */
	EAttribute getSuite_Name();

	/**
	 * Returns the meta object for class '{@link testProgram.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see testProgram.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for class '{@link testProgram.TestFlow <em>Test Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Flow</em>'.
	 * @see testProgram.TestFlow
	 * @generated
	 */
	EClass getTestFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link testProgram.TestFlow#getSuites <em>Suites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suites</em>'.
	 * @see testProgram.TestFlow#getSuites()
	 * @see #getTestFlow()
	 * @generated
	 */
	EReference getTestFlow_Suites();

	/**
	 * Returns the meta object for class '{@link testProgram.TestProgram <em>Test Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Program</em>'.
	 * @see testProgram.TestProgram
	 * @generated
	 */
	EClass getTestProgram();

	/**
	 * Returns the meta object for the attribute '{@link testProgram.TestProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testProgram.TestProgram#getName()
	 * @see #getTestProgram()
	 * @generated
	 */
	EAttribute getTestProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link testProgram.TestProgram#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see testProgram.TestProgram#getFlows()
	 * @see #getTestProgram()
	 * @generated
	 */
	EReference getTestProgram_Flows();

	/**
	 * Returns the meta object for class '{@link testProgram.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see testProgram.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link testProgram.Root#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see testProgram.Root#getPrograms()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Programs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestProgramFactory getTestProgramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testProgram.impl.SuiteImpl <em>Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testProgram.impl.SuiteImpl
		 * @see testProgram.impl.TestProgramPackageImpl#getSuite()
		 * @generated
		 */
		EClass SUITE = eINSTANCE.getSuite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUITE__NAME = eINSTANCE.getSuite_Name();

		/**
		 * The meta object literal for the '{@link testProgram.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testProgram.impl.TestSuiteImpl
		 * @see testProgram.impl.TestProgramPackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '{@link testProgram.impl.TestFlowImpl <em>Test Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testProgram.impl.TestFlowImpl
		 * @see testProgram.impl.TestProgramPackageImpl#getTestFlow()
		 * @generated
		 */
		EClass TEST_FLOW = eINSTANCE.getTestFlow();

		/**
		 * The meta object literal for the '<em><b>Suites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_FLOW__SUITES = eINSTANCE.getTestFlow_Suites();

		/**
		 * The meta object literal for the '{@link testProgram.impl.TestProgramImpl <em>Test Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testProgram.impl.TestProgramImpl
		 * @see testProgram.impl.TestProgramPackageImpl#getTestProgram()
		 * @generated
		 */
		EClass TEST_PROGRAM = eINSTANCE.getTestProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_PROGRAM__NAME = eINSTANCE.getTestProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_PROGRAM__FLOWS = eINSTANCE.getTestProgram_Flows();

		/**
		 * The meta object literal for the '{@link testProgram.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testProgram.impl.RootImpl
		 * @see testProgram.impl.TestProgramPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PROGRAMS = eINSTANCE.getRoot_Programs();

	}

} //TestProgramPackage
