package com.revature.controllers;
import java.util.Scanner;

import com.revature.daos.*;
import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;



public class SignInInterface {
	ManagerDao managerDaoImp = new ManagerDaoImp();
	CustomerDAOImp customerDAO = new CustomerDAOImp();

	public void SignIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome Back! \n" + "Are you a employee or a customer?" + "\n" + "1.) Employee" + "\n" + "2.) Customer"+ "\n");
		int selection = scan.nextInt();
		
		
		
		switch(selection) {
		
		// If they choose to login as an employee
		  case 1:
			  System.out.println("You have selected employee! Welcome back!\n");
			  System.out.println("Please enter your employee username\n");
			  String tryEmployeeUsername = scan.next();
			  System.out.println("Welcome back " + tryEmployeeUsername + "!\n" + "Now please enter your password");
			  String tryEmployeePassphrase = scan.next();
			  
			  ManagerAccount managerAccount = managerDaoImp.getManagerByUsername(tryEmployeeUsername);
			  if (managerAccount == null) {
				  System.out.println("The username or password is incorrect!");
				  SignIn();
			  }
			  try {
				  boolean signInSuccess = managerAccount.getPassphrase().equals(tryEmployeePassphrase);
				  System.out.println(signInSuccess);
				  if (signInSuccess = true) {
						System.out.println("Sign in successfull");
						System.out.println("Welcome back, " + tryEmployeeUsername + "\n");
					EmployeeLoggedMenu.EmployeeLoggedMenuSelect();	  		
			}} 
			  catch (Exception e) {
				System.out.println("Username or password incorrect");
				SignIn();
			}
				break;
				
				
		// If they choose to login as a customer	  
		  case 2:
			  
			  System.out.println("You have selected customer! Welcome back!\n");
			  System.out.println("You selected option number " + selection);
			  System.out.println("Please enter your username!");
			  String customerUsername = scan.next();

				System.out.println(customerUsername);
				
				
				System.out.println("Hello, " + customerUsername + "\nPlease type in your password");
				
				@SuppressWarnings("unused") CustomerAccount customerAccount = CustomerDAOImp.getCustomerByUsername(customerUsername);
				
				String customerPassphrase = scan.next();
				
								
				boolean temp = CustomerDAO.getPassphrase().equals(customerPassphrase);
					if(temp = true) {
					System.out.println("Sign in successfull");
					System.out.println("Welcome back, " + customerUsername + "\n");
					System.out.println("What would you like to do?\n" + "1.) View Account Status \n" + "2.) E\n" + "3.) Exit");
					}
					else {
					System.out.println("Username or password incorrect");
					MenuInterface.MenuSelect();					
					}
				
				break;
			  
			  
			  
		  case 3:
			  System.out.println("Exiting program! See you again soon!");
			  break;
		  //Catches any integers that are not 1,2 or 3
		  default:
			  System.out.println("Unrecongnized selection...\n" + "Returning to Main Menu\n");
			  MenuInterface.MenuSelect();
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
			  if (selection2 != 1) {
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
					  managerDaoImp.atmService(customerIdService, customerTransact);
						
				  }
				  else {
					  managerDaoImp.atmService(customerIdService, customerTransact*-1);
					  managerDaoImp.atmService(customerIdService, customerTransact*-1);
				  }
				  
				  
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
	}
	
}
	
	
