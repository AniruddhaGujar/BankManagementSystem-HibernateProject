package com.jsp.bank.controller.Admin;

import java.util.Scanner;

import com.jsp.bank.service.AdminService;

public class GetByIdAdmin {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter Admin ID to get details");
		int id = sc.nextInt();

		AdminService adminService = new AdminService();
		adminService.getAdminById(id);
	}

}
