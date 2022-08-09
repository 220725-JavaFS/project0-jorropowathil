package com.revature.models;
	

public class ManagerAccount {
		//Other
		private String managerId;
		// From Sign in controller
		private String firstName;
		private String lastName;
		private String newUsername;
		private String newPassword;
		
		
		
		public ManagerAccount(String managerId, String firstName, String lastName, String newUsername, String newPassword){
			super();
			this.managerId = managerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.newUsername = newUsername;
			this.newPassword = newPassword;
		}
		
		public ManagerAccount() {
			super();
		}
		
		
		//Getters and setters
		private String getNewPassword() {
			return newPassword;
		}

		private void setNewPassword(String newPassword) {
			this.newPassword = newPassword;
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
			return newUsername;
		}

		public void setNewUsername(String newUsername) {
			this.newUsername = newUsername;
		}
	}

