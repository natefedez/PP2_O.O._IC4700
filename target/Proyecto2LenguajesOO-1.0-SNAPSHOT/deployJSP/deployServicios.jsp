<%-- 
    Document   : deployServicios
    Created on : Oct 9, 2019, 4:22:06 AM
    Author     : kevinrojas
--%>

<%@page import="controller.Controller"%>
<%@page import="model.Servicio"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todos los productos asociados
                
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        
        servicios = Controller.getInstance().getAllServicios();
        
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
