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
            String id = request.getParameter("id");
            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("descripcion");
            String cantidad = request.getParameter("cantidad");
            

            String html = id + nombre + descripcion + cantidad;
        %>
        
        
        <h1>Hello World!</h1>
        <%= html %>
    </body>
</html>
