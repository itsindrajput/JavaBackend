<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Setup with Project</title>
    <link href="<%= request.getContextPath() %>/index.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%-- <p>Testing Error: <% out.println(10/0); %></p>--%>
    <%@ include file="calculator.jsp" %>
    
    <table border="1">
	  <thead>
	    <tr>
	      <th>JSP Directives</th>
	      <th>Scripting Elements</th>
	      <th>JSP Actions</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <td rowspan="3" class="rowspan1">
		      <em>page</em>
		      <em>include</em>
		      <em>taglib</en>
		      </td>
	      <td>Declaration</td>
	      <td>Standard Actions</td>
	    </tr>
	    <tr>
	      <td>Scriptlets</td>
	      <td>Custom Actions</td>
	    </tr>
	    <tr>
	      <td>Expressions<br>Comments</td>
	      <td></td>
	    </tr>
	  </tbody>
	</table>
	
    <main>
        <p>
            <%-- Addition and Multiplication Logic --%>
            <%! 
                int a = 10;
                int b = 20;
                int c = a + b;

                public float multiply(float x, float y) {
                    return x * y;
                }
            %>

            <% 
                out.println("Sum = " + c + "<br>");
                float x = 5.7f;
                float y = 6.9f;
                out.println("Multiply = " + multiply(x, y));
            %>
        </p>

        <p>
            Current Date and Time: <%= java.util.Calendar.getInstance().getTime() %>
        </p>
    </main>
</body>
</html>
