<%-- 
    Document   : agregarMascota
    Created on : Oct 9, 2019, 2:33:27 AM
    Author     : kevinrojas
--%>

<%@page import="controller.Controller"%>
<%@page import="model.Mascota"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Mascota</title>
    </head>
    </head>
    <body>
        <h1>Cliente agregado</h1>
        <%
            String duennoString = request.getParameter("duenoSelect");
            String tipoString = request.getParameter("tipo");
            String nombreString = request.getParameter("nombre");
            String fechaString = request.getParameter("fechaNacimiento");
            
            
            Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
            
            Mascota mascota = new Mascota();
            mascota.setNombre(nombreString);
            mascota.setTipoMascota(tipoString);
            mascota.setFechaNacimiento(fecha);
            
            Controller.getInstance().setMascota(mascota, null);
        %>
        
        <%= duennoString %>
        <%= nombreString %>
        <%= tipoString %>
        <%= fechaString %>
        
    </body>
</html>
