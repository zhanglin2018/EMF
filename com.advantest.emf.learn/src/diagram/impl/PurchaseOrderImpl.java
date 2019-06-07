/**
 */
package diagram.impl;

import diagram.DiagramPackage;
import diagram.Item;
import diagram.PurchaseOrder;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagram.impl.PurchaseOrderImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link diagram.impl.PurchaseOrderImpl#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link diagram.impl.PurchaseOrderImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PurchaseOrderImpl extends MinimalEObjectImpl.Container implements PurchaseOrder {
	/**
	 * The default value of the '{@link #getShipTo() <em>Ship To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipTo()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipTo() <em>Ship To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipTo()
	 * @generated
	 * @ordered
	 */
	protected String shipTo = SHIP_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillTo() <em>Bill To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillTo()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillTo() <em>Bill To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillTo()
	 * @generated
	 * @ordered
	 */
	protected String billTo = BILL_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurchaseOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.PURCHASE_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipTo() {
		return shipTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipTo(String newShipTo) {
		String oldShipTo = shipTo;
		shipTo = newShipTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.PURCHASE_ORDER__SHIP_TO, oldShipTo, shipTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillTo() {
		return billTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillTo(String newBillTo) {
		String oldBillTo = billTo;
		billTo = newBillTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.PURCHASE_ORDER__BILL_TO, oldBillTo, billTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, DiagramPackage.PURCHASE_ORDER__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.PURCHASE_ORDER__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case DiagramPackage.PURCHASE_ORDER__SHIP_TO:
				return getShipTo();
			case DiagramPackage.PURCHASE_ORDER__BILL_TO:
				return getBillTo();
			case DiagramPackage.PURCHASE_ORDER__ITEMS:
				return getItems();
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
			case DiagramPackage.PURCHASE_ORDER__SHIP_TO:
				setShipTo((String)newValue);
				return;
			case DiagramPackage.PURCHASE_ORDER__BILL_TO:
				setBillTo((String)newValue);
				return;
			case DiagramPackage.PURCHASE_ORDER__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
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
			case DiagramPackage.PURCHASE_ORDER__SHIP_TO:
				setShipTo(SHIP_TO_EDEFAULT);
				return;
			case DiagramPackage.PURCHASE_ORDER__BILL_TO:
				setBillTo(BILL_TO_EDEFAULT);
				return;
			case DiagramPackage.PURCHASE_ORDER__ITEMS:
				getItems().clear();
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
			case DiagramPackage.PURCHASE_ORDER__SHIP_TO:
				return SHIP_TO_EDEFAULT == null ? shipTo != null : !SHIP_TO_EDEFAULT.equals(shipTo);
			case DiagramPackage.PURCHASE_ORDER__BILL_TO:
				return BILL_TO_EDEFAULT == null ? billTo != null : !BILL_TO_EDEFAULT.equals(billTo);
			case DiagramPackage.PURCHASE_ORDER__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (shipTo: ");
		result.append(shipTo);
		result.append(", billTo: ");
		result.append(billTo);
		result.append(')');
		return result.toString();
	}

} //PurchaseOrderImpl
