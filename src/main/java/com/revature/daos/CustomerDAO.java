package com.revature.daos;
import com.revature.models.CustomerAccount;



public interface CustomerDAO {
	CustomerAccount getCustomerById(int userId);
	CustomerAccount getCustomerbyUsername(String Username);
	
}
