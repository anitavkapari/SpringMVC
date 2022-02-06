<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>This is help page</h1>
		<%String name = (String) request.getAttribute("name");
		Integer rollno = (Integer) request.getAttribute("rollNo");
		LocalDateTime time = (LocalDateTime)  request.getAttribute("time");
		%>
		<h1>Name <%= name %></h1>
		<h1>Roll No.<%= rollno %></h1>
		<h1>Roll No.<%= rollno %></h1>
		
</body>
</html>