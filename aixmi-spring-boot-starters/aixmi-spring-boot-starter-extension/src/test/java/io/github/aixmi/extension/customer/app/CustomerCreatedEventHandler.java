package io.github.aixmi.extension.customer.app;


import io.github.aixmi.dto.Response;
import io.github.aixmi.extension.customer.client.CustomerCreatedEvent;

/**
 * CustomerCreatedEventHandler
 *
 * @author Frank Zhang
 * @date 2020-06-22 7:00 PM
 */
public class CustomerCreatedEventHandler {

	public Response execute(CustomerCreatedEvent customerCreatedEvent) {
		System.out.println("customerCreatedEvent processed");
		return null;
	}
}
