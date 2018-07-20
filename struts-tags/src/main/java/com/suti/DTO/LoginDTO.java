package com.suti.DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.suti.DAO.CommanDAO;
import com.suti.constants.SQLConstants;
/**
 * 
 * @author dhananjayp
 *
 */
public class LoginDTO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	/**
	 * This method is check the user name and password available in login database or not. 
	 * @param userName
	 * @param password
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean isValidLogin(String userName , String password ) throws ClassNotFoundException, SQLException {
		connection = CommanDAO.getObject().getConnection();
		preparedStatement = connection.prepareStatement(SQLConstants.LOGIN);
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
			return true;
		return false;
	}
}
