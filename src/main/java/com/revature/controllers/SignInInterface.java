package com.revature.controllers;
import java.util.Scanner;

import com.revature.daos.*;
import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;



public class SignInInterface {
	
	ManagerDao managerDaoImp = new ManagerDaoImp();
	
	public boolean SignIn() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome Back! \n" + "Are you a employee or a customer?" + "\n" + "1.) Employee" + "\n" + "2.) Customer"+ "\n");
		int selection = scan.nextInt();
		switch(selection) {
		  case 1:
			  System.out.println("You have selected employee! Welcome back!\n");
			  
			  break;

		  case 2:
			  System.out.println("You have selected customer! Welcome back!\n");
			  System.out.println("You selected option number" + selection);
				System.out.println("Please enter your username!");
				String customerUsername = scan.next();
				System.out.println("Hello, " + customerUsername + "\nPlease type in your password");
				String customerPassphrase = scan.next();
				
				CustomerAccount customerAccount = CustomerDAOImp.getCustomerByUsername(customerUsername);
				boolean loggedOn = customerAccount.getCustomerByUsername(customerUsername);
				if(loggedOn = true) {
					System.out.println("Sign in successfull");
					System.out.println("Welcome back, " + customerUsername + "\n");
					System.out.println("What would you like to do?\n" + "1.) View Account Status \n" + "2.) E\n" + "3.) Exit");
				}
				else {
					System.out.println("Username or password incorrect");
					MenuInterface.MenuSelect();					
				}
				
							
//				System.out.println("Hello valued customer, " + );
			  break;
		  case 3:
			  System.out.println("Exiting program! See you again soon!");
			  break;
		  //Catches any integers that are not 1,2 or 3
		  default:
			  System.out.println("Unrecongnized selection...\n" + "Returning to Main Menu\n");
			  MenuInterface.MenuSelect();
		}
		
		System.out.println("You selected option number" + selection);
		System.out.println("Please enter your username!");
		String currentUsername = scan.next();
		System.out.println("Hello, " + currentUsername + "\nPlease type in your password");
		String currentPassword = scan.next();
	
		ManagerAccount managerAccount = managerDaoImp.getManagerByUsername(currentUsername);
		 
		
		boolean signInSuccess = managerAccount.getPassphrase().equals(currentPassword);
		if (signInSuccess = true) {
			System.out.println("Sign in successfull");
			System.out.println("Welcome back, " + currentUsername + "\n");
			System.out.println("What would you like to do?\n" + "1.) View Customer Accounts \n" + "2.) Make a deposit\n" + "3.) Exit");
			}
		else {
			System.out.println("Username or password incorrect");
		}
		
		
		
		int choice = scan.nextInt();
		switch(choice) {
		  case 1:
			  
			  System.out.println("View customer account by ID!\n" + "Please enter customer user_id");
			  int customerId = scan.nextInt();
			  managerDaoImp.getCustomerById(customerId);
			  System.out.println(managerDaoImp.getCustomerById(customerId));
			  System.out.println("Would you like to do anything else?\n" + "1.) Make a deposit or withdrawal \n" + "2.) Exit");
			  int selection2 = scan.nextInt();
			  if (selection2 != choice) {
				  System.out.println("Exiting the application and logging you out");
			  }			  
			  else {
//				  customerTransactionById
				  
				  System.out.println("What is the customer's ID?");
				  int customerIdService = scan.nextInt();
				  System.out.println("How much to be deposited or withdrawn?\n" + "Please use '-' if the transaction is a withdrawal");
				  int customerTransact = scan.nextInt();
				  
				  
				  if (customerTransact>=0) {
					  managerDaoImp.atmService(customerIdService, customerTransact);  
				  }
				  else {
					  managerDaoImp.atmService(customerIdService, customerTransact*-1);
				  }
				  
				  managerDaoImp.atmService(customerIdService, customerTransact);
		
				  System.out.println("Customer ID is: " + managerDaoImp.getCustomerById(customerIdService));
				  System.out.println("Transaction amount was for :" + customerTransact);
				  
				  System.out.println("The transaction has been completed!");  
			  }break;

		  case 2:
			  System.out.println("Make a deposit to a customer acount via user_id!\n");
			  break;
			  
		
		  case 3:
			  System.out.println("Exiting program! See you again soon!");
			  break;

		  //Catches any integers that are not 1,2 or 3
		  default:
			  System.out.println("Unrecongnized selection...\n" + "Returning to Main Menu\n");
			  MenuInterface.MenuSelect();
		}
		
		return signInSuccess;
	}}
	
	
