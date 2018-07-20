package com.suti.DTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.suti.DAO.CommanDAO;
import com.suti.action.RegistrationAction;
import com.suti.constants.SQLConstants;

public class RegistrationDTO {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	RegistrationAction registrationAction;
	boolean isRegister = false;
	
	public boolean isRegisterationSuccess() throws SQLException, ClassNotFoundException {
		registrationAction = new RegistrationAction();
		connection = CommanDAO.getObject().getConnection();
		preparedStatement = connection.prepareStatement(SQLConstants.REGISTER_USER);
		preparedStatement.setInt(1, generateId());
		preparedStatement.setString(2, registrationAction.getName());
		preparedStatement.setString(2, registrationAction.getEmail());
		preparedStatement.setString(2, registrationAction.getAddress());
		preparedStatement.setString(2, registrationAction.getMobile());
		int status = preparedStatement.executeUpdate();
		if(status>0)
			isRegister=true;
		return isRegister;
	}
	
	public int generateId() throws SQLException, ClassNotFoundException {
		connection = CommanDAO.getObject().getConnection();
		preparedStatement = connection.prepareStatement(SQLConstants.REGISTRATION_ID);
		resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
			return 1 + resultSet.getInt(1);
		return 0;
	}
}
