package io.github.aixmi.extension.customer.infrastructure;

import io.github.aixmi.extension.customer.domain.CustomerEntity;
import org.springframework.stereotype.Repository;

/**
 * CustomerRepository
 *
 * @author Frank Zhang
 * @date 2018-01-07 11:59 AM
 */
@Repository
public class CustomerRepository {

	public void persist(CustomerEntity customerEntity) {
		System.out.println("Persist customer to DB : " + customerEntity);
	}
}
