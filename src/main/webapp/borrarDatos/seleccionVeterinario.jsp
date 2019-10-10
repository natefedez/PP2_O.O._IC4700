<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<%@include file="menuBody.html" %>
<h1>Esta es la seleccion de veterinarios.</h1>
<%@include file="../deployJSP/deployVeterinarios.jsp" %>

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
                
                var cedula = cells[0].innerHTML;
                var nombre = cells[1].innerHTML;
                var apellidos = cells[2].innerHTML;
                var direccion = cells[3].innerHTML;
                var telefono = cells[4].innerHTML;
                var especialidad = cells[5].innerHTML;
                
                cell.innerHTML = ""
                        + "<form name='form' method='post' action='funcionesBorrar/borrarVeterinario.jsp'>"
                        + "<input hidden name='cedula' value='" + cedula + "'>"
                        + "<input hidden name='nombre' value='" + nombre + "'>"
                        + "<input hidden name='apellidos' value='" + apellidos + "'>"
                        + "<input hidden name='direccion' value='" + direccion + "'>"
                        + "<input hidden name='telefono' value='" + telefono + "'>"
                        + "<input hidden name='especialidad' value='" + especialidad + "'>"
                        + "<input class='button2' type='submit' value='Borrar'>"
                        + "</form>";

                
            }
            

            
            

            
            
        </script>
    </body>
</html>
