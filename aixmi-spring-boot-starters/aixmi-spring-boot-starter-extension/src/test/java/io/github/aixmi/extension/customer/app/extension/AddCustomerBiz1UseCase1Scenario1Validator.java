package io.github.aixmi.extension.customer.app.extension;


import io.github.aixmi.extension.Extension;
import io.github.aixmi.extension.customer.app.extensionpoint.AddCustomerValidatorExtPt;
import io.github.aixmi.extension.customer.client.AddCustomerCmd;
import io.github.aixmi.extension.customer.client.Constants;

/**
 * AddCustomerBiz1UseCase1Scenario1Validator
 *
 * @author Frank Zhang
 * @date 2020-08-20 1:01 PM
 */
@Extension(bizId = Constants.BIZ_1, useCase = Constants.USE_CASE_1, scenario = Constants.SCENARIO_1)
public class AddCustomerBiz1UseCase1Scenario1Validator implements AddCustomerValidatorExtPt {
	public void validate(AddCustomerCmd addCustomerCmd) {
		System.out.println("Do validation for Biz_One's Use_Case_One's Scenario_One");
	}
}
