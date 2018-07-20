<html>
<head>
<title>Elasticsearch</title>

<script type="text/javascript" src="libs/jquery-3.3.1.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/action.js"></script>
</head>
<body class="container">
	<h2>CRUD Operation</h2>
	<!-- <form action="search" method="post" id="frm"> -->
	<h3>Search document</h3>
		<div class="input-group">
			<input type="text" class="form-control input-lg" placeholder="Search" name="searchText" id="searchText">
			<div class="input-group-btn">
				<button class="btn btn-info btn-lg"  id="searchBtn">
					<i class="glyphicon glyphicon-search"></i>
				</button>
			</div>
		</div>
		<div id="searchData"></div>
	<!-- </form> -->

	<!-- <form action="insert" method="post"> -->
	<h3>Insert document</h3>
		<table class="table">
			<tr>
				<td><label for="">Id</label></td>
				<td><input type="text" name="id" class="form-control" id="id"></td>
			</tr>
			<tr>
				<td><label for="">Name</label></td>
				<td><input type="text" name="name" class="form-control" id="name"></td>
			</tr>
			<tr>
				<td><label for="">Email</label></td>
				<td><input type="text" name="email" class="form-control" id="email"></td>
			</tr>
			<tr>
				<td><label for="">Phone</label></td>
				<td><input type="text" name="phone" class="form-control" id="phone"></td>
			</tr>
			<tr>
				<td><label for="">Salary</label></td>
				<td><input type="text" name="salary" class="form-control" id="salary"></td>
			</tr>
			<tr>
				<td><label for="">Description</label></td>
				<td><textarea rows="" cols="" name="description" class="form-control" rows="10" id="description"></textarea></td>
			</tr>
			<tr>
				<td></td>
				<td>
				
					<input type="button" value="reset" class="btn btn-default " id="insRefresh">
					<input type="button" value="Add" class="btn btn-success"  id="insertBtn">
					
				</td>
			</tr>
		</table>
	<!-- </form> -->

	<form action="delete" method="post">
	<h3>Delete document</h3>
		<div class="input-group">
			<input type="text" class="form-control input-lg" placeholder="Search" name="id">
			<div class="input-group-btn">
				<button class="btn btn-danger btn-lg" type="submit">
				 <span class="glyphicon glyphicon-trash"></span>
				</button>
			</div>
		</div>
	</form>
	
</body>
</html>
