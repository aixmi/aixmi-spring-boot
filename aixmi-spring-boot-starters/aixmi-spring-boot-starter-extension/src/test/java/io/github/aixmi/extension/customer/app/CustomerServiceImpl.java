package io.github.aixmi.extension.customer.app;


import io.github.aixmi.dto.Response;
import io.github.aixmi.dto.SingleResponse;
import io.github.aixmi.extension.customer.client.AddCustomerCmd;
import io.github.aixmi.extension.customer.client.CustomerDTO;
import io.github.aixmi.extension.customer.client.CustomerServiceI;
import io.github.aixmi.extension.customer.client.GetOneCustomerQry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * CustomerServiceImpl
 *
 * @author Frank Zhang 2018-01-06 7:40 PM
 */
@Service
public class CustomerServiceImpl implements CustomerServiceI {

	@Resource
	private AddCustomerCmdExe addCustomerCmdExe;

	@Resource
	private GetOneCustomerQryExe getOneCustomerQryExe;


	@Override
	public Response addCustomer(AddCustomerCmd addCustomerCmd) {
		return addCustomerCmdExe.execute(addCustomerCmd);
	}

	@Override
	public SingleResponse<CustomerDTO> getCustomer(GetOneCustomerQry getOneCustomerQry) {
		return getOneCustomerQryExe.execute(getOneCustomerQry);
	}
}
