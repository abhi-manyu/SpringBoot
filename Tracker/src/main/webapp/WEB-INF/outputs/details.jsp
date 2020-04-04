<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="http://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
<script
	src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
<style>
th {
	color: #6011B9;
	font-size: 20px;
	background-color: #b3ffcc;
}

h1 {
	text-align: center;
}

.conf {
	float: left;
}

.death {
	float: right;
	color: red;
	margin-right: 10px;
}
</style>
</head>
<body>

	<h1>Tracking</h1>
	<div class="conf">
		<h4>Total confirmed cases: ${ total }</h4>
	</div>
	<div class="death">
		<h4>Total deaths : ${ tot_death }</h4>
	</div>
	<div class="container">
		<table id="myTable"
			class="table table-striped table-bordered table-sm myTable">
			<thead>
				<tr>
					<th class="th-sm">Country</th>
					<th class="th-sm">total confirmed cases</th>
					<!-- <th class="th-sm">total Deaths</th>
					<th class="th-sm">total Active</th>
					<th class="th-sm">total Recovered</th> -->
				</tr>
			<thead>
			<tbody>
				<c:forEach var="data" items="${data}">
					<tr id="data">
						<td>
						   <a href="./${data.country}">
						      <c:out value="${data.country}" />
						   </a>
						</td>
						<td><c:out value="${data.total_Confirmed_Cases}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<h1>All Right Reserved</h1>
	<h1>All Data source is taken from World Health Organisation</h1>
	<h1>Reference- JOhn Hompkins university</h1>
	<script>
	
		$(document).ready(function() {
			$("#myTable").DataTable();
		});
	</script>
</body>
</html>
