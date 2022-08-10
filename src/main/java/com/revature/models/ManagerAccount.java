package com.revature.models;
	

public class ManagerAccount {
		//Other
		private String managerId;
		// From Sign in controller
		private String firstName;
		private String lastName;
		private String username;
		private String passphrase;
		
		
		
		public ManagerAccount(String managerId, String firstName, String lastName, String username, String passphrase){
			super();
			this.managerId = managerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.username = username;
			this.passphrase = passphrase;
		}
		
		public ManagerAccount() {
			super();
		}
		

		private void setNewPassphrase(String passphrase) {
			this.passphrase = passphrase;
		}

		private String getManagerId() {
			return managerId;
		}

		private void setManagerId(String managerId) {
			this.managerId = managerId;
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
			return username;
		}

		public void setNewUsername(String username) {
			this.username = username;
		}

		public String getPassphrase() {
			return passphrase;
		}

		public void setPassphrase(String passphrase) {
			this.passphrase = passphrase;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	}

