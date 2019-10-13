<%@page import="controller.Controller"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Mascota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <%
        //se leen todas las mascotas asociados
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        
        mascotas = Controller.getInstance().getAllMascotas();
    
    %>
    
    <%
        
        String selected = request.getParameter("mascotaSelect");
        
        System.out.println("request: " + selected);


        String html = " "
                + "<table border=5 bordercolor=black background=black id='tabla'>"
                + "<tr id='row'>"
                + "<th>Id</th>"
                + "<th>Nombre</th>"
                + "<th>Tipo de Mascota</th>"
                + "<th>Fecha de Nacimiento</th>"
                + "<th>Id del expediente</th>"
                + "</tr>";
             
        Mascota mascota = new Mascota();
        for (int i = 0; i < mascotas.size(); i++) {
             mascota = mascotas.get(i);
            html+= ""
                + "<tr>"
                + "<td>"+ mascota.getId()+"</td>"
                + "<td>"+ mascota.getNombre()+"</td>"
                + "<td>"+ mascota.getTipoMascota()+"</td>"
                + "<td>"+ mascota.getFechaNacimiento()+"</td>"
                + "<td>"+ mascota.getExpediente().getId()+"</td>"
                + "</tr>";
            }
        html += "</table> ";
    %>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mascota</title>
    </head>
    <body>
        <h1>Tabla de todas las mascotas</h1>
        <%= html %>
    </body>
</html>
