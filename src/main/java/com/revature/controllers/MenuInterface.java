package com.revature.controllers;
import java.util.Scanner;

public class MenuInterface {
	

	
	public void MenuSelect() {
		System.out.println("Please make your selection\\n\"\r\n"
				+"1.) Login\n"
				+ "2.) Sign Up\n" 
				+ "3.) Exit program\n");
		
		Scanner scan = new Scanner(System.in);
		
		int selection = scan.nextInt();
		
		switch(selection) {
		  case 1:
			  System.out.println("You have selected to Login!");
			  
			  SignInInterface SignInInterface = new SignInInterface();
			  SignInInterface.SignIn();
			  
			  break;
			  
		  case 2:
			  System.out.println("Please pick your Username");
			  String newEmployee = scan.next();
			  System.out.println("Welcome back " + newEmployee + "\nPlease choose your password.");
			  String newPassword = scan.next();
			  System.out.println("Please confirm your password");
			  String confirmPassword = scan.next();
		
			  
			  if (newPassword.equals(confirmPassword.trim())) { 
				  System.out.println("Your password is: " + confirmPassword);
				  break;
			  }
			  else {
				  System.out.println(newPassword + "<---- Password 1");
				  System.out.println(confirmPassword+ "<---- Password 2");
				  System.out.println("They do not match! \nExiting program...");
				 
			  }
			  break;
		  case 3:
			  System.out.println("Exiting program! See you again soon!");
			  break;
		  default:
		}
	}

}
