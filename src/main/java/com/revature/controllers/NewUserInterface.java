package com.revature.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.daos.CustomerDAOImp;
import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;
import com.revature.util.ConnectionUtil;

public class NewUserInterface {
	
	public static void NewUser() {
		  System.out.println("-------------------------------------");
		  System.out.println("Thank you for signing up as a new customer in our baking System!");
		  Scanner scan = new Scanner(System.in);
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
//		  try(Connection conn = ConnectionUtil.getConnection()){
//				String sql = "INSERT INTO customerAccounts ("+user_id+", "+first_name+", "+lastname+",0,0, "+username+", "+passphrase+") VALUES ("+user_id+", \"+first_name+\", \"+lastname+\",0,0, \"+username+\", \"+passphrase+\");";"
//				Statement statement = conn.createStatement();
//				ResultSet result = statement.executeQuery(sql);
//				
//				if(result.next()) { //resultSets are cursor based, each time .next is called the cursor moves to the next group of values. 
//					//It starts one before so you always need to call next.
//					CustomerAccount customerAccount = new CustomerAccount(
//							result.getString("user_id"),
//							result.getInt("balance"),
//							result.getInt("last_Transaction"),
//							result.getString("first_name"),
//							result.getString("last_name"),
//							result.getString("username"),
//							result.getString("passphrase")
//							);
//					return customerAccount;
//					}	
//				}		
//			catch(SQLException e) {
//				e.printStackTrace();
//			}
//			return null;
//		}
//	}
//}

