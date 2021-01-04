package io.github.aixmi.extension.customer.client;


import io.github.aixmi.dto.Command;
import io.github.aixmi.extension.BizScenario;
import lombok.Data;

/**
 * AddCustomerCmd
 *
 * @author Frank Zhang 2018-01-06 7:28 PM
 */
@Data
public class AddCustomerCmd extends Command {

	private CustomerDTO customerDTO;

	private String biz;

	private BizScenario bizScenario;
}
