<%@page import="controller.Controller"%>
<%@page import="model.Servicio"%>
<%@page import="model.ProductoVendido"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Factura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <%
        //se leen todos los productos asociados
        
        ArrayList<Factura> facturas = new ArrayList<Factura>();
        
        String cedula = request.getParameter("facturaSelect");
        facturas = Controller.getInstance().listarFacturas(Integer.parseInt(cedula));
    %>
    
    
    <%
        
        System.out.println("request: " + cedula);

        String html = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Fecha de Factura</th>"
                + "<th>Productos</th>"
                + "<th>Servicios</th>"
                + "</tr>";
                
        String productohtml = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Cantidad</th>"
                + "<th>Fecha de Compra</th>"
                + "<th>Id del producto</th>"
                + "<th>Nombre del producto</th>"
                + "</tr>";
        
        String serviciohtml = " "
                + "<table border=5 bordercolor=black background=black>"
                + "<tr>"
                + "<th>Id</th>"
                + "<th>Nombre</th>"
                + "</tr>";
        
        Factura factura;
        
        ArrayList<ProductoVendido> productos = new ArrayList<ProductoVendido>();
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        
        ProductoVendido productoVendido;
        Servicio servicio;
        
        for (int i = 0; i < facturas.size(); i++) {
            factura = facturas.get(i);
            
            
            html+= ""
                + "<tr>"
                + "<td>"+ factura.getFecha() +"</td>";
            
            servicios = factura.getSevicios();
            for (int j = 0; j < servicios.size(); j++) {
                    servicio = servicios.get(j);
                    
                    serviciohtml += ""
                    + "<tr>"
                    + "<td>"+ servicio.getId() +"</td>"
                    + "<td>"+ servicio.getNombre()+"</td>"
                    + "</tr>";
                    
                }
                
            productos = factura.getProductos();
            for (int j = 0; j < productos.size(); j++) {
                    productoVendido = productos.get(j);
                    
                    productohtml += ""
                + "<tr>"
                + "<td>"+ productoVendido.getCantidad()+"</td>"
                + "<td>"+ productoVendido.getFechaCompra()+"</td>"
                + "<td>"+ productoVendido.getProducto().getId()+"</td>"
                + "<td>"+ productoVendido.getProducto().getNombre()+"</td>"
                + "</tr>";
                }
                
            serviciohtml+= "</table>";
            productohtml+= "</table>";
            
            html+= ""
                + "</tr>";
        
            }
            
            html+= ""
                + "</table> ";
    %>
    <head>
        <title><%= selected %> </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">\
        <h1>Tabla de todas las facturas de <%= selected %></h1>
    </body>
    
    
    
</html>
