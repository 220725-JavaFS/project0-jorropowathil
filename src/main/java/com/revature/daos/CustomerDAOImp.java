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

	
	
	public static void main (String[] args) {
		CustomerDAOImp test = new CustomerDAOImp();
		test.getCustomerById(0);
	}

	@Override
	public CustomerAccount getCustomerById(int userId) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM customer WHERE user_id = "+userId+";";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) { //resultSets are cursor based, each time .next is called the cursor moves to the next group of values. 
				//It starts one before so you always need to call next.
				CustomerAccount customerAccount = new CustomerAccount(
						result.getString("user_id"),
						result.getInt("balance"),
						result.getInt("lastTransaction"),
						result.getString("firstName"),
						result.getString("lastName"),
						result.getString("newUsername"),
						result.getString("newPassword")
						);
				return customerAccount;
				}	
			}		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
//	@Override
//	public void getCustomerBalance(CustomerAccount customerAccount) {
//	}
	
	
	
	
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
