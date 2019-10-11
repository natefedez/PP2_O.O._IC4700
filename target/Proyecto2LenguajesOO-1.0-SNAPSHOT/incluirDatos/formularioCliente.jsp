<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>

<div style="padding-left:16px">
  <h2>Incluir data</h2>
  <p>Esta seccion puede agregar un nuevo elemento a cada instancia deseada.</p>
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
                <input name="cedula"><br>

                <p>Nombre</p>
                <input name="nombre"><br>

                <p>Apellidos</p>
                <input name="apellidos"><br>

                <p>Direccion</p>
                <input name="direccion"><br>

                <p>Telefono</p>
                <input name="telefono"><br>

                
                <br><br><input class="button1" type="submit" value="Agregar Cliente Nuevo" />
            </form>
        </div>
        
    </body>
</html>
