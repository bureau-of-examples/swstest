<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
      <link rel="stylesheet" type="text/css" href="<%= getServletConfig().getServletContext().getContextPath() + "/css/bootstrap.css" %>" />
      <link rel="stylesheet" type="text/css" href="<%= getServletConfig().getServletContext().getContextPath() + "/css/bootstrap-theme.css" %>" />
    <title>My Example java Web Project</title>

  </head>
  <body>
  <div class="container">
      <h1>Powered by Spring + Hibernate.</h1>
      <c:url var="testUrl" value="/console/test" />
      <a href="${testUrl}">Test Page</a>
  </div>



    <script src="<%= getServletConfig().getServletContext().getContextPath() + "/js/jquery.js" %>"></script>
  </body>
</html>