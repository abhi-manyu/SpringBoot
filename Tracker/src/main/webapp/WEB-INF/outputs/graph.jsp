<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*"%>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
<%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
 
map = new HashMap<Object,Object>(); 
map.put("label", "FY07");
map.put("y", 188);
list.add(map);

map = new HashMap<Object,Object>(); map.put("label", "FY08"); map.put("y", 55); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "FY09"); map.put("y", 213); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "FY10"); map.put("y", 15); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "FY11"); map.put("y", 207); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "FY12"); map.put("y", 167); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "FY13"); map.put("y", 136); list.add(map);
/* map = new HashMap<Object,Object>(); map.put("label", "FY14"); map.put("y", 566); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "FY15"); map.put("y", 129); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "FY16"); map.put("y", 10); list.add(map);
  */
String dataPoints = gsonObj.toJson(list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</head>
<body style="background-color: black;">
    <div id="chartContainer" style="height: 370px; width: 10cm;"></div>
</body>

<script type="text/javascript">
window.onload = function() { 
 
var chart = new CanvasJS.Chart("chartContainer", {
	/* theme: "light2", */
	theme: "dark2",
	title: {
		text: "Iron Ore Production in India"
	},
	axisX: {
		title: "Fiscal Year"
	},
	axisY: {
		title: "Production ( in million tonnes )"
	},
	data: [{
		type: "spline",
		yValueFormatString: "#,##0mn tonnes",
		dataPoints : <%out.print(dataPoints);%>
	}]
});
chart.render();
 
}
</script>

</html>