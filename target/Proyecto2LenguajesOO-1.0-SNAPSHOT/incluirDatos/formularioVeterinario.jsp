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
                <p>Cedula (9 digitos)</p>
                <input name="cedula" placeholder="xxxxxxxxx"><br>

                <p>Nombre</p>
                <input name="nombre"><br>

                <p>Apellidos</p>
                <input name="apellidos"><br>

                <p>Direccion</p>
                <input name="direccion"><br>

                <p>Telefono (8 digitos)</p>
                <input name="telefono" placeholder="xxxxxxxx"><br>

                <p>Especialidad</p>
                <input name="especialidad"><br>
                
                <p>Horario atencion</p>
                <input name="horario" placeholder="d-d hh:mm - hh:mm"><br>
                

                <br><br><input class="button1" type="submit" value="Agregar Veterinario Nuevo" />
            </form>
        </div>
        
    </body>
</html>
