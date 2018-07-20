package com.suti.validation;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction {
	private String userName;
	private String password;
	
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String phone;
	private String message;
	
	
	
	public String register() {
		this.setMessage("Congratulations Your registration has been completed...!");
		return "registerSuccess";
	}
	
	public String login() {
		if(this.getUserName().equalsIgnoreCase(this.getPassword())) {
			return "loginSuccess";
		}
		return "loginFail";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
