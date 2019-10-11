<%-- 
    Document   : agregarServicio
    Created on : Oct 9, 2019, 2:33:17 AM
    Author     : kevinrojas
--%>

<%@page import="controller.Controller"%>
<%@page import="model.Servicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Servicio agregado</h1>
        <%
            String nombre = request.getParameter("nombre");
            Servicio servicio = new Servicio();
            servicio.setNombre(nombre);
            
            Controller.getInstance().setServicio(servicio);
        %>
        
        <%= nombre %>

        
    </body>
</html>
