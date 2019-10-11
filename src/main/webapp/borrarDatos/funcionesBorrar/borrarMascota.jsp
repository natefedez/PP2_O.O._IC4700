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
            String tipo = request.getParameter("tipo");
            String fecha = request.getParameter("fecha");
            String expediente = request.getParameter("idExpediente");
            

            String html = "El objeto: '" + id + "' '" + nombre + "' '" + tipo + "' '" + fecha + "' '" + expediente + "' ha sido eliminado.";
            
        %>
        
        
        <h1>Eliminado</h1>
        <%= html %>
    </body>
</html>
