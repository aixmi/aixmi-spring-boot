package io.github.aixmi.extension.customer.domain.rule;


import io.github.aixmi.extension.ExtensionPointI;
import io.github.aixmi.extension.customer.domain.CustomerEntity;

/**
 * CustomerRuleExtPt
 *
 * @author Frank Zhang
 * @date 2018-01-07 12:03 PM
 */
public interface CustomerRuleExtPt extends ExtensionPointI {

	//Different business check for different biz
	public boolean addCustomerCheck(CustomerEntity customerEntity);

	//Different upgrade policy for different biz
	default public void customerUpgradePolicy(CustomerEntity customerEntity) {
		//Nothing special
	}
}
