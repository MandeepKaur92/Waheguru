<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

  
    Min:<% out.print(""+request.getAttribute("min"));%><br><br>
    Max:<% out.print(""+request.getAttribute("max"));%><br><br>
    Avg:<% out.print(""+request.getAttribute("avg"));%><br><br>
    Grades:<% out.print(""+request.getAttribute("grades"));%><br><br>
    
    
   
       
</body>
</html>