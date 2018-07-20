package com.suti.actions;

import java.sql.SQLException;

import com.suti.DAO.LoginDAO;

public class LoginAction {
	private String userName;
	private String password;
	
	public String isPage() {
		return "success";
	}
	
	public String checkLogin() throws ClassNotFoundException, SQLException {
		return new LoginDAO().isLogin(getUserName(), getPassword()) ? "loginSuccess" : "failure";
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
	
}
