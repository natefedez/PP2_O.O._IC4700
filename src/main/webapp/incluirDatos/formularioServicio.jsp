<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<%@include file="menuBody.html" %>
<div  style="padding-left:16px">
    <h1>Esta es la seleccion de servicios.</h1>
</div>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Servicio</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de servicio nuevo</h1>

            <form name="form" method="post" action="funcionesAgregar/agregarServicio.jsp">
                <p>Nombre</p>
                <input name="nombre" type="date""><br>

                
                <br><br><input class="button1" type="submit" value="Agregar Servicio Nuevo" />
            </form>
        </div>
        
    </body>
</html>
