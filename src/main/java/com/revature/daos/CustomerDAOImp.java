package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.revature.util.ConnectionUtil;
import com.revature.controllers.MenuInterface;
import com.revature.controllers.NewUserInterface;
import com.revature.controllers.SignInInterface;
import com.revature.models.CustomerAccount;



public class CustomerDAOImp implements CustomerDAO{
	@Override
	public CustomerAccount getCustomerById(int userId){
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customeraccounts WHERE user_id = "+userId+";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) { //resultSets are cursor based, each time .next is called the cursor moves to the next group of values. 
				//It starts one before so you always need to call next.
				CustomerAccount customerAccount = new CustomerAccount(
						result.getString("user_id"),
						result.getInt("balance"),
						result.getInt("last_Transaction"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getString("username"),
						result.getString("passphrase")
						);
				return customerAccount;
				}	
			}		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static CustomerAccount getCustomerByUsername (String username){
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customeraccounts WHERE username = "+username+";";
			Statement statement = conn.createStatement();
			System.out.println(statement);
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) { //resultSets are cursor based, each time .next is called the cursor moves to the next group of values. 
				//It starts one before so you always need to call next.
				CustomerAccount customerAccount = new CustomerAccount(
						result.getString("user_id"),
						result.getInt("balance"),
						result.getInt("last_Transaction"),
						result.getString("first_name"),
						result.getString("last_name"),
						result.getString("username"),
						result.getString("passphrase")
						);
				
				System.out.println(customerAccount);
				return customerAccount;
				
				}	
			}		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public CustomerAccount getCustomerbyUsername(String Username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static CustomerAccount makeNewCostumerAccount() {
		System.out.println("Please fill out the following information one at a time\n");
		try (Scanner scan = new Scanner(System.in)) {
			int selection = scan.nextInt();
		System.out.println("User Id: ");
		scan.nextInt();
		System.out.println("First name: ");
		String customerFirstName = scan.next();
		System.out.println("Last name: ");
		String customerLastName = scan.next();
		System.out.println("Username: ");
		String customerUsername = scan.next();
		System.out.println("Passphrase: ");
		

		
		
		}

	

	}}
