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
        <h1>Mascota modificado</h1>
        <%
            String tipoString = request.getParameter("tipo");
            String nombreString = request.getParameter("nombre");
            String fechaString = request.getParameter("fecha");
            String idString = request.getParameter("id");
            
            
            Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
            
            Mascota mascota = new Mascota();
            mascota.setId(Integer.parseInt(idString));
            mascota.setNombre(nombreString);
            mascota.setTipoMascota(tipoString);
            mascota.setFechaNacimiento(fecha);
            
            Controller.getInstance().upgradeMascota(mascota);
        %>
        
        <%= nombreString %>
        <%= tipoString %>
        <%= fechaString %>
        
    </body>
</html>
