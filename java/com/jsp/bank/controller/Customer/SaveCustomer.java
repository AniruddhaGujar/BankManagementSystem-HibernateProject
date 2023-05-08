package com.jsp.bank.controller.Customer;

import java.util.Scanner;

import com.jsp.bank.dto.Customer;
import com.jsp.bank.service.CustomerService;

public class SaveCustomer {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer name below:");
		String name = sc.nextLine();
		System.out.println("Enter Customer address below:");
		String address = sc.nextLine();
		System.out.println("Enter Customer status below:");
		String status = sc.nextLine();
		System.out.println("Enter Customer Adhar number below:");
		String adhar_no = sc.nextLine();

		Customer customer = new Customer();
		customer.setName(name);
		customer.setAddrs(address);
		customer.setStatus(status);
		customer.setAdhar_no(adhar_no);

		CustomerService customerService = new CustomerService();
		customerService.saveCustomer(customer);
	}

}
