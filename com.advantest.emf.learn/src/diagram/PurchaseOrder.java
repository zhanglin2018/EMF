/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.PurchaseOrder#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link diagram.PurchaseOrder#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link diagram.PurchaseOrder#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getPurchaseOrder()
 * @model
 * @generated
 */
public interface PurchaseOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Ship To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' attribute.
	 * @see #setShipTo(String)
	 * @see diagram.DiagramPackage#getPurchaseOrder_ShipTo()
	 * @model
	 * @generated
	 */
	String getShipTo();

	/**
	 * Sets the value of the '{@link diagram.PurchaseOrder#getShipTo <em>Ship To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' attribute.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(String value);

	/**
	 * Returns the value of the '<em><b>Bill To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To</em>' attribute.
	 * @see #setBillTo(String)
	 * @see diagram.DiagramPackage#getPurchaseOrder_BillTo()
	 * @model
	 * @generated
	 */
	String getBillTo();

	/**
	 * Sets the value of the '{@link diagram.PurchaseOrder#getBillTo <em>Bill To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To</em>' attribute.
	 * @see #getBillTo()
	 * @generated
	 */
	void setBillTo(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see diagram.DiagramPackage#getPurchaseOrder_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // PurchaseOrder
