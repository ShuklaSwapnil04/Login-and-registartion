package com.webapp.model;

public class UserReg {
	private String name;
	private String userName;
    private String password;
    private String country;
    private char gender;
    
    
    
    private String msg;
    public UserReg() {}
    
    public UserReg(String msg) {
    	this.setMsg(msg);
    }
    
    
    
    
    
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserReg [name=" + name + ", userName=" + userName + ", password=" + password + ", country=" + country
				+ ", gender=" + gender + "]";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
