<%-- 
    Document   : deployVeterinarios
    Created on : Oct 9, 2019, 4:22:26 AM
    Author     : kevinrojas
--%>

<%@page import="model.Veterinario"%>
<%@page import="controller.Controller"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todos los clientes
        ArrayList<Veterinario> veterinarios = new ArrayList<Veterinario>();
        
        veterinarios = Controller.getInstance().getAllVeterinarios();
    
    %>
    
    
    <%

        String html = " "
                + "<table border=5 bordercolor=black background=black id='tabla'>"
                + "<tr id='row'>"
                + "<th>Cedula</th>"
                + "<th>Nombre</th>"
                + "<th>Apellidos</th>"
                + "<th>Direccion</th>"
                + "<th>Telefonos</th>"
                + "<th>Especialidad</th>"
                + "</tr>";
        
        
        Veterinario veterinario;
        for (int i = 0; i < veterinarios.size(); i++) {
            veterinario = veterinarios.get(i);
            
            html+= ""
                + "<tr>"
                + "<td>"+ veterinario.getCedula() +"</td>"
                + "<td>"+ veterinario.getNombre()+"</td>"
                + "<td>"+ veterinario.getApellidos()+"</td>"
                + "<td>"+ veterinario.getDireccion()+"</td>"
                + "<td>"+ veterinario.getTelefono()+"</td>"
                + "<td>"+ veterinario.getTipo()+"</td>"
                + "<tr>";
                
            }

            html+= ""
                + "</table>";
    %>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Veterinarios</title>
    </head>
    <body>
        <h1>Tabla de todos los veterinarios.</h1>
        <%= html %>
    </body>
</html>
