package com.jsp.bank.controller.Manager;

import com.jsp.bank.service.ManagerService;

public class GetAllManager {
	public static void main(String[] args) {
		ManagerService managerService = new ManagerService();
		managerService.getAllManager();
	}

}
