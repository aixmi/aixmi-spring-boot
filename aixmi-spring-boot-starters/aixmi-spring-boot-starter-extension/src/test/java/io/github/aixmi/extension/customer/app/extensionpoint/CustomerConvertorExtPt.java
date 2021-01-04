package io.github.aixmi.extension.customer.app.extensionpoint;


import io.github.aixmi.extension.ExtensionPointI;
import io.github.aixmi.extension.customer.client.AddCustomerCmd;
import io.github.aixmi.extension.customer.domain.CustomerEntity;

/**
 * CustomerConvertorExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 2:37 AM
 */
public interface CustomerConvertorExtPt extends ExtensionPointI {

	public CustomerEntity clientToEntity(AddCustomerCmd addCustomerCmd);
}
