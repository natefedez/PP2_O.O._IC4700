<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<%@include file="menuBody.html" %>
<h1>Esta es la seleccion de servicios.</h1>
<%@include file="../deployJSP/deployServicios.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <script>
            var tabla = document.getElementById("tabla");
            
            var tablaRow = document.getElementById("row");
            var newCell = tablaRow.insertCell(-1);

            
            var rows = tabla.rows;
            var lengthRows = rows.length;
            
            for (var i = 1, max = lengthRows; i < max; i++) {
                
                var cells = rows[i].cells;
                var cell = rows[i].insertCell(-1);
                
                var id = cells[0].innerHTML;
                var nombre = cells[1].innerHTML;
                
                cell.innerHTML = ""
                        + "<form name='form' method='post' action='funcionesBorrar/borrarServicio.jsp'>"
                        + "<input hidden name='id' value='" + id + "'>"
                        + "<input hidden name='nombre' value='" + nombre + "'>"
                        + "<input class='button2' type='submit' value='Borrar'>"
                        + "</form>";

            }
            

            
            

            
            
        </script>
    </body>
</html>
