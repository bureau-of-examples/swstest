<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: JOHNZ
  Date: 11/12/13
  Time: 5:02 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" type="text/css" href="<%= getServletConfig().getServletContext().getContextPath() + "/css/bootstrap.css" %>" />
    <link rel="stylesheet" type="text/css" href="<%= getServletConfig().getServletContext().getContextPath() + "/css/bootstrap-theme.css" %>" />
</head>
<body>
<%= new Date() %><br>
${message}

<script src="<%= getServletConfig().getServletContext().getContextPath() + "/js/jquery.js" %>"></script>
</body>
</html>