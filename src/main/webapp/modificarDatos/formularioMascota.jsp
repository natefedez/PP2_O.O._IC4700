<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<div  style="padding-left:16px">
    <h1>Esta es la seleccion de mascota.</h1>
</div>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Mascota</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de mascota</h1>
            
            <%
                String nombre = request.getParameter("nombre");
                String tipo = request.getParameter("tipo");
                String fecha = request.getParameter("fecha");
                String id = request.getParameter("id");
                
                
            %>
            
            <form name="form" method="post" action="funcionesModificar/modificarMascota.jsp">
                <p>Tipo de Mascota</p>
                <input name="tipo" value="<%=tipo%>"><br>

                <p>Nombre</p>
                <input name="nombre" value="<%=nombre%>"><br>

                <p>Fecha de Nacimiento</p>
                <input name="fecha" type="date" value="<%=fecha%>"><br>
                
                <input hidden name="id" value="<%=id%>"><br>
                
                <br><br><input class="button1" type="submit" value="Guardar Cambios" />
            </form>
        </div>
        
    </body>
</html>
