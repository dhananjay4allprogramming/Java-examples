package com.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CommanDAO {
	private static CommanDAO commanDAOObject;

	public static CommanDAO getObject() {
		synchronized (CommanDAO.class) {
			if (commanDAOObject == null) {
				commanDAOObject = new CommanDAO();
			}
			return commanDAOObject;
		}
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		ResourceBundle bundle=ResourceBundle.getBundle("db");
		Class.forName(bundle.getString("driver"));
		Connection connection=DriverManager.getConnection(bundle.getString("url"),bundle.getString("userName"),bundle.getString("password"));
		return connection;
	}
}
