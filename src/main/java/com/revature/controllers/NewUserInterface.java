package com.revature.controllers;

import java.util.Scanner;

import com.revature.daos.CustomerDAOImp;

public class NewUserInterface {
	
	public static void NewUser() {
		  System.out.println("-------------------------------------");
		  System.out.println("Thank you for signing up as a new customer in our baking System!");
		  try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter your first name");
			  String first_name = scan.next();
			  System.out.println("Hello, " + first_name + ". Please enter your last name ");
			  String lastname = scan.next();
			  System.out.println("Welcome " + first_name + " " + lastname + ", please pick your Username");
			  String username = scan.next();
			  System.out.println("Your selected username is " + username);
			  
			  
			  System.out.println("\nPlease choose your password.");
			  String passphrase = scan.next();
			  System.out.println("\nPlease confirm your password.");
			  String confirmPassphrase = scan.next();
			  
			  System.out.println(passphrase);
			  System.out.println(confirmPassphrase);
			  CustomerDAOImp.makeNewCustomerAccount(first_name, lastname, username, confirmPassphrase);
			  System.out.println("User: " + username + ", created.\nPlease try logging in!");
		}
		  MenuInterface.MenuSelect();

		  
//		  if (passphrase == confirmPassphrase) { 
//			 
//			  System.out.println("We did technically get this far!");
//			  
//		  }
//		  else{
//			  System.out.println("The passwords do not match please try again");
//			  System.out.println(passphrase);
//			  System.out.println(confirmPassphrase);
//			  NewUser();
//		  }
		  
	}

}