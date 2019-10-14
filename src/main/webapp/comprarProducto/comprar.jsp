
<%@page import="controller.Controller"%>
<%@page import="view.CompraDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compra</title>
    </head>
    <body>
        <h1>Elementos comprados</h1>
    </body>
    
    
    <%
        Enumeration parametros = request.getParameterNames();
        ArrayList<Integer> unidades = new ArrayList<Integer>();
        ArrayList<Integer> servicios = new ArrayList<Integer>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();
        
        String cedula = parametros.nextElement().toString();
        System.out.println(cedula);
        
        while(parametros.hasMoreElements()){
            String unidad = parametros.nextElement().toString();
            String cantidad = parametros.nextElement().toString();
            
            if(unidad.contains("pro")){
                unidades.add(Integer.parseInt(unidad.substring(unidad.lastIndexOf("/")+1)));
            } else {
                servicios.add(Integer.parseInt(unidad.substring(unidad.lastIndexOf("/")+1)));
            }
            cantidades.add(Integer.parseInt(cantidad.substring(cantidad.lastIndexOf("/")+1)));
            
        }
        
        CompraDTO compra = new CompraDTO();
        compra.setCantidadProducto(cantidades);
        compra.setCedulaDuenno(Integer.parseInt(cedula));
        compra.setProductosId(unidades);
        compra.setServiciosId(servicios);
        
        Controller.getInstance().comprar(compra);
        
    %>
</html>
