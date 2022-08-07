package com.revature.controllers;
import java.util.Scanner;

public class SignInInterface {
	
	
	
	public static void SignIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please pick your Username"); 
		String currentUsername = scan.next();
		System.out.println("Welcome back " + currentUsername + "\nPlease choose your password.");
		String currentPassword = scan.next();
		System.out.println(currentPassword + " is the password you typed");
		  
		  
//		  if (currentPassword equals("Database password")) {
//			  //Let user sign in and direct to appropriate controller
//		  };
//		  else (other valid){
//			  
//		  }
	}
}
