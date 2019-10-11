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
        <title>Agregar Mascota</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de mascota nueva</h1>

            <form name="form" method="post" action="funcionesAgregar/agregarMascota.jsp">
                <p>Tipo de Mascota</p>
                <input name="tipo"><br>

                <p>Nombre</p>
                <input name="nombre"><br>

                <p>Fecha de Nacimiento</p>
                <input name="fecha" type="date"><br>
                
                <br><br><input class="button1" type="submit" value="Agregar Mascota Nueva" />
            </form>
        </div>
        
    </body>
</html>
