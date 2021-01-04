package io.github.aixmi.extension.customer.app.extension;


import io.github.aixmi.exception.BizException;
import io.github.aixmi.extension.Extension;
import io.github.aixmi.extension.customer.app.extensionpoint.AddCustomerValidatorExtPt;
import io.github.aixmi.extension.customer.client.AddCustomerCmd;
import io.github.aixmi.extension.customer.client.Constants;
import io.github.aixmi.extension.customer.domain.CustomerType;

/**
 * AddCustomerBizOneValidator
 *
 * @author Frank Zhang
 * @date 2018-01-07 1:31 AM
 */
@Extension(bizId = Constants.BIZ_1)
public class AddCustomerBizOneValidator implements AddCustomerValidatorExtPt {

	public void validate(AddCustomerCmd addCustomerCmd) {
		//For BIZ TWO CustomerTYpe could not be VIP
		if (CustomerType.VIP == addCustomerCmd.getCustomerDTO().getCustomerType())
			throw new BizException("Customer Type could not be VIP for Biz One");
	}
}
