<%--
  Created by IntelliJ IDEA.
  User: madi
  Date: 11.02.24
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>


<html>
<head>
    <title>Logout</title>
</head>
<body>

<%
            HttpSession currentSession = request.getSession(false);

    if (currentSession != null) {
        currentSession.invalidate();

    }
            response.sendRedirect("index.html");

%>

</body>
</html>
