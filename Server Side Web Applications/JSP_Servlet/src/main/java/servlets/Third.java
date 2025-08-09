package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class Third extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String userInput = req.getParameter("userInput");
        String html = """
        	    <!DOCTYPE html>
        	    <html>
        	    <head>
        	        <meta charset="UTF-8">
        	        <title>Submission Result</title>
        	        <style>
        	            body { font-family: Arial; padding: 30px; background: #f9f9f9; }
        	            .container { background: white; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); max-width: 600px; margin: auto; text-align: center; }
        	            ul { list-style: none; display: flex; justify-content: center; gap: 20px; color: #007bff; font-weight: bold; padding: 0; }
        	            h1 { color: green; }
        	            .input-display { margin-top: 20px; font-size: 1.2rem; color: #333; }
        	        </style>
        	    </head>
        	    <body>
        	        <div class="container">
        	            <ul>
        	                <li>Home</li>
        	                <li>About</li>
        	                <li>Contact</li>
        	            </ul>
        	            <h1>✅ Form Submitted!</h1>
        	            <div class="input-display">You entered: <strong>""";

        	html += userInput + "</strong></div></div></body></html>";

        	resp.getWriter().println(html);
    }
}
