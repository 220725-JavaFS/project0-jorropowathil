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
	
	public CustomerAccount getUserId(int userId) {
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
			
				
				
				String homeName = result.getString("home_name");
				if(homeName!=null) {
					HomeDAO homeDao = new HomeDAOImpl();
					Home home = homeDao.getHomeByName(homeName);
					avenger.setHome(home);
				}
				
				return avenger;
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}
