package com.suti.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.suti.SQL.SQLConstants;

public class LoginDAO {
	PreparedStatement pstmt;
	Connection connection;
	ResultSet reSet;
	public boolean isLogin(String userName , String password) throws ClassNotFoundException, SQLException {
		try {
			
			connection = CommanDAO.getObject().getConnection();
			if(connection!=null) {
				pstmt = connection.prepareStatement(SQLConstants.LOGIN);
				pstmt.setString(1, userName);
				pstmt.setString(2, password);
				reSet = pstmt.executeQuery();
				if(reSet.next())
					return true;
			}
		
		}finally {
			if(reSet!=null)
				reSet.close();
			if(pstmt!=null)
				pstmt.close();
			if(connection!=null)
				connection.close();
		}
		return false;
	}
}
