<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>To-Do List</title>
</head>
<body style="text-align: center; padding-top: 30px;">
    <h1>To-Do List</h1>

   <form action="add" method="post">
    <input type="text" name="task" placeholder="Enter Task" required>
    <button type="submit">Add Task</button>
	</form>


    <ul>
	    <c:forEach var="task" items="${tasks}" varStatus="status">
	        <li style="list-style-type: none; color: green; padding: 10px 0px;">
	            ${task}
	            <a href="${pageContext.request.contextPath}/delete?index=${status.index}" style="margin-left: 20px;">❌</a>
	        </li>
	    </c:forEach>
	</ul>

</body>
</html>
