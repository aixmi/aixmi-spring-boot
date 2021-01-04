package io.github.aixmi.extension.customer.app.extensionpoint;


import io.github.aixmi.extension.ExtensionPointI;
import io.github.aixmi.extension.customer.client.AddCustomerCmd;

/**
 * AddCustomerValidatorExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:27 AM
 */
public interface AddCustomerValidatorExtPt extends ExtensionPointI {

	public void validate(AddCustomerCmd addCustomerCmd);
}
