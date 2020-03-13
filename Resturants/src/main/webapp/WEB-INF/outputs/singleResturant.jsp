<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
   h2 {
	color: #4d9900;
}
  #rest{
   text-align: center;
   display: block;
}
#rest_cont{
   display: block;
   align-items: flex-start;
   borde
}
</style>
</head>
<body>
    <div id="rest">
    <h2>Hii we have got ur favori8 resturant  : ${resturant.resturant_Name}</h2> 
      <div id="rest_cont">
        Id : ${resturant.id}<br>
        name : ${resturant.resturant_Name}<br>
        woner name : ${resturant.resturant_Woner}<br>
        Address : ${resturant.resturant_Address}<br>
        rating : ${resturant.rating}<br>
        established date : ${resturant.estd_Date}
      </div>
    </div>
</body>
</html>