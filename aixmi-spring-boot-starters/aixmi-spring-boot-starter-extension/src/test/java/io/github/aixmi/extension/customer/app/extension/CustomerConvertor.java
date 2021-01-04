package io.github.aixmi.extension.customer.app.extension;


import io.github.aixmi.extension.customer.client.AddCustomerCmd;
import io.github.aixmi.extension.customer.client.CustomerDTO;
import io.github.aixmi.extension.customer.domain.CustomerEntity;
import io.github.aixmi.spring.support.SpringContextHolder;
import org.springframework.stereotype.Component;

/**
 * CustomerConvertor
 *
 * @author Frank Zhang
 * @date 2018-01-07 3:08 AM
 */
@Component
public class CustomerConvertor {

	public CustomerEntity clientToEntity(Object clientObject) {
		AddCustomerCmd addCustomerCmd = (AddCustomerCmd) clientObject;
		CustomerDTO customerDTO = addCustomerCmd.getCustomerDTO();
		CustomerEntity customerEntity = (CustomerEntity) SpringContextHolder.getBean(CustomerEntity.class);
		customerEntity.setCompanyName(customerDTO.getCompanyName());
		customerEntity.setCustomerType(customerDTO.getCustomerType());
		customerEntity.setBizScenario(addCustomerCmd.getBizScenario());
		return customerEntity;
	}
}
