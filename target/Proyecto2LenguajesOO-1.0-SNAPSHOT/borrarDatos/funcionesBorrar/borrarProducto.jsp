<%@page import="controller.Controller"%>
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
            

            String html = "El objeto: '" + id + "' '" + nombre + "' '" + descripcion + "' '" + cantidad + "' ha sido eliminado.";
            Controller.getInstance().deleteProducto(Integer.parseInt(id));
            
        %>
        
        
        <h1>Eliminado</h1>
        <%= html %>
    </body>
</html>
