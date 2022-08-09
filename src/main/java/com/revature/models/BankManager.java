package com.revature.models;

public class BankManager {
		public class BankManagerAccount {
			// From Sign in controller
			private String firstName;
			private String lastName;
			private String newUsername;
			private String newPassword;
			//Other
			private String bankManagerId;
			
			
			public BankManagerAccount(String bankManagerId, String firstName, String lastName, String newUsername, String newPassword){
				super();
				this.bankManagerId = bankManagerId;
				this.firstName = firstName;
				this.lastName = lastName;
				this.newUsername = newUsername;
				this.newPassword = newPassword;
			}
			
			public BankManagerAccount() {
				super();
			}
			
			
			//Getters and setters
			private String getNewPassword() {
				return newPassword;
			}

			private void setNewPassword(String newPassword) {
				this.newPassword = newPassword;
			}

			private String getBankManagerId() {
				return bankManagerId;
			}

			private void setBankManagerId(String bankManagerId) {
				this.bankManagerId = bankManagerId;
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
		}
	}