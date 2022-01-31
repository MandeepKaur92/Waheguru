<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="main.css" type="text/css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<img src="logo3.jpg"><br><br>
    
    <h1>Group No. -5</h1>
    <h2>Team Member:</h2>
    <h4>Mandeep Kaur</h4>
    <h4>Karanbir Kaur</h4>
    <h4>Manpreet Singh</h4>
    <h4>Harsimran Singh</h4>
  
    Min:<% out.print(""+request.getAttribute("min"));%><br><br>
    Max:<% out.print(""+request.getAttribute("max"));%><br><br>
    Avg:<% out.print(""+request.getAttribute("avg"));%><br><br>
    Grades:<% out.print(""+request.getAttribute("grades"));%><br><br>
    <form action="Outline" method="post">  
	 <button>click here to see outline</button>
	</form>
    
   
       
</body>
</html>