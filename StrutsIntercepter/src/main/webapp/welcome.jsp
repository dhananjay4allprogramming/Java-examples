<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>struts</title>
</head>
<body>

	<!-- Read data from properties file -->
	
	<%-- <s:i18n name="appresource">
		<s:property value="message" />
		<br>
		<s:text name="msg" />
	</s:i18n> --%>
	
	<!-- if practice -->
	
	<%-- <s:if test="message=='welcome aa'">
		Your name is Dhananjay
	</s:if>
	<s:elseif test="message=='welcome bb'">
		Your name is Satyam
	</s:elseif>
	<s:else>
		You are not Dhananjay
	</s:else> --%>
	
	<!-- itrate array list -->
	<%-- Country list : 
	<s:iterator value="country">
		<br><s:property/>
	</s:iterator> --%>
	
	<!-- itrate hashmap -->
	
	<%-- <s:iterator value="phones">
		<br><s:property value="key"/>&nbsp;<s:property value="value"/>
	</s:iterator> --%>
	
	<%-- <s:iterator status="status" value="{0,1}">
		index : <s:property value="%{#status.index}"/><br>
		count : <s:property value="%{#status.count}"/><br>
	</s:iterator> --%>
	
	<s:append var="comboList">
		<s:param value="%{list1}"/>
		<s:param value="%{list2}"/>
		<s:param value="%{list3}"/>
	</s:append>
	
	<s:iterator value="%{#comboList}">
		<s:property/>
	</s:iterator>
	
</body>
</html>