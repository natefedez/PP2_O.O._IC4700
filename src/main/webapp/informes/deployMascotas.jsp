<%@page import="java.util.ArrayList"%>
<%@page import="model.Mascota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todas las mascotas asociados
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
           
    
    %>
    
    <%
        
        String selected = request.getParameter("mascotaSelect");
        
        System.out.println("request: " + selected);


        String html = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Id</th>"
                + "<th>Nombre</th>"
                + "<th>Tipo de Mascota</th>"
                + "<th>Fecha de Nacimiento</th>"
                + "</tr>";
                
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota mascota = mascotas.get(i);
            html+= ""
                + "<tr>"
                + "<td>"+ mascota.getId() +"</td>"
                + "<td>"+ mascota.getNombre()+"</td>"
                + "<td>"+ mascota.getTipoMascota()+"</td>"
                + "<td>"+ mascota.getFechaNacimiento()+"</td>"
                + "</tr>";
            }
        html += "</table> ";
    %>
    
    <head>
        <title> Mascotas </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        <h1>Tabla de todas las mascotas atendidas por <%= selected %></h1>
    </body>
    
    
</html>
