package com.revature.models;

public class CustomerAccount {
	//count the customer balance
	private int balance;
	private int lastTransaction;
	// From Sign in controller
	private String firstName;
	private String lastName;
	private String newUsername;
	private String newPassword;
	//Other
	private String userId;
	//thing that customer can VIEW ONLY
	private int checkingBalance;
	private int creditBalance;
	private int transactionHistory;
	
	
	
	public CustomerAccount(String userId, int balance, int lastTransaction, String firstName, String lastName, String newUsername, String newPassword){
		super();
		this.userId = userId;
		this.balance = balance;
		this.lastTransaction = lastTransaction;
		this.firstName = firstName;
		this.lastName = lastName;
		this.newUsername = newUsername;
		this.newPassword = newPassword;
	}
	
	public CustomerAccount() {
		super();
	}
	
	
	//Getters and setters
	private String getNewPassword() {
		return newPassword;
	}

	private void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	private String getUserId() {
		return userId;
	}

	private void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getLastTransaction() {
		return lastTransaction;
	}

	public void setLastTransaction(int lastTransaction) {
		this.lastTransaction = lastTransaction;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNewUsername() {
		return newUsername;
	}

	public void setNewUsername(String newUsername) {
		this.newUsername = newUsername;
	}

	public int getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(int checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public int getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}

	public int getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(int transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	
//	public String toString() {
//		return "CustomerAccount [" + firstName+ " " + lastName + "]";
//	}
}

