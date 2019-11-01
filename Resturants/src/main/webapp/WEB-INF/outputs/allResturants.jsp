<%@page import="com.Resturant_API.example.beans.Resturant"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
   .resturants{
      text-decoration: none;
   }
</style>
</head>
<body>
     <h2>Here goes all ur recomended resturants</h2>
    <ul>
       <c:forEach var="resturant" items="${resturants}">
          <li>
            <h2>
              <a class="resturants" href="http://localhost:8080/resturants/${resturant.id}">
                 ${resturant.resturant_Name} ( &#9733 ${resturant.rating})
              </a>
            </h2>
          </li>
       </c:forEach>
    </ul>
</body>
</html> --%>






<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.flip-card {
  background-color: transparent;
  width: 5cm;
  height: 5cm;
  perspective: 500px;
  float: left;
  margin: 10px;
}
  
.flip-card-inner {
  position: relative;
  width: 5cm;
  height: 5cm;
  text-align: center;
  transition: transform 0.6s;
  transform-style: preserve-3d;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
}

.flip-card:hover .flip-card-inner {
  transform: rotateY(180deg);
}

.flip-card-front, .flip-card-back {
  position: absolute;
  width: 5cm;
  height: 5cm;
  backface-visibility: hidden;
}

.flip-card-front {
  background-color: #2980b9;
  color: black;
}

.flip-card-back {
  background-color: #bbb;
  color: white;
  transform: rotateY(180deg);
}
</style>
</head>
<body>

<h1>Here goes all ur recomended resturants</h1>

    <c:forEach var="resturant" items="${resturants}">
      <a href="http://localhost:8080/resturants/${resturant.id}">
        <div class="flip-card">
           <div class="flip-card-inner">
              <div class="flip-card-front">
                 <h2>
                    ${resturant.resturant_Name}<br>
                 </h2>
             </div>
             <div class="flip-card-back">
                <h1>&#9733 ${resturant.rating}</h1> 
            </div>
         </div>
      </div>
     </a>
    </c:forEach>

</body>
</html>



