<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<div  style="padding-left:16px">
    <h2>Modificar data</h2>
    <p>Esta seccion puede modificar o eliminar un elemento de la tabla.</p>
</div>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Cliente</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de cliente</h1>

            <%
                
                String cedula = request.getParameter("cedula");
                String nombre = request.getParameter("nombre");
                String apellidos = request.getParameter("apellidos");
                String direccion = request.getParameter("direccion");
                String telefono = request.getParameter("telefono");
            

            %>
            
            
            <form name="form" method="post" action="funcionesModificar/modificarCliente.jsp">
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

                
                <br><br><input class="button1" type="submit" value="Guardar Cambios" />
            </form>
        </div>
        
    </body>
</html>
