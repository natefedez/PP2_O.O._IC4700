<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<%@include file="menuBody.html" %>
<div  style="padding-left:16px">
    <h1>Esta es la seleccion de clientes.</h1>
</div>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Cliente</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de cliente nuevo</h1>

            <form name="form" method="post" action="funcionesAgregar/agregarCliente.jsp">
                <p>Cedula</p>
                <input name="cedula" type="date""><br>

                <p>Nombre</p>
                <input name="nombre" type="date""><br>

                <p>Apellidos</p>
                <input name="apellidos" type="date""><br>

                <p>Direccion</p>
                <input name="direccion" type="date""><br>

                <p>Telefono</p>
                <input name="telefono" type="date""><br>

                
                <br><br><input class="button1" type="submit" value="Agregar Cliente Nuevo" />
            </form>
        </div>
        
    </body>
</html>
