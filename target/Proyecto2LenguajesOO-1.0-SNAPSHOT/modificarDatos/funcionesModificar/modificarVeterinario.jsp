<%-- 
    Document   : agregarVeterinario
    Created on : Oct 9, 2019, 2:34:21 AM
    Author     : kevinrojas
--%>

<%@page import="controller.Controller"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Veterinario"%>
<%@page import="model.EspecialidadConcreta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Veterinario</title>
    </head>
    <body>
        <h1>Veterinario modificado</h1>
        <%
            String cedula = request.getParameter("cedula");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");
            String especialidad = request.getParameter("especialidad");
            String horarioAtencion = request.getParameter("horario");
            
            
            EspecialidadConcreta veterinario = new EspecialidadConcreta();
            veterinario.setNombre(nombre);
            veterinario.setApellidos(apellidos);
            veterinario.setCedula(Integer.parseInt(cedula));
            veterinario.setDireccion(direccion);
            veterinario.setTelefono(Integer.parseInt(telefono));
            
            veterinario.setEspecialidad(especialidad);
            veterinario.setHorarioAtencion(horarioAtencion);
            
            
            Controller.getInstance().upgradeVeterinario(veterinario);
        %>
        
        <%= cedula %>
        <%= nombre %>
        <%= apellidos %>
        <%= telefono %>
        
    </body>
</html>
