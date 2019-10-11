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
        <title>Modificar Servicio</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de servicio</h1>

            <form name="form" method="post" action="funcionesAgregar/agregarServicio.jsp">
                <p>Nombre</p>
                <input name="nombre" type="date"><br>

                
                <br><br><input class="button1" type="submit" value="Guardar Cambios" />
            </form>
        </div>
        
    </body>
</html>
