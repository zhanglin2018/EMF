/**
 */
package testProgram.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testProgram.Suite;
import testProgram.TestFlow;
import testProgram.TestProgramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testProgram.impl.TestFlowImpl#getSuites <em>Suites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestFlowImpl extends SuiteImpl implements TestFlow {
	/**
	 * The cached value of the '{@link #getSuites() <em>Suites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuites()
	 * @generated
	 * @ordered
	 */
	protected EList<Suite> suites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestProgramPackage.Literals.TEST_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Suite> getSuites() {
		if (suites == null) {
			suites = new EObjectContainmentEList<Suite>(Suite.class, this, TestProgramPackage.TEST_FLOW__SUITES);
		}
		return suites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestProgramPackage.TEST_FLOW__SUITES:
				return ((InternalEList<?>)getSuites()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestProgramPackage.TEST_FLOW__SUITES:
				return getSuites();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestProgramPackage.TEST_FLOW__SUITES:
				getSuites().clear();
				getSuites().addAll((Collection<? extends Suite>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestProgramPackage.TEST_FLOW__SUITES:
				getSuites().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestProgramPackage.TEST_FLOW__SUITES:
				return suites != null && !suites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestFlowImpl
