package com.suti.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 
 * @author dhananjayp
 *
 */
public class CommanDAO {
	private static CommanDAO commanDAOObject;
	private CommanDAO() {}

	/**
	 * Make singleton object for CommanDAO class
	 * @return CommanDAO class object 
	 */
	public static CommanDAO getObject() {
		synchronized (CommanDAO.class) {
			if(commanDAOObject==null)
				commanDAOObject = new CommanDAO();
		}
		return commanDAOObject;
	}
	
	/**
	 * This method return connection object
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection;
		ResourceBundle resourceBundle;
		
		resourceBundle= ResourceBundle.getBundle("DB");
		Class.forName(resourceBundle.getString("driver"));
		connection = DriverManager.getConnection(resourceBundle.getString("url"),
				resourceBundle.getString("username"),resourceBundle.getString("password"));  
		return connection;
	}
}
