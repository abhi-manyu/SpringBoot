<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style>

th {
	color: red;
	font-size: 20px;
	background-color: #b3ffcc;
}

h2{
   text-align: center;
}
table {
	border:
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Tracking (Total cases reported through out world are : ${ total } )</h2>
	<div class="container">
		<table class="table" id="myTable">
		   <thead>
			<tr>
				<th scope="col" class="th-sm">Country</th>
				<th scope="col" class="th-sm">States</th>
				<th scope="col" class="th-sm">total no of cases</th>
			</tr>
		   <thead>
		   <tbody>
			<c:forEach var="data" items="${alldata}">
				<tr id="data">
					<td><c:out value="${data.country}" /></td>
					<td><c:out value="${data.state}" /></td>
					<td><c:out value="${data.total_as_of_Now}" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<script>
	   $(document).ready(function () {
       $('#myTable').DataTable();
       $('.dataTables_length').addClass('bs-select');
});
	</script>
</body>
</html>