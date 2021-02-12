<%-- 
    Document   : horoscopo
    Created on : 12 feb. 2021, 10:55:21
    Author     : manue
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Horoscopo</h1>
        <form action="signo.jsp" method="post">
            <label for="nombre">Nombre:</label><input type="text" id="nombre" name="nombre"/>
            
            <br><label for="mes">Fecha de cumpleaños:<input type="date" name="fecha" id="fecha"></label>
                
                <br><input type="submit" value="Enviar">
        </form>
    </body>
</html>
