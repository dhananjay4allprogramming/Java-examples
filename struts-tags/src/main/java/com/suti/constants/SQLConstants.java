package com.suti.constants;
/**
 * 
 * @author dhananjayp
 *
 */
public interface SQLConstants {
	String LOGIN = "select user_login.user_name,user_login.password from user_login where user_name=? and password=?";
	String REGISTER_USER = "insert into registration (emp_id,name,email,address,mobile) values(?,?,?,?,?)";
	String REGISTRATION_ID = "select registration.emp_id from registration where emp_id=(select MAX(emp_id) from registration)";
}
