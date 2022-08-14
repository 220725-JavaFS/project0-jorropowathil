package com.revature.controllers;
import java.util.Scanner;

import com.revature.daos.CustomerDAOImp;
import com.revature.daos.ManagerDao;
import com.revature.daos.ManagerDaoImp;



public class EmployeeLoggedMenu {
	static ManagerDao managerDaoImp = new ManagerDaoImp();
	CustomerDAOImp customerDAO = new CustomerDAOImp();
	
	
	public static void EmployeeLoggedMenuSelect() {
		
		System.out.println("----------------------------Welcome to Our Banking System!----------------------------");
		System.out.println("\nPlease make your selection\n"+"1.) View Customer Accounts\n"+ "2.) Make a deposit or withdrawal to a customer account\n" + "3.) Log out!\n");
		Scanner scan = new Scanner(System.in);
		int selection = scan.nextInt();
		
		switch(selection) {
			  case 1:
				  System.out.println("Let's view a customer's account!\nPlease enter the customer's user ID number!");
				  int customerId = scan.nextInt();
				  managerDaoImp.getCustomerById(customerId);
				  System.out.println(managerDaoImp.getCustomerById(customerId));
				  System.out.println("Did you want to do anything else?");
				  EmployeeLoggedMenuSelect();
				  break;

			  case 2:
				  System.out.println("Let's complete a transaction for the customer!\nPlease enter the customer's ID!");
				  int customerIdTransaction = scan.nextInt();
				  managerDaoImp.getCustomerById(customerIdTransaction);
				  System.out.println(managerDaoImp.getCustomerById(customerIdTransaction));
				  System.out.println("Will this be: \n1.) Deposit\n2.)withdrawal?");
				  int customerTransactionType = scan.nextInt();
				  if (customerTransactionType == 1) {
					  System.out.println("Please enter the amount you wish to Deposit");
					  int customerDepositAmount = scan.nextInt();
					  managerDaoImp.atmService(customerIdTransaction, customerDepositAmount);
					  System.out.println(managerDaoImp.getCustomerById(customerIdTransaction));

				  }
				  else if (customerTransactionType == 2){
					  System.out.println("Please enter the amount you wish to withdraw");
					  int customerWithdrawAmount = scan.nextInt();
					  managerDaoImp.atmService(customerIdTransaction, -customerWithdrawAmount);
					  System.out.println(managerDaoImp.getCustomerById(customerIdTransaction));

				  }
				  
				  
				  
				  
				  
				  
				  break;
			
			  case 3:
				  MenuInterface.MenuSelect();
				  break;

			  //Catches any integers that are not 1,2 or 3
			  default:
				  System.out.println("Unrecongnized selection...\n" + "Returning to Main Menu\n");
				  MenuInterface.MenuSelect();
			}
		


	

		
	}
}
	
	
	