package com.revature.daos;

import com.revature.models.CustomerAccount;
import com.revature.models.ManagerAccount;

public interface ManagerDao {

	CustomerAccount getCustomerById(int userId);
	void atmServiceDeposit(int userId, int transactionAmount);
	void atmServiceWithdrawal(int userId, int transactionAmount);
	void atmLastTransaction(int userId, int transactionAmount);
	ManagerAccount getManagerByUsername (String username);
	
	

}
