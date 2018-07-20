package com.suti.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CommanDAO{
	private static CommanDAO commanDAOObject;
	private CommanDAO() {}
	
	public static CommanDAO getObject() {
		synchronized (CommanDAO.class) {
			if(commanDAOObject==null)
				return commanDAOObject=new CommanDAO();
		}
		
		return commanDAOObject;
	}
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		Class.forName(rb.getString("driver"));
		Connection connection = DriverManager.getConnection(rb.getString("url"),rb.getString("userName"),rb.getString("password"));
		return connection;
	}
}
