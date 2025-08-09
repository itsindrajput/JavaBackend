<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Servlet Form</title>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/index.css" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous" />
</head>
<body>
  <div class="container d-flex justify-content-center">
    <div class="form-card col-md-6 text-center">
      <h2 class="mb-4">🚀 Welcome to Servlet World!</h2>

      <form method="post" action="<%= request.getContextPath() %>/third">
        <div class="mb-3">
          <input type="text" class="form-control form-control-lg" name="userInput" placeholder="Enter text here!" required>
        </div>
        <button type="submit" class="btn btn-custom btn-lg w-100">Submit</button>
      </form>

		<div class="output-box text-start">
		  <%
		    java.util.Date now = new java.util.Date();
		    String ip = request.getRemoteAddr();
		    String[] tips = {
		      "Keep coding, keep growing!",
		      "Debugging is twice as hard as writing the code.",
		      "Don't repeat yourself (DRY principle).",
		      "Focus on readability over cleverness."
		    };
		    int tipIndex = (int)(Math.random() * tips.length);
		  %>
		
		  <p>📅 <strong>Date & Time:</strong> <%= now.toString() %></p>
		  <p>🌐 <strong>Your IP Address:</strong> <%= ip %></p>
		  <p>💡 <strong>Tip of the Day:</strong> <span class="tip"><%= tips[tipIndex] %></span></p>
		</div>

    </div>
  </div>

  <script type="text/javascript" src="js/index.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>
