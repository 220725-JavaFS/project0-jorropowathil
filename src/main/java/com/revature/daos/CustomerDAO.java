package com.revature.daos;
import com.revature.models.CustomerAccount;



public interface CustomerDAO {
	CustomerAccount getCustomerById(int userId);
	CustomerAccount getCustomerbyUsername(String Username);
	CustomerAccount makeNewCustomerAccount = new CustomerAccount();
	static Object getPassphrase() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
