
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
    
    
    <%
        Enumeration parametros = request.getParameterNames();
        ArrayList<String> unidades = new ArrayList<String>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();
        
        String cedula = parametros.nextElement().toString();
        System.out.println(cedula);
        
        while(parametros.hasMoreElements()){
            String unidad = parametros.nextElement().toString();
            String cantidad = parametros.nextElement().toString();
            
            unidades.add(unidad.substring(unidad.lastIndexOf("/")+1));
            cantidades.add(Integer.parseInt(cantidad.substring(cantidad.lastIndexOf("/")+1)));
            
        }
    %>
</html>
