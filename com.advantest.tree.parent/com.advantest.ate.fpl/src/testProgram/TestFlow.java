/**
 */
package testProgram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testProgram.TestFlow#getSuites <em>Suites</em>}</li>
 * </ul>
 *
 * @see testProgram.TestProgramPackage#getTestFlow()
 * @model
 * @generated
 */
public interface TestFlow extends Suite {
	/**
	 * Returns the value of the '<em><b>Suites</b></em>' containment reference list.
	 * The list contents are of type {@link testProgram.Suite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suites</em>' containment reference list.
	 * @see testProgram.TestProgramPackage#getTestFlow_Suites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Suite> getSuites();

} // TestFlow
