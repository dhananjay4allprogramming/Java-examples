<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>struts-validation</title>
</head>
<body>
	<s:form action="val_register">
		<s:textfield name="firstName" placeholder="First name" label=" First name"/>
		<s:textfield name="lastName" placeholder="Last name" label="Last name"/>
		<s:textfield name="email" placeholder="Email@id" label="Email"/>
		<s:textfield name="address" placeholder="Address" label="Address"/>
		<s:textfield name="phone" placeholder="+91 9458001878" label="Phone no"/>
		<s:submit value="Register"/>
	</s:form>
</body>
</html>