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
            String cedula = request.getParameter("cedula");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String especialidad = request.getParameter("especialidad");
            

            String html = "El objeto: '" + cedula + "' '" + nombre + "' '" + apellidos + "' '" + direccion + "' '" + telefono + "' '" + especialidad + "' ha sido eliminado.";
            Controller.getInstance().deleteVeterinario(Integer.parseInt(cedula));
            
        %>
        
        
        <h1>Eliminado</h1>
        <%= html %>
    </body>
</html>
