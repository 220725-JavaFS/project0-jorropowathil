package com.revature.controllers;

import java.util.Scanner;

import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;

public class NewUserInterface {
	
	public void NewUser() {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Please enter your first name");
		  
		  String newFirstName = scan.next();
		  System.out.println("Hello, " + newFirstName + ". Please enter your last name ");
		  
		  String newLastName = scan.next();
		  System.out.println("Welcome " + newFirstName + " " + newLastName + ", please pick your Username");
		  
		  String newUsername = scan.next();
		  System.out.println("Your selected username is " + newUsername);
		  
		  System.out.println("\nPlease choose your password.");
		  String newPassword = scan.next();
		  
		  System.out.println("Please confirm your password");
		  String confirmPassword = scan.next();
	}
}
