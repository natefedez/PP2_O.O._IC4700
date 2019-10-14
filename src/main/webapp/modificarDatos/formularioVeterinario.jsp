<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<div  style="padding-left:16px">
    <h1>Esta es la seleccion de veterinario.</h1>
</div>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Veterinario</title>
    </head>
    <%
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String especialidad = request.getParameter("especialidad");

    %>
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de veterinario nuevo</h1>

            <form name="form" method="post" action="funcionesModificar/modificarVeterinario.jsp
                <p>Cedula</p>
                <input name="cedula" value="<%=cedula%>"><br>

                <p>Nombre</p>
                <input name="nombre" value="<%=nombre%>"><br>

                <p>Apellidos</p>
                <input name="apellidos" value="<%=apellidos%>"><br>

                <p>Direccion</p>
                <input name="direccion" value="<%=direccion%>"><br>

                <p>Telefono</p>
                <input name="telefono" value="<%=telefono%>"><br>

                <p>Especialidad</p>
                <input name="especialidad" value="<%=especialidad%>"><br>

                <br><br><input class="button1" type="submit" value="Gauardar Cambios" />
            </form>
        </div>
        
    </body>
</html>
