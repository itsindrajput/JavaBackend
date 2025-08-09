package servletdemo;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class SecondOne extends GenericServlet{
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This is the 2nd Way to create Servlets!");
		arg1.setContentType("Text/Html");
		arg1.getWriter().println("<h1>Hey From Generic Servlet.!</h1>");
	}

}
