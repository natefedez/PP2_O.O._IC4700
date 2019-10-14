<%-- 
    Document   : agregarProducto
    Created on : Oct 9, 2019, 2:33:06 AM
    Author     : kevinrojas
--%>

<%@page import="controller.Controller"%>
<%@page import="model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Producto</title>
    </head>
    <body>
        <h1>Producto modificado</h1>
        <%
            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("descripcion");
            String cantidad = request.getParameter("cantidad");
            
            Producto producto = new Producto();
                
            producto.setNombre(nombre);
            producto.setDescripcion(descripcion);
            producto.setCantidadExistencia(Integer.parseInt(cantidad));
            
            Controller.getInstance().upgradeProducto(producto);
        %>
        
        <%= nombre %>
        <%= descripcion %>
        <%= cantidad %>
        
    </body>
</html>
