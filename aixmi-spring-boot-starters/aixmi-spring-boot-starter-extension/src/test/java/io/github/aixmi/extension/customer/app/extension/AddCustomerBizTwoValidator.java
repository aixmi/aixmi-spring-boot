package io.github.aixmi.extension.customer.app.extension;


import io.github.aixmi.exception.BizException;
import io.github.aixmi.extension.Extension;
import io.github.aixmi.extension.customer.app.extensionpoint.AddCustomerValidatorExtPt;
import io.github.aixmi.extension.customer.client.AddCustomerCmd;
import io.github.aixmi.extension.customer.client.Constants;

/**
 * AddCustomerBizTwoValidator
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:31 AM
 */
@Extension(bizId = Constants.BIZ_2)
public class AddCustomerBizTwoValidator implements AddCustomerValidatorExtPt {

	public void validate(AddCustomerCmd addCustomerCmd) {
		//For BIZ TWO CustomerTYpe could not be null
		if (addCustomerCmd.getCustomerDTO().getCustomerType() == null)
			throw new BizException("CustomerType could not be null");
	}
}
