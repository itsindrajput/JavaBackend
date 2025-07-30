package servletdemo;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstOne implements Servlet{

	//Sevlet Life Cycle Methods:
	
	private ServletConfig sevletconfig;
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.sevletconfig = arg0;
		System.out.println("Init Method Get Called!");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Service Method Get Called!");
		arg1.setContentType("text/html");
		arg1.getWriter().println("<h1>Hello From Servlet Interface!</h1>");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy Method Get Called!");
	}
	
	
	// Non Life cycle methods
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("ServletConfig Method Get Called!");
		return this.sevletconfig;
	}

	@Override
	public String getServletInfo() {
		String str = "This Sevlet is created by Rishabh Singh!";
		return str;
	}

}
