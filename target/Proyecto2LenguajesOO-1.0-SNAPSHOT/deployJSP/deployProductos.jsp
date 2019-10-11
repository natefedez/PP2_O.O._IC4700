<%-- 
    Document   : deployProductos
    Created on : Oct 9, 2019, 4:21:44 AM
    Author     : kevinrojas
--%>

<%@page import="controller.Controller"%>
<%@page import="model.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todos los productos asociados
        
                
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos = Controller.getInstance().getAllProdutos();
    
    %>
    
    
    <%
        
        String selected = request.getParameter("productoSelect");
        
        System.out.println("request: " + selected);

        String html = " "
                + "<table border=5 bordercolor=black background=black>"
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
