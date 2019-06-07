/**
 */
package diagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.Item#getProductName <em>Product Name</em>}</li>
 *   <li>{@link diagram.Item#getQuatity <em>Quatity</em>}</li>
 *   <li>{@link diagram.Item#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see diagram.DiagramPackage#getItem_ProductName()
	 * @model
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link diagram.Item#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Quatity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quatity</em>' attribute.
	 * @see #setQuatity(int)
	 * @see diagram.DiagramPackage#getItem_Quatity()
	 * @model
	 * @generated
	 */
	int getQuatity();

	/**
	 * Sets the value of the '{@link diagram.Item#getQuatity <em>Quatity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quatity</em>' attribute.
	 * @see #getQuatity()
	 * @generated
	 */
	void setQuatity(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see diagram.DiagramPackage#getItem_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link diagram.Item#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

} // Item
