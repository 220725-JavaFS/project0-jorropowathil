package com.revature.controllers;
import java.util.Scanner;

public class SignInInterface {
	
	
	
	public void SignIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome Back! \n" + "Please enter your username!"); 
		String currentUsername = scan.next();
		System.out.println("Hello, " + currentUsername + "\nPlease type in your password");
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
