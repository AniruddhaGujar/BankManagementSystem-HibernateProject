package com.jsp.bank.controller.Customer;

import com.jsp.bank.dto.Customer;
import com.jsp.bank.service.CustomerService;

public class UpdateCustomer {
public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(3);
//		customer.setName("Aniruddha");
		customer.setAddrs("Panvel");
		customer.setAdhar_no("1111 2222 3333 4444");
//		customer.setStatus("approved");
		
		CustomerService customerService = new CustomerService();
		customerService.updateCustomer(customer);
	}
}
