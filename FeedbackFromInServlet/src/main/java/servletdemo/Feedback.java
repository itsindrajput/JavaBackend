package servletdemo;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class Feedback extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is the third way to create servlet");
        resp.setContentType("text/html"); 

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (name != null && !name.isEmpty() &&
            email != null && !email.isEmpty() &&
            password != null && !password.isEmpty()) {
        	
//        	resp.getWriter().println("Name: " + name);
//        	resp.getWriter().println("Email: " + email);
//          resp.sendRedirect("welcome.jsp");
        	
        	String encodedName = URLEncoder.encode(name, "UTF-8");
            String encodedEmail = URLEncoder.encode(email, "UTF-8");
            resp.sendRedirect("welcome.jsp?name=" + encodedName + "&email=" + encodedEmail);
            
//            // Set attributes to send to JSP without using URL
//            req.setAttribute("name", name);
//            req.setAttribute("email", email);
//            
//            // Forward to welcome.jsp
//            RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
//            rd.forward(req, resp);

        } else {
            resp.getWriter().println("<h3 style='color:red;'>All fields are required!</h3>");
        }
    }
}
