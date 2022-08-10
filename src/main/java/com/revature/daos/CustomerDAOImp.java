package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import com.revature.util.ConnectionUtil;


import com.revature.models.CustomerAccount;



public class CustomerDAOImp implements CustomerDAO{
	
//	public static void main (String[] args) {
//		CustomerDAOImp test = new CustomerDAOImp();
//		System.out.println(test.getCustomerById(3).toString());
//	}

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
	
	
	public CustomerAccount getCustomerByUsername (String username){
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customeraccounts WHERE username = "+username+";";
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


	@Override
	public CustomerAccount getCustomerbyUsername(String Username) {
		// TODO Auto-generated method stub
		return null;
	}
	


	
	
	
	
	
//These functions are for managers and Bank managers
//	public void depositMoney (CustomerAccount customerAccount) {	
//	}
//		
//	
//	public void withdrawMoney (CustomerAccount customerAccount) {
//	}
	
	
	
	
	
	
// To pull up all the customers in the database
//	public static void main(String[] args) {
//		CustomerDAO cDao = new CustomerDAOImp();
//		List<CustomerAccount> list = cDao.getAllCustomers();
//		System.out.println(list);
//		}
//	
//	
	
}
