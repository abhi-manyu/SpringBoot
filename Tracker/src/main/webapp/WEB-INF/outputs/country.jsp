<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
#heading {
	color: yellow;
	text-align: center;
}

img {
	height: 150px;
	width: 100%;
}

div [class^="col-"] {
	padding-left: 10px;
	padding-right: 10px;
}

.card {
	transition: 0.5s;
	cursor: pointer;
}

.card-title {
	font-size: 15px;
	transition: 1s;
	cursor: pointer;
	color: yellow;
}

.card-title-death {
	color: red;
	font-size: 20px;
	transition: 1s;
}

.card-title i {
	font-size: 15px;
	transition: 1s;
	cursor: pointer;
	color: #ffa710
}

.card-title i:hover {
	transform: scale(1.25) rotate(100deg);
	color: yellow;
}

.card:hover {
	transform: scale(1.05);
	box-shadow: 10px 10px 15px rgba(0, 0, 0, 0.3);
}

.card-text {
	height: 80px;
}

.card::before, .card::after {
	position: absolute;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	transform: scale3d(0, 0, 1);
	transition: transform .3s ease-out 0s;
	background: rgba(255, 255, 255, 0.1);
	content: '';
	pointer-events: none;
}

.card::before {
	transform-origin: left top;
}

.card::after {
	transform-origin: right bottom;
}

.card:hover::before, .card:hover::after, .card:focus::before, .card:focus::after
	{
	transform: scale3d(1, 1, 1);
}
</style>
<meta charset="ISO-8859-1">
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


</head>
<body style="background-color: black;">
	<h1 id="heading">u r in ${ country.country } now</h1>

	<div class="container mt-2">
		<div class="row">
			<div class="col-md-4 col-sm-6">
				<div class="card card-block">
					<h4 class="card-title text-center">
						total confirmed as Of now  : ${ country.total_Confirmed_Cases }
					</h4>
					<img
						src="https://bit.ly/2wnTnC4"
						alt="confirmed">
				</div>
			</div>
			<div class="col-md-4 col-sm-6">
				<div class="card card-block">
					<h4 class="card-title-death text-center">
						total death as of now : ${country.total_Deaths }
					</h4>
					<img src="https://bit.ly/2QHniMd"
						alt="dead">
				</div>
			</div>
			<div class="col-md-4 col-sm-6">
				<div class="card card-block">
					<h4 class="card-title text-center">
						total recoverd as of now : ${ country.total_Recovered }
					</h4>
					<img
						src="https://bit.ly/2J7fDTr"
						alt="recovered">
				</div>
			</div>
			
		</div>

	</div>



</body>
</html>