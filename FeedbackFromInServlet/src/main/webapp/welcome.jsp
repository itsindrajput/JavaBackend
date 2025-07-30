<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Submission</title>
<style>
	.heading{
		color: red;
	}
	nav{
		display: flex;
		
	}
</style>
</head>
<body>
	<h1 class="heading">This is the third way to create servlet</h1>
	<nav>
		<ul>
			<li>Home</li>
			<li>About</li>
			<li>Contact</li>
			<li>Explore</li>
		</ul>
	</nav>
	
	<h1>Welcome, <%= request.getParameter("name") %>!</h1>
    <p>Your email is: <%= request.getParameter("email") %></p>
</body>
</html>