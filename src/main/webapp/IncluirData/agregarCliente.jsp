
<%@page import="controller.Controller"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.DuenoMascota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Cliente</title>
    </head>
    <body>
        <h1>Cliente agregado</h1>
        <%
            String cedula = request.getParameter("cedula");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String telefono = request.getParameter("telefono");
            
            DuenoMascota nuevoDuenno = new DuenoMascota();
            nuevoDuenno.setNombre(nombre);
            nuevoDuenno.setApellidos(apellidos);
            nuevoDuenno.setCedula(Integer.parseInt(cedula));
            
            ArrayList<Integer> telefonos = new ArrayList<>();
            telefonos.add(Integer.parseInt(telefono));
            nuevoDuenno.setTelefonos(telefonos);
            
            Controller.getInstance().setCliente(nuevoDuenno);
        %>
        
        <%= cedula %>
        <%= nombre %>
        <%= apellidos %>
        <%= telefono %>
        
    </body>
</html>
