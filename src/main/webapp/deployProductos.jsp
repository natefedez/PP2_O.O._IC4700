<%@page import="java.util.ArrayList"%>
<%@page import="model.Producto"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todos los productos asociados
        ArrayList<Producto> productos = new ArrayList<Producto>();
        
           
    
    %>
    
    
    <%
        
        String selected = request.getParameter("productoSelect");
        
        System.out.println("request: " + selected);

        String html = " "
                + "<table style='width:100%'>"
                + "<tr>"
                + "<th>Id</th>"
                + "<th>Nombre</th>"
                + "<th>Descripcion</th>"
                + "<th>Cantidad Existente</th>"
                + "</tr>";
        
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            html+= ""
                + "<tr>"
                + "<td>"+ producto.getId() +"</td>"
                + "<td>"+ producto.getNombre() +"</td>"
                + "<td>"+ producto.getDescripcion() +"</td>"
                + "<td>"+ producto.getCantidadExistencia() +"</td>"
                + "</tr>"
                + "</table> ";
        
            }

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
