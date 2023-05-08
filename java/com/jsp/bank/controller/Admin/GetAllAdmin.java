package com.jsp.bank.controller.Admin;

import com.jsp.bank.service.AdminService;

public class GetAllAdmin {
	public static void main(String[] args) {

		AdminService adminService = new AdminService();
		adminService.getAllAdmin();
	}

}
