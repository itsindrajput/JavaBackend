package servlets;

import java.io.IOException;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Second extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        res.getWriter().println("""
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <title>GenericServlet Response</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                <style>
                    body {
                        background-color: #f4f6f8;
                        font-family: 'Segoe UI', sans-serif;
                        padding-top: 50px;
                    }
                    .card {
                        max-width: 600px;
                        margin: auto;
                        padding: 30px;
                        border-radius: 15px;
                        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
                        background: white;
                        text-align: center;
                    }
                    .card h2 {
                        color: #198754;
                    }
                    .card p {
                        color: #555;
                    }
                </style>
            </head>
            <body>
                <div class="card">
                    <h2>👋 Hello from GenericServlet!</h2>
                    <p>This response is generated using <strong>GenericServlet</strong>.</p>
                    <p>You’re successfully viewing dynamic content served from a Java class!</p>
                </div>
            </body>
            </html>
        """);
    }
}
