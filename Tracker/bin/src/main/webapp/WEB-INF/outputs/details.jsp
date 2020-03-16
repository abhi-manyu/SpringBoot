<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
	color: red;
	font-size: 20px;
	background-color: #b3ffcc; 
}
h2 {
	text-align: center;
}
</style>
</head>
<body>
	<h2>Tracking (Total cases reported through out world are : ${ total })</h2>
	<div class="container">
		<table id="myTable"
			class="table table-striped table-bordered table-sm myTable">
			<thead>
				<tr>
					<th class="th-sm">Country</th>
					<th class="th-sm">States</th>
					<th class="th-sm">total confirmed cases</th>
					<th class="th-sm">total Deaths</th>
					<th class="th-sm">total Recovered</th>
				</tr>
			<thead>
			<tbody>
				<c:forEach var="data" items="${alldata}">
					<tr id="data">
						<td><c:out value="${data.country}" /></td>
						<td><c:out value="${data.state}" /></td>
						<td><c:out value="${data.total_Confirmed_Cases}" /></td>
						<td><c:out value="${data.total_Deaths}" /></td>
						<td><c:out value="${data.total_Recovered}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script>
		$(document).ready(function() {
			$("#myTable").DataTable();
		});
	</script>
</body>
</html>
