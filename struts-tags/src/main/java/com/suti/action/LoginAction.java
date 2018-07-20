package com.suti.action;

import java.sql.SQLException;

import com.suti.DTO.LoginDTO;
import com.suti.constants.Status;

/**
 * 
 * @author dhananjayp
 *
 */
public class LoginAction {
	private String userName;
	private String password;
	
	
	/**
	 * This method to give the confirmation login success or failure.
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public String checkLogin() throws ClassNotFoundException, SQLException {
		return new LoginDTO().isValidLogin(getUserName(), getPassword())? Status.LOGIN_SUCCESS : Status.LOGIN_FAIL ;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
