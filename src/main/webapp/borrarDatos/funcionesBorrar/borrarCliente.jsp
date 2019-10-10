<%-- 
    Document   : borrarElemento
    Created on : Oct 10, 2019, 10:58:54 AM
    Author     : kevinrojas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String cedula = request.getParameter("cedula");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            

            String html = cedula + nombre + apellidos + direccion + telefono;
        %>
        
        
        <h1>Hello World!</h1>
        <%= html %>
    </body>
</html>
