<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<style>

@
keyframes spin { 100% {
	transform: rotate(360deg);
}

}
.center {
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
}

/* KEYFRAMES */

@keyframes spin {
  from {
    transform: rotate(0);
  }
  to{
    transform: rotate(359deg);
  }
}

@keyframes spin3D {
  from {
    transform: rotate3d(.5,.5,.5, 360deg);
  }
  to{
    transform: rotate3d(0deg);
  }
}

@keyframes configure-clockwise {
  0% {
    transform: rotate(0);
  }
  25% {
    transform: rotate(90deg);
  }
  50% {
    transform: rotate(180deg);
  }
  75% {
    transform: rotate(270deg);
  }
  100% {
    transform: rotate(360deg);
  }
}

@keyframes configure-xclockwise {
  0% {
    transform: rotate(45deg);
  }
  25% {
    transform: rotate(-45deg);
  }
  50% {
    transform: rotate(-135deg);
  }
  75% {
    transform: rotate(-225deg);
  }
  100% {
    transform: rotate(-315deg);
  }
}

@keyframes pulse {
  from {
    opacity: 1;
    transform: scale(1);
  }
  to {
    opacity: .25;
    transform: scale(.75);
  }
}

/* GRID STYLING */

* {
  box-sizing: border-box;
}

body {
  min-height: 100vh;
  background-color: #37474f;
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
  align-items: flex-start;
}

.loader {
  border: 12px solid #f3f3f3;
  border-radius: 50%;
  border-top: 12px solid #444444;
  width: 70px;
  height: 70px;
  animation: spin 1s linear infinite;
  width: 300px;
  height: 300px;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: transparent;
}

/* X-ROTATING BOXES */

.configure-border-1 {
  width: 115px;
  height: 115px;
  padding: 3px;
  position: absolute;
  display: flex;
  justify-content: center;
  align-items: center;
  background: #ffab91;
  animation: configure-clockwise 3s ease-in-out 0s infinite alternate;
}

.configure-border-2 {
  width: 115px;
  height: 115px;
  padding: 3px;
  left: -115px;
  display: flex;
  justify-content: center;
  align-items: center;
  background: rgb(63,249,220);
  transform: rotate(45deg);
  animation: configure-xclockwise 3s ease-in-out 0s infinite alternate;
}

.configure-core {
  width: 100%;
  height: 100%;
  background-color: #37474f;
}

</style>
</head>
<body>

	<div class="loader">
		<div class="configure-border-1">
			<div class="configure-core"></div>
		</div>
		<div class="configure-border-2">
			<div class="configure-core"></div>
		</div>
	</div>

	<h1>Yor are in ${ country }</h1>
	<script>
		
		document.onreadystatechange = function() {
			if (document.readyState !== "complete") {
				document.querySelector("body").style.visibility = "hidden";
				document.querySelector("#loader").style.visibility = "visible";
			} else {
				document.querySelector("#loader").style.display = "none";
				document.querySelector("body").style.visibility = "visible";
			}
		};
	</script>
</body>
</html>