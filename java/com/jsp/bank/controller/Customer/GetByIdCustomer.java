package com.jsp.bank.controller.Customer;

import java.util.Scanner;

import com.jsp.bank.service.CustomerService;

public class GetByIdCustomer {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID to get details");
		int id = sc.nextInt();

		CustomerService customerService = new CustomerService();
		customerService.getCustomerById(id);
	}
}
