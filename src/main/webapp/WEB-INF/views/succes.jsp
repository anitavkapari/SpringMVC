<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome,${user.userName}</h3>
	<h3>Your Email Address ${user.userEmail}</h3>
	<h3>Your Password is ${user.userPassword} try to secure password</h3>
</body>
</html>