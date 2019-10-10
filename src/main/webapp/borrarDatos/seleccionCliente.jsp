<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<%@include file="menuBody.html" %>
<h1>Esta es la seleccion de clientes.</h1>
<%@include file="../deployJSP/deployClientes.jsp" %>

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
            newCell.innerHTML = "[Boton]";
            
            var rows = tabla.rows;
            var lengthRows = rows.length;
            
            for (var i = 0, max = lengthRows; i < max; i++) {
                
                
                var cells = rows[i].cells;
                cells[cells.length-1].innerHTML = "<button class='button2' type='button' background=''>Borrar</button>";
                
                //document.write(row[i].innerHTML);
                
            }
            

            
            

            
            
        </script>
    </body>
</html>
