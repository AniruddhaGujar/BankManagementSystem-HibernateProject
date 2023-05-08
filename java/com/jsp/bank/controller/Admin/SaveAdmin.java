package com.jsp.bank.controller.Admin;

import java.util.Scanner;

import com.jsp.bank.dto.Admin;
import com.jsp.bank.service.AdminService;

public class SaveAdmin {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter Admin name below:");
		String name = sc.nextLine();
		System.out.println("Enter Admin email below:");
		String email = sc.nextLine();
		System.out.println("Enter Admin password below:");
		String password = sc.nextLine();

		Admin admin = new Admin();
		admin.setName(name);
		admin.setEmail(email);
		admin.setPassword(password);

		AdminService adminService = new AdminService();
		adminService.saveAdmin(admin);
	}

}
