package com.revature.controllers;
import java.util.Scanner;

import com.revature.daos.*;
import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;



public class SignInInterface {
	ManagerDao managerDaoImp = new ManagerDaoImp();
	CustomerDAO customerDaoImp = new CustomerDAOImp();
	
	public void SignIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------------------------------");
		System.out.println("Welcome Back! \n" + "Are you a employee or a customer?" + "\n" + "1.) Employee" + "\n" + "2.) Customer"+ "\n");
		int selection = scan.nextInt();
		switch(selection) {
		
		// If they choose to login as an employee
		  case 1:
			  System.out.println("You have selected employee! Welcome back!\n");
			  System.out.println("Please enter your employee username\n");
			  String tryEmployeeUsername = scan.next();
			  System.out.println("Hello " + tryEmployeeUsername + "!\n" + "Now please enter your password");
			  String tryEmployeePassphrase = scan.next();
			  ManagerAccount managerAccount = managerDaoImp.getManagerByUsername(tryEmployeeUsername);
			  if (managerAccount == null) {
				  System.out.println("The username or password is incorrect!");
				  SignIn();
			  }
			  try {
				  boolean signInSuccess = managerAccount.getPassphrase().equals(tryEmployeePassphrase);
				  if (signInSuccess == true) {
						System.out.println("Sign in successfull");
						System.out.println("Welcome back, " + tryEmployeeUsername + "\n");
						EmployeeLoggedMenu.EmployeeLoggedMenuSelect();	  		
				  }
				  else if (signInSuccess == false) {
					System.out.println("Username or password incorrect");
					SignIn();
				  }}
			  catch (Exception e) {
				System.out.println("Username or password incorrect\n");
				SignIn();
			}
				break;
//=================================================================================
// If they choose to login as a customer
		  case 2:
			  System.out.println("You have selected to login as a customer! Welcome back!\n");
			  System.out.println("Please enter your username!");
			  String tryCustomerUsername = scan.next();
			  System.out.println("Hello, " + tryCustomerUsername + "\nPlease type in your password");
			  String tryCustomerPassphrase = scan.next();
			  
			  CustomerAccount customerAccount = customerDaoImp.getCustomerByUsername(tryCustomerUsername);
			  System.out.println(customerAccount);
			  
			  if (customerAccount == null) {
				  System.out.println("The username or password is incorrect!");
				  System.out.println(customerAccount);
				  SignIn();
			  }
			  
			  
			  try {
				  boolean customerSignInSuccess = customerAccount.getPassphrase().equals(tryCustomerPassphrase);
				  if (customerSignInSuccess == true) {
					  
						System.out.println("Sign in successfull");
						System.out.println("Welcome back, " + tryCustomerUsername + "\n");
						System.out.println("==========Customer Main Menu ============");
						System.out.println("Please make your selection");
						System.out.println("1.) View your current balance");
						System.out.println("2.) View your last completed transaction");
						System.out.println("3.) Log Out");
						int customerSelection = scan.nextInt();
						System.out.println(customerSelection);
						
						switch(customerSelection) {
						case 1:
							System.out.println("You have selected to view your current balance");
							System.out.println(customerAccount);
							System.out.println(customerAccount.getBalance() + "<--- Current Customer Balance");
							System.out.println("Would you like to do anything else?\n1.) See your last transaction\n2.) Log Out");
							int anythingElse = scan.nextInt();
							switch (anythingElse) {
							case 1:
								System.out.println("You have selected to view your last Transaction");
								System.out.println(customerAccount.getLastTransaction() + "<--- Last Customer Transaction");
								System.out.println("Thank you banking with us. Logging you out. Goodbye!");
								MenuInterface.MenuSelect();
								break;
							case 2:
								System.out.println("you have selected to Log Out. \nGoodbye!");
								MenuInterface.MenuSelect();
								break;
						
							default:
								System.out.println("Unrecongnized input...\nReturning to main menu");
								MenuInterface.MenuSelect();
								break;
							}
						case 2: 
							System.out.println("You have selected to view your last Transaction");
							System.out.println(customerAccount.getLastTransaction() + "<--- Last Customer Transaction");
							System.out.println("Please make your selection\n1.) View Current Balance\n2.) Log out");
							int afterTransactionView = scan.nextInt();
							switch(afterTransactionView) {
							case 1:
								System.out.println(customerAccount.getBalance() + "<--- Current Customer Balance");
								System.out.println("Thank you banking with us. Logging you out. Goodbye!");
								MenuInterface.MenuSelect();
								break;
								default: 
									System.out.println("Unrecongnized input...\nReturning to main menu");
									break;
							} 
							break;
						default:
							break;
						}
					}
				  else if (customerSignInSuccess == false) {
					System.out.println("Username or password incorrect");
					SignIn();
				  }}
			  catch (Exception e) {
				System.out.println("Username or password incorrect\n");
				SignIn();
			}  
		}
		}
	}