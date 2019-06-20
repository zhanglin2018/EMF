/**
 *
 * $Id$
 */
package diagram.validation;

import diagram.Item;
import org.eclipse.emf.common.util.EList;


/**
 * A sample validator interface for {@link diagram.PurchaseOrder}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PurchaseOrderValidator {
	boolean validate();

	boolean validateShipTo(String value);
	boolean validateBillTo(String value);

	boolean validateItems(EList<Item> value);
}
