<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

</head>
<body>
	<form action="login_checkLogin">
		<table align="center" cellpadding="2" cellspacing="2">
			<tr>
				<td><label for="userName">Username </label></td>
				<td><input type="text" name="userName" placeholder="Username"></td>
			</tr>
			
			<tr>
				<td><label for="password">Password </label></td>
				<td><input type="password" name="password" placeholder="Password"></td>
			</tr>
			
			<tr>
				<td></td>
				<td colspan="2" align="right"><input type="reset" value="Reset"> <input type="submit" value="Login"></td>
				
			</tr>
		</table>
	</form>
</body>
</html>