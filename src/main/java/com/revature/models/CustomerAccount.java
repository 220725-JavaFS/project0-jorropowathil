package com.revature.models;

public class CustomerAccount {
	
	private String userId;
	//count the customer balance
	private int balance;
	private int lastTransaction;
	// From Sign in controller
	private String firstName;
	private String lastName;
	public String username;
	private String passphrase;
	//Other
	
	
	
	public CustomerAccount(String userId, int balance, int lastTransaction, String firstName, String lastName, String username, String passphrase){
		super();
		this.userId = userId;
		this.balance = balance;
		this.lastTransaction = lastTransaction;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.passphrase = passphrase;
	}
	
	@Override
	public String toString() {
		String output ="userId: " + userId + "\n" +
		"balance: " + Integer.toString(balance) + "\n" + 
		"lastTransaction: " + Integer.toString(lastTransaction) + "\n" + 
		"firstName: " + firstName + "\n" + 
		"lastName: " + lastName + "\n" + 
		"username: " + username + "\n" + 
		"password: " + passphrase + "\n";
		return output;
	}

	public CustomerAccount() {
		super();
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return username;
	}

	public Object getPassphrase() {
		// TODO Auto-generated method stub
		return passphrase;
	}
	
//	public String toString() {
//		return "CustomerAccount [" + firstName+ " " + lastName + "]";
//	}
}

