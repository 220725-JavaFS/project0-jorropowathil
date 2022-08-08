package com.revature.models;

public class BaseEmployee {

	public class EmployeeAccount {
		// From Sign in controller
		private String firstName;
		private String lastName;
		private String newUsername;
		private String newPassword;
		//Other
		private String userId;
		
		
		public EmployeeAccount(String userId, String firstName, String lastName, String newUsername, String newPassword){
			super();
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.newUsername = newUsername;
			this.newPassword = newPassword;
		}
		
		public EmployeeAccount() {
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
