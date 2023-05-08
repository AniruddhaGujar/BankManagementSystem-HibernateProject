package com.jsp.bank.controller.Manager;

import com.jsp.bank.dto.Manager;
import com.jsp.bank.service.ManagerService;

public class UpdateManager {
	public static void main(String[] args) {

		Manager manager = new Manager();
		manager.setId(2);
		manager.setEmail("Anny@gmail.com");

		ManagerService managerService = new ManagerService();
		managerService.updateManager(manager);
	}
}
