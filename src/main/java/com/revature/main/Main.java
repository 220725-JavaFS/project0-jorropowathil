package com.revature.main;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		System.out.print("----------------------------Welcome to the employee database system!----------------------------\n"
				+ "Please make your selection\n"
				+ "1.) Login \n"+
				"2.) Sign Up\n" +
				"3.) Exit program");
		//New scanner variable start = to new scanner object that takes in system input
		Scanner scan = new Scanner(System.in);
		
		int selection = scan.nextInt();
		
		System.out.println("You selected " + selection);
		
		switch(selection) {
		  case 1:
			  System.out.println("Please enter your username");
			  
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
