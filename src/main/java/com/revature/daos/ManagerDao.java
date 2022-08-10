package com.revature.daos;

import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;

public interface ManagerDao {

	CustomerAccount getCustomerById(int userId);
	CustomerAccount atmService(int transaction);
	ManagerAccount getManagerByUsername (String username);
	

}
