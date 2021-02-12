<%-- 
    Document   : signo
    Created on : 12 feb. 2021, 12:51:40
    Author     : manue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String signo = (String)request.getAttribute("signo");%>
        <h1>Tu signo es: <%=signo%></h1>
    </body>
</html>
