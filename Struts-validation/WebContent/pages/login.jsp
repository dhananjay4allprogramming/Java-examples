<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> struts-validation</title>
</head>
<body>
	<div align="center" style="height: 500px; width: 500px; ">
		<s:form action="val_login">
			<s:textfield name="userName" placeholder="Username" label="Username"/>
			<s:password name="password" placeholder="Password" label="Password"/>
			<s:submit value="Login"/>
		</s:form>
	</div>
	
</body>
</html>