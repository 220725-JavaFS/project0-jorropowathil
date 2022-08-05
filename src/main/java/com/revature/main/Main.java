package com.revature.main;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		System.out.print("----------------------------Welcome to the employee database system!----------------------------\n");
		System.out.print("Please make your selection \n");
		System.out.print("1.) Login \n");
		System.out.print("2.) Sign Up\n");
		
		System.out.print("3.) Exit program \n");
		
		//New scanner variable start = to new scanner object that takes in system input
		Scanner scan = new Scanner(System.in);
		
		int selection = scan.nextInt();
		
		System.out.println("You selected " + selection);
		
		switch(selection) {
		  case 1:
			  System.out.println("Please enter your Username");
			  
			  String userName = scan.nextLine();
			  
			  
			  
			  break;
		  case 2:
			  System.out.println("You selected " + selection);		    break;
		  default:
		    // code block
		}

		
	
	
	
	}

}
