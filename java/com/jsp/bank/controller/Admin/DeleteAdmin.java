package com.jsp.bank.controller.Admin;

import java.util.Scanner;

import com.jsp.bank.service.AdminService;

public class DeleteAdmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Admin id to delete it");
		int id = sc.nextInt();

		AdminService adminService = new AdminService();
		adminService.deleteAdmin(id);

	}
}
