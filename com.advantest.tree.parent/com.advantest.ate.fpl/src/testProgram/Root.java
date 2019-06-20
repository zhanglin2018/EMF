/**
 */
package testProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testProgram.Root#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see testProgram.TestProgramPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link testProgram.TestProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see testProgram.TestProgramPackage#getRoot_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestProgram> getPrograms();

} // Root
