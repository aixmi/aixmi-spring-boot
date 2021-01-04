package io.github.aixmi.extension.customer.domain.rule;


import io.github.aixmi.exception.BizException;
import io.github.aixmi.extension.Extension;
import io.github.aixmi.extension.customer.client.Constants;
import io.github.aixmi.extension.customer.domain.CustomerEntity;
import io.github.aixmi.extension.customer.domain.SourceType;

/**
 * CustomerBizOneRuleExt
 *
 * @author Frank Zhang
 * @date 2018-01-07 12:10 PM
 */
@Extension(bizId = Constants.BIZ_1)
public class CustomerBizOneRuleExt implements CustomerRuleExtPt {

	@Override
	public boolean addCustomerCheck(CustomerEntity customerEntity) {
		if (SourceType.AD == customerEntity.getSourceType()) {
			throw new BizException("Sorry, Customer from advertisement can not be added in this period");
		}
		return true;
	}
}
