<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Popup demo</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function popUp(){
		$('#name').val();
	}
</script>
</head>
<body class="container">
	<h2>Popup Demo</h2>
	<form action="empAction" id="frm">
		<input type="submit" value="click me">
		<s:if test="employeeList != null">
		<s:select list="employeeList" listValue="employeeName" id="name" onchange="popUp()"/>
		</s:if>
	</form>
	<div class="container">
		<!-- Trigger the modal with a button -->
		<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
			data-target="#myModal">Open Modal</button>
		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Modal Header</h4>
					</div>
					<div class="modal-body">
					<table>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Mobile</th>
						<th>Phone</th>
						<th>Address</th>
						<th>Signature</th>
						<th>Company Id</th>
						<th>Status Id</th>
						<th>Type Name</th>
						<th>Notification</th>
						<th>Need Daily Report</th>
						
						<s:if test="employeeList != null">
						<s:iterator value="employeeList">

							<tr>
								<td><s:property value="employeeId" /></td>
								<td><s:property value="employeeName" /><td> <s:property value="employeeLastName" /></td></td>
								<td><s:property value="employeeEmail" /></td>
								<td><s:property value="employeeMobile" /></td>
								<td><s:property value="employeePhone" /></td>
								<td><s:property value="employeeAddress" /></td>
								<td><s:property value="employeeSignature" /></td>
								<td><s:property value="employeeCompanyId" /></td>
								<td><s:property value="employeeStatusId" /></td>
								<td><s:property value="employeeTypeName" /></td>
								<td><s:property value="employeeNotification" /></td>
								<td><s:property value="employeeNeedDailyReport" /></td>
							</tr>
							
						</s:iterator></s:if>
					</table>	
						
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
