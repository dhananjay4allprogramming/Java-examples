<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jquary-ajax</title>
<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
<script type="text/javascript">
//first demo	
/* $(document).ready(function() {
	$('#btn').click(function() {
		//$('#result').load('JquaryAjaxDemo');
		$('#result').load('abc.txt');
	});
}); */

//second demo
$(document).ready(function() {
	$('#addition').click(function() {
		var sum = parseInt($('#num1').val())+parseInt($('#num2').val());
		$('#result').val(sum);
	});
	
	$('#substraction').click(function() {
		$('#result').val(parseInt($('#num1').val())-parseInt($('#num2').val()));
	});
	
	$('#multiplication').click(function() {
		$('#result').val(parseInt($('#num1').val())*parseInt($('#num2').val()));
	});
	
	$('#division').click(function() {
		var denum=parseInt($('#num2').val());
		
		if(denum!=0){
			$('#worn').html("");
			$('#result').val(parseInt($('#num1').val())/denum);
		}else{
			$('#worn').html("value shuld not be 0.");
		}
		
	});
		
});
 
 
 /* $(document).ready(function() {
	
}); */
 
</script>
</head>
<body>
	<!-- first demo -->
	<!-- <input id="btn" type="button" value="click me">
	<div id="result"></div> -->
	
	<!-- second demo -->
	
	
	<input type="text" id="num1">
	<input type="text" id="num2"><p id="worn"></p>
	<input type="text" id="result">
	<input type="button" value="+" id="addition">
	<input type="button" value="-" id="substraction">
	<input type="button" value="*" id="multiplication">
	<input type="button" value="/" id="division">
	
</body>
</html>