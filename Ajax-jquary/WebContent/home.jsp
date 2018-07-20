<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('#btn').click(function() {
		$.ajax({
			url : 'JquaryAjaxDemo',
			data : {
				txt : $('#txt').val()
			},
			success : function(responseText) {
				$('#msg').text(responseText);
			}
		});
	});
});
</script>
</head>
<body>
		<input type="text" id="txt">
		<button id="btn">click me</button>
		<div id="msg"></div>
</body>
</html>