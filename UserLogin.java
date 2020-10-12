package com.webapp.model;

public class UserLogin {
	private String userName="john";
    private String userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserLogin [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
}
