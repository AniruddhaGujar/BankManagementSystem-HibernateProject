package com.jsp.bank.controller.Manager;

import java.util.Scanner;

import com.jsp.bank.service.ManagerService;

public class DeleteManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Manager id to delete its record");
		int id = sc.nextInt();
		
		ManagerService managerService = new ManagerService();
		managerService.deleteManager(id);
	}
}
