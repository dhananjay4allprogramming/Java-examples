<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<title>Pagination Example</title>

</head>

<body bgcolor="">
<s:form action="student">

<display:table id="students" name="students" pagesize="2" export="false" requestURI="/student">
<display:column property="studentRoll" title="Roll" paramId="studentRoll" sortable="true"/>
<display:column property="studentName" title="Name" sortable="true"/>
<display:column property="studentCourse" title="Course" sortable="true" />
<display:setProperty name="paging.banner.placement" value="bottom" />
</display:table>

</s:form>
</body>
</html>