<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
	<head>
		<title><tiles:insertAttribute name="title"/></title>
	</head>
	<body>
		<table border="2" cellspacing="2" cellpadding="2" align="center">
			<tr>
				<td height="50" colspan="2" align="center"><tiles:insertAttribute name="header"/></td>			
			</tr>
			<tr>
				<td height="750" width="200"><tiles:insertAttribute name="menu"/></td>
				<td height="750" width="1000"><tiles:insertAttribute name="body"/></td>			
			</tr>
			<tr>
				<td height="80" colspan="2" align="center"><tiles:insertAttribute name="footer"/></td>			
			</tr>
		</table>
	</body>
</html>