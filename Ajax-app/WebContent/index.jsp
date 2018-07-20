<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX-Demo</title>
</head>

<script type="text/javascript">
	function AJAXAsyncRequest(reqURL) {
		var xmlHttp;
		if(window.XMLHttpRequest){
			xmlHttp = new XMLHttpRequest();
		}else{
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		xmlHttp.open("GET",reqURL,true);
		xmlHttp.onreadystatechange = function() {
			if(xmlHttp.readyState==4){
				if(xmlHttp.status==200){
					//document.getElementById("message").innerHTML = xmlHttp.responseText;
					document.getElementById("message").innerHTML = xmlHttp.responseText;
				}else{
					alert("Someting Going worng...!!");
				}
			}
		};
		
		xmlHttp.send(null);
	}
</script>
 
<body>
		<!-- <input type="button" value="Get server time" onclick='AJAXAsyncRequest("GetTimeServlet")'> -->
		<input type="button" value="Get server time" onclick='AJAXAsyncRequest("note.txt")'>
		<h3 id="message"></h3>
</body>
</html>	