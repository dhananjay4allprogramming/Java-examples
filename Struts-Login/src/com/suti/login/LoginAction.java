package com.suti.login;

public class LoginAction {
	private String userName;
	private String password;
	private String message;
	
	/*public String checkLogin() {
		if(this.getUserName().equals(this.getPassword())) {
			return "success";
		}else {
			return "error";
		}
	}*/
	
	public String checkTest() {
		this.message="Test is done...";
		return "testSuccess";
	}
	
	public String login() {
		
		if(this.getUserName().equalsIgnoreCase(this.getPassword())) {
			return "success";
		}else {
			return "error";
		}
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
