<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator Using JSP</title>
    <style>
        .calculator-container {
            background-color: #ffffff;
            padding: 40px 30px;
            border-radius: 12px;
            box-shadow: 0 8px 24px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            text-align: center;
            width: 100%;
			min-width: 600px;
			margin: 0 auto;
			background-color: yellow;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

        input[type="number"],
        select {
            width: 95%;
            padding: 10px 12px;
            margin: 12px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 16px;
            transition: all 0.3s ease-in-out;
        }

        input[type="number"]:focus,
        select:focus {
            border-color: #00aaff;
            outline: none;
            box-shadow: 0 0 5px rgba(0, 170, 255, 0.2);
        }

        input[type="submit"] {
            width: 95%;
            background: linear-gradient(135deg, #4facfe, #00f2fe);
            color: white;
            border: none;
            padding: 12px;
            font-size: 16px;
            border-radius: 8px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        input[type="submit"]:hover {
            background: linear-gradient(135deg, #00c6ff, #0072ff);
        }

        h3 {
            margin-top: 20px;
            color: #0b874b;
        }

        p {
            color: red;
            font-weight: 500;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="calculator-container">
        <h2>Simple Calculator</h2>

        <form method="post" action="">
            <input type="number" name="num1" placeholder="Enter first number" required>
            <input type="number" name="num2" placeholder="Enter second number" required>

            <select name="operation">
                <option value="add">Addition (+)</option>
                <option value="sub">Subtraction (-)</option>
                <option value="mul">Multiplication (*)</option>
                <option value="div">Division (/)</option>
            </select>

            <input type="submit" value="Calculate">
        </form>

        <%
            String op = request.getParameter("operation");
            String s1 = request.getParameter("num1");
            String s2 = request.getParameter("num2");

            if (s1 != null && s2 != null && op != null) {
                try {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double result = 0;

                    switch (op) {
                        case "add":
                            result = num1 + num2;
                            break;
                        case "sub":
                            result = num1 - num2;
                            break;
                        case "mul":
                            result = num1 * num2;
                            break;
                        case "div":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                out.println("<p>Division by zero is not allowed!</p>");
                            }
                            break;
                    }

                    if (!(op.equals("div") && num2 == 0)) {
                        out.println("<h3>Result: " + result + "</h3>");
                    }
                } catch (NumberFormatException e) {
                    out.println("<p>Invalid input. Please enter valid numbers.</p>");
                }
            }
        %>
    </div>
</body>
</html>
