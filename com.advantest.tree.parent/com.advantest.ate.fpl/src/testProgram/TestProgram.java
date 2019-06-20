/**
 */
package testProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testProgram.TestProgram#getName <em>Name</em>}</li>
 *   <li>{@link testProgram.TestProgram#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see testProgram.TestProgramPackage#getTestProgram()
 * @model
 * @generated
 */
public interface TestProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testProgram.TestProgramPackage#getTestProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testProgram.TestProgram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link testProgram.TestFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see testProgram.TestProgramPackage#getTestProgram_Flows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestFlow> getFlows();

} // TestProgram
