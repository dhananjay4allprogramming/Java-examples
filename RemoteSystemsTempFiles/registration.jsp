<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<table>
	
		<tr>
			<td><label for="emp_id">Employee ID </label></td>
			<td><input type="text" name="employeeID" readonly="readonly"></td>
		</tr>
		
		<tr>
			<td><label for="name">Name </label></td>
			<td><input type="text" name="name" placeholder="Enter your name"></td>
		</tr>
		
		<tr>
			<td><label for="email">Email ID </label></td>
			<td><input type="email" name="email" placeholder="Enter your Email ID"></td>
		</tr>
		
		<tr>
			<td><label for="address">Address </label></td>
			<td><input type="text" name="address" placeholder="Enter your address"></td>
		</tr>
		
		<tr>
			<td><label for="mobile">Mobile No </label></td>
			<td><input type="text" name="mobile" placeholder="Enter mobile no"></td>
		</tr>
		
		<tr>
			<td><input type="reset" value="Reset"></td>
			<td><input type="submit" value="Insert"></td>
		</tr>
		
	</table>
	
</body>
</html>