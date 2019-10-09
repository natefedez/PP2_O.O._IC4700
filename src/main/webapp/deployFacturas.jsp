<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <%
        
        String selected = request.getParameter("facturasSelect");
        
        System.out.println("request: " + selected);

        String html = " "
                + "<table style='width:100%'>"
                + "<tr>"
                + "<th>Firstname</th>"
                + "<th>Lastname</th>"
                + "<th>Age</th>"
                + "</tr>"
                + "<tr>"
                + "<td>nombre1</td>"
                + "<td>apellido1</td>"
                + "<td>140</td>"
                + "</tr>"
                + "</table> ";
        
    %>
    
    <head>
        <title><%= selected %> </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        <h1>Tabla de todos los productos comprados por <%= selected %></h1>
        
        <%= html %>
    </body>
    
    
</html>
