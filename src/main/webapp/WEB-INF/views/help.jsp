<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.time.LocalDateTime"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>This is help page</h1>
		<%
		/* String name = (String) request.getAttribute("name");
		Integer rollno = (Integer) request.getAttribute("rollNo");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
		%>
		<h1>Name 
			<%-- 		<%= name %> --%>		
 			${name}
 		</h1>
 		
		<h1>Roll No.
			<%-- 		<%= rollno %>--%>		
 			${rollNo}
 		</h1>
 		
		<h1>Time And Date
			<%-- 		<%= time %>--%>		
 			${time}
 		</h1>
 		
 		<hr>
		<%--  		List ${sname}--%>	
		
		<c:forEach var="item" items="${sname}">
		<h1>${item}</h1>
		</c:forEach>	
</body>
</html>