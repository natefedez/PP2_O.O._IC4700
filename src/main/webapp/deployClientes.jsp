<%@page import="model.Mascota"%>
<%@page import="model.DuenoMascota"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todos los clientes
        ArrayList<DuenoMascota> duennos = new ArrayList<DuenoMascota>();
           
    
    %>
    
    
    <%

        String html = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Cedula</th>"
                + "<th>Nombre</th>"
                + "<th>Apellidos</th>"
                + "<th>Direccion</th>"
                + "<th>Mascotas</th>"
                + "</tr>";
        
        String mascotahtml = "";
        DuenoMascota duenno;
        Mascota mascota;
        for (int i = 0; i < duennos.size(); i++) {
            duenno = duennos.get(i);
            ArrayList<Mascota> mascotas = duenno.getMascotas();
            
            html+= ""
                + "<tr>"
                + "<td>"+ duenno.getCedula() +"</td>"
                + "<td>"+ duenno.getNombre()+"</td>"
                + "<td>"+ duenno.getApellidos()+"</td>"
                + "<td>"+ duenno.getDireccion()+"</td>";
                
                
            mascotahtml = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Id</th>"
                + "<th>Nombre</th>"
                + "<th>Tipo de Mascota</th>"
                + "<th>Fecha de Nacimiento</th>"
                + "</tr>";

            for (int j = 0; j < mascotas.size(); j++) {
                mascota = mascotas.get(j);
                mascotahtml += ""
                    + "<tr>"
                    + "<td>"+ mascota.getId() +"</td>"
                    + "<td>"+ mascota.getNombre()+"</td>"
                    + "<td>"+ mascota.getTipoMascota()+"</td>"
                    + "<td>"+ mascota.getFechaNacimiento()+"</td>"
                    + "</tr>";
                }

            mascotahtml+= "</table> ";
            
            html+= ""
                + "<td>"+ mascotahtml +"</td>"
                + "</tr>";
            }
            
            html+= ""
                + "</table>";
    %>
    
    <head>
        <title> Clientes </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        <h1>Tabla de todos los clientes con sus mascotas</h1>
        
        <%= html %>
    </body>
    
    
</html>
