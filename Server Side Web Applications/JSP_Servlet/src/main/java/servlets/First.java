package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class First implements Servlet {

	private ServletConfig servletconfig;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletconfig = config;
		System.out.println("2nd method of slc.");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		res.getWriter().println("""
			<!DOCTYPE html>
			<html>
			<head>
			    <meta charset="UTF-8">
			    <title>First Servlet</title>
			    <style>
			        body {
			            background-color: #f0f4f8;
			            font-family: Arial, sans-serif;
			            text-align: center;
			            padding-top: 50px;
			        }
			        .box {
			            margin: auto;
			            width: 60%;
			            background: white;
			            padding: 30px;
			            border-radius: 10px;
			            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
			        }
			        h2 {
			            color: #007bff;
			        }
			    </style>
			</head>
			<body>
			    <div class="box">
			        <h2>✅ Welcome to the First Servlet</h2>
			        <p>This response was generated using the <strong>Servlet</strong> interface implementation.</p>
			        <p><em>Created by: Rishabh Kumar Singh</em></p>
			    </div>
			</body>
			</html>
		""");
	}

	@Override
	public void destroy() {
		System.out.println("4th method of slc.");
	}

	@Override
	public ServletConfig getServletConfig() {
		return servletconfig;
	}

	@Override
	public String getServletInfo() {
		return "Rishabh - I have created this servlet";
	}
}
