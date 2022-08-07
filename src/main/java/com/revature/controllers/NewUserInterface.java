package com.revature.controllers;

import java.util.Scanner;

public class NewUserInterface {
	
	public void NewUser() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please pick your Username");
		  String newEmployee = scan.next();
		  System.out.println("Nice to meet you " + newEmployee + "\nPlease choose your password.");
		  String newPassword = scan.next();
		  System.out.println("Please confirm your password");
		  String confirmPassword = scan.next();
	
		  if (newPassword.equals(confirmPassword.trim())) { 
			  System.out.println("Welcome " + newEmployee + ", your passwords match and is saved as: " + confirmPassword);	  
			  System.out.println("Please try logging in!"+ "\n Returning to main menu...");
			  MenuInterface.MenuSelect();
		  }
		  else {
			  System.out.println(newPassword + "<---- Password 1");
			  System.out.println(confirmPassword+ "<---- Password 2");
			  System.out.println("They do not match! Please Try again! \nExiting program...");
			  // This will return the user to log in menu
			  MenuInterface.MenuSelect();
			 
		  }
	}
}
