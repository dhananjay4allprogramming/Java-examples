package com.demo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	public ResultSet fetchData() throws ClassNotFoundException, SQLException {
		System.out.println("Employee dto run.... fetching data");
		
		PreparedStatement preparedStatement;
		Connection connection = CommanDAO.getObject().getConnection();
		preparedStatement = connection.prepareStatement("select * from employee");
		
		System.out.println("Employee dto run.... fetching data done... ");
		return preparedStatement.executeQuery(); 
	}
}
