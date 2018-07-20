<%@ taglib prefix="s" uri="/struts-tags" %>
<center>
<h1>login</h1>
<s:form action="login_checkLogin">
<s:textfield name="userName" label="Username" placeholder="Username"/>
<s:password name="password" label="Password" placeholder="Password"/>
<s:submit value="Login"/>
</s:form>
</center>