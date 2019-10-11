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
        <title>Agregar Veterinario</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de veterinario nuevo</h1>

            
            <form name="form" method="post" action="funcionesAgregar/agregarVeterinario.jsp">
                <p>Cedula</p>
                <input name="cedula" type="date"><br>

                <p>Nombre</p>
                <input name="nombre" type="date"><br>

                <p>Apellidos</p>
                <input name="apellidos" type="date"><br>

                <p>Direccion</p>
                <input name="direccion" type="date"><br>

                <p>Telefono</p>
                <input name="telefono" type="date"><br>

                <p>Especialidad</p>
                <input name="especialidad" type="date"><br>

                
                <br><br><input class="button1" type="submit" value="Agregar Veterinario Nuevo" />
            </form>
        </div>
        
    </body>
</html>