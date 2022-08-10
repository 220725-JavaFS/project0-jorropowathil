package com.revature.daos;

import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;

public interface ManagerDao {

	CustomerAccount getCustomerById(int userId);
	CustomerAccount atmService(int userId, int transactionAmount);
	ManagerAccount getManagerByUsername (String username);
	

}
