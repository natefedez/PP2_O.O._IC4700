<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.Servicio"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todos los productos asociados
                
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        
        //Se capturan el limite de fechas
        String startDateString = request.getParameter("startSelect");
        String endDateString = request.getParameter("endSelect");
        System.out.println(startDateString);
        System.out.println(endDateString);
        if(startDateString == "" && endDateString == ""){
            //Sin filtrado por fecha

            
        } else if (endDateString == ""){
            //Filtrado del final en adelante
            Date end = new SimpleDateFormat("dd/MM/yyyy").parse(startDateString);

            
        } else if (startDateString == ""){
            //Sin filtrado del comienzo en adelante
            Date end = new SimpleDateFormat("dd/MM/yyyy").parse(endDateString);

                
        } else {
            //Filtrado entre fechas
            Date start = new SimpleDateFormat("dd/MM/yyyy").parse(startDateString);
            Date end = new SimpleDateFormat("dd/MM/yyyy").parse(endDateString);
   
        }
        

        
    
    %>
    
    
    <%
        
        String selected = request.getParameter("servicioSelect");
        
        System.out.println("request: " + selected);

        String html = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Id</th>"
                + "<th>Nombre</th>"
                + "</tr>";
        
        for (int i = 0; i < servicios.size(); i++) {
            Servicio servicio = servicios.get(i);
            html+= ""
                + "<tr>"
                + "<td>"+ servicio.getId() +"</td>"
                + "<td>"+ servicio.getNombre() +"</td>"
                + "</tr>";
            }
        html+= "</table>";

    %>
    
    
    <head>
        <title><%= selected %> </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        <h1>Tabla de todos los servicios comprados para <%= selected %></h1>
        
        <%= html %>
    </body>
    
    
</html>
