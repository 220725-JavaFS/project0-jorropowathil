package com.revature.controllers;
import java.util.Scanner;

import com.revature.daos.*;
import com.revature.models.ManagerAccount;



public class SignInInterface {
	
	ManagerDao managerDaoImp = new ManagerDaoImp();
	
	public boolean SignIn() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome Back! \n" + "Please enter your username!"); 
		String currentUsername = scan.next();
		System.out.println("Hello, " + currentUsername + "\nPlease type in your password");
		String currentPassword = scan.next();
		System.out.println(currentPassword + " is the password you typed");
		
		
		ManagerAccount managerAccount = managerDaoImp.getManagerByUsername(currentUsername);
		 
		System.out.println();
		
		boolean signInSuccess = managerAccount.getPassphrase().equals(currentPassword);
		if (signInSuccess = true) {
			System.out.println("Sign in successfull");
		}
		else {
			System.out.println("Sign in failed");
		}
		
		return signInSuccess;
	}
}