<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
	<head>
		<title><tiles:insertAttribute name="title"/></title>
	</head>
	<body>
		<table width="900" cellspacing="0" align="center">
			<tr >
				<td colspan="2" bgcolor="#aaaaaa">
					<tiles:insertAttribute name="header"/>
				</td>
			</tr>
			<tr height="300">
				<td width="150" valign="top" bgcolor="#999900">
					<tiles:insertAttribute name="menu"/>
				</td>
				<td width="750" valign="center" align="center">
					<tiles:insertAttribute name="body"/>
				</td>
				
			</tr>
			<tr>
				<td colspan="2" height="70" width="900" bgcolor="999999">
					<tiles:insertAttribute name="footer"/>
				</td>
			</tr>
		</table>
	</body>
</html>