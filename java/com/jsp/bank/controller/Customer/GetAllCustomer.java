package com.jsp.bank.controller.Customer;

import com.jsp.bank.service.CustomerService;

public class GetAllCustomer {
	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		customerService.getAllCustomer();
	}
}
