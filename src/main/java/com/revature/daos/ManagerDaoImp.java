package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;
import com.revature.util.ConnectionUtil;

public class ManagerDaoImp implements ManagerDao {

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



	
	
//These functions are for managers and Bank managers
//public CustomerAccount transaction(int userId) {
//	
//	try(Connection conn = ConnectionUtil.getConnection()){
//		String sql = "SELECT * FROM customeraccounts WHERE user_id = "+userId+";";
//		Statement statement = conn.createStatement();
//		ResultSet result = statement.executeQuery(sql);
//		
//		if(result.next()) { //resultSets are cursor based, each time .next is called the cursor moves to the next group of values. 
//			//It starts one before so you always need to call next.
//			CustomerAccount customerAccount = new CustomerAccount(
//					result.getString("user_id"),
//					result.getInt("balance"),
//					result.getInt("last_Transaction"),
//					result.getString("first_name"),
//					result.getString("last_name"),
//					result.getString("username"),
//					result.getString("passphrase")
//					);
//	
//			}	
//		
//		
//		String sql2 = "UPDATE customeraccounts set balance = "+balance+";"
//		
//		
//		}		
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//	
//	
//	try (Connection conn = ConnectionUtil.getConnection()){
//		
//	}
//	
//	
//	
//}

public ManagerAccount getManagerByUsername (String username){
	try(Connection conn = ConnectionUtil.getConnection()){
		String sql = "SELECT * FROM manageraccounts WHERE username = '"+username+"';";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		if(result.next()) { //resultSets are cursor based, each time .next is called the cursor moves to the next group of values. 
			//It starts one before so you always need to call next.
			ManagerAccount managerAccount = new ManagerAccount(
					result.getString("user_id"),
					result.getString("first_name"),
					result.getString("last_name"),
					result.getString("username"),
					result.getString("passphrase")
					);
			return managerAccount;
			}	
		}		
	catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
}


	
//}
		
	
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
