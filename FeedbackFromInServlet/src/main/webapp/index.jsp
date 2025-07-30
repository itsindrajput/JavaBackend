<%@ page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Page</title>
</head>
<body>
	<h1>Signup Here!</h1>
	<form method="post" action="<%= request.getContextPath() %>/feedback">
		<label>Name: </label>
		<p><input name="name" type="text" placeholder="Enter Your Name" /></p>
		
		<label>Email: </label>
		<p><input name="email" type="email" placeholder="Enter Your Email" /></p>
		
		<label>Password: </label>
		<p><input name="password" type="password" placeholder="Enter Your Password" /></p>
		
		<button type="submit">Submit</button>
	</form>
	<p>Current Time: <%= new Date() %></p>
</body>
</html>