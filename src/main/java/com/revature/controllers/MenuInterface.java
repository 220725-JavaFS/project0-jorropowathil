package com.revature.controllers;
import java.util.Scanner;

public class MenuInterface {
	

	
	public static void MenuSelect() {
		System.out.println("\nPlease make your selection\n"+"1.) Login\n"+ "2.) Sign Up\n" + "3.) Exit program\n");
		try (Scanner scan = new Scanner(System.in)) {
			int selection = scan.nextInt();
			
			switch(selection) {
			  case 1:
				  System.out.println("You have selected to Login!\n");
				  SignInInterface SignInInterface = new SignInInterface();
				  SignInInterface.SignIn();
				  break;

			  case 2:
				  System.out.println("You have selected to Sign Up!\n");
				  System.out.println("Please enter your userId");
				  int user_id = scan.nextInt();
				  Scanner scan1 = new Scanner(System.in);
				  System.out.println("Please enter your first name");
				  
				  String first_name = scan1.next();
				  System.out.println("Hello, " + first_name + ". Please enter your last name ");
				  
				  String lastname = scan1.next();
				  System.out.println("Welcome " + first_name + " " + lastname + ", please pick your Username");
				  
				  String username = scan1.next();
				  System.out.println("Your selected username is " + username);
				  
				  System.out.println("\nPlease choose your password.");
				  String passphrase = scan1.next();
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

}
