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
				
				
				
//				Still need to get customer Login to work 
		  case 2:
			  
			  System.out.println("You have selected to login as a customer! Welcome back!\n");
			  System.out.println("Please enter your username!");
			  String tryCustomerUsername = scan.next();
			  System.out.println("Hello, " + tryCustomerUsername + "\nPlease type in your password");
			  String tryCustomerPassphrase = scan.next();
			  
			  CustomerAccount customerAccount = customerDaoImp.getCustomerbyUsername(tryCustomerUsername);
			  
			  if (customerAccount == null) {
				  System.out.println("The username or password is incorrect!");
				  System.out.println(customerAccount);
				  SignIn();
			  }
			  
			  
			  try {
				  boolean customerSignInSuccess = customerAccount.getPassphrase().equals(tryCustomerPassphrase);
				  System.out.println(customerSignInSuccess);
				  if (customerSignInSuccess == true) {
						System.out.println("Sign in successfull");
						System.out.println("Welcome back, " + tryCustomerUsername + "\n");
						System.out.println("Need to create menu options!");
				  }
				  else if (customerSignInSuccess == false) {
					System.out.println("Username or password incorrect");
					SignIn();
				  }}
			  catch (Exception e) {
				System.out.println("Username or password incorrect\n");
				SignIn();
			}
			  
			  
			  
			  
			  
			  
			  
			  
			  
		}}}