package com.jsp.bank.controller.Admin;

import com.jsp.bank.dto.Admin;
import com.jsp.bank.service.AdminService;

public class UpdateAdmin {
	public static void main(String[] args) {

		Admin admin = new Admin();
		admin.setId(1);
		admin.setName("Aniruddha");
		admin.setPassword("0000");

		AdminService adminService = new AdminService();
		adminService.updateAdmin(admin);
	}

}
