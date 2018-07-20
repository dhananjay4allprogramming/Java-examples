<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h1>Login</h1>
	<s:form action="test_login">
		<s:textfield name="userName" placeholder="Username" label="Username"/>
		<s:password name="password" placeholder="Password" label="password"/>
		<s:submit value="login"/>
	</s:form></center>
	<a href="test.jsp">test it</a>
</body>
</html>