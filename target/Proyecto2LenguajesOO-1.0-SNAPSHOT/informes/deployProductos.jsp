<%@page import="model.ProductoVendido"%>
<%@page import="controller.Controller"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Producto"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        //se leen todos los productos asociados
        
                
        ArrayList<ProductoVendido> productos = new ArrayList<ProductoVendido>();
        
        String mascota = request.getParameter("productoSelect");
        //Se capturan el limite de fechas
        String startDateString = request.getParameter("startSelect");
        String endDateString = request.getParameter("endSelect");
        System.out.println(startDateString);
        System.out.println(endDateString);
        
        Date start = null;
        Date end = null;
            
        if(startDateString == "" && endDateString == ""){
            //Sin filtrado por fecha

            
        } else if (endDateString == ""){
            //Filtrado del final en adelante
            end = new SimpleDateFormat("dd/MM/yyyy").parse(startDateString);

            
        } else if (startDateString == ""){
            //Sin filtrado del comienzo en adelante
            end = new SimpleDateFormat("dd/MM/yyyy").parse(endDateString);

                
        } else {
            //Filtrado entre fechas
            start = new SimpleDateFormat("dd/MM/yyyy").parse(startDateString);
            end = new SimpleDateFormat("dd/MM/yyyy").parse(endDateString);
   
        }
        
        if(mascota == "Todos"){
            productos = Controller.getInstance().listarProductos(start, end);
            
        } else {
            productos = Controller.getInstance().listarProductos(Integer.parseInt(mascota), start, end);
        }
        
        
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
                + "<th>Cantidad</th>"
                + "<th>Fecha Compra</th>"
                + "</tr>";
        
        for (int i = 0; i < productos.size(); i++) {
            ProductoVendido productoVendido = productos.get(i);
            Producto producto = productoVendido.getProducto();
            html+= ""
                + "<tr>"
                + "<td>"+ producto.getId() +"</td>"
                + "<td>"+ producto.getNombre() +"</td>"
                + "<td>"+ producto.getDescripcion() +"</td>"
                + "<td>"+ productoVendido.getCantidad() +"</td>"
                + "<td>"+ productoVendido.getFechaCompra()+"</td>"
                + "</tr>";
            }
        html+= "</table>";

    %>
    
    <head>
        <title> Productos </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        <%
            if (!selected.contains("Todos")){
        %>
            <h1>Tabla de todos los productos de <%= selected %></h1>
        <% 
            } else {
        %>
            <h1>Tabla de todos los productos existentes en el inventario</h1>
        <%
            }
        %>
        
        <%= html %>
    </body>
    
    
</html>
