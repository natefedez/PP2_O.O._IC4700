<%@page import="controller.Controller"%>
<%@page import="model.Mascota"%>
<%@page import="model.DuenoMascota"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="../menuStyle.html" %>
<%@include file="menuBody.html" %>    

<html>
    <%
        //se leen todos los clientes
        ArrayList<DuenoMascota> duennos = new ArrayList<DuenoMascota>();
        
        Controller controller = Controller.getInstance();
        duennos = controller.getAllClientes();
        
    
    %>
    
    
    <%

        String html = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Cedula</th>"
                + "<th>Nombre</th>"
                + "<th>Apellidos</th>"
                + "<th>Direccion</th>"
                + "<th>Telefonos</th>"
                + "</tr>";
        
        
        DuenoMascota duenno;
        for (int i = 0; i < duennos.size(); i++) {
            duenno = duennos.get(i);
            ArrayList<Mascota> mascotas = duenno.getMascotas();
            
            html+= ""
                + "<tr>"
                + "<td>"+ duenno.getCedula() +"</td>"
                + "<td>"+ duenno.getNombre()+"</td>"
                + "<td>"+ duenno.getApellidos()+"</td>"
                + "<td>"+ duenno.getDireccion()+"</td>"
                + "<td>"+ duenno.getTelefono()+"</td>"
                + "<tr>";
                
            }

            html+= ""
                + "</table>";
    %>
    
    <head>
        <title> Clientes </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        <h1>Tabla de todos los clientes</h1>
        
        <%= html %>
    </body>
    
    
</html>
