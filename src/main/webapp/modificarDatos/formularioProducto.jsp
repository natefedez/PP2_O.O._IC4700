<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<div  style="padding-left:16px">
    <h1>Esta es la seleccion de productos.</h1>
</div>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Producto</title>
    </head>
    
    <body>
        <div class="center" style="padding-left:16px">
            <h1>Formulario de Producto</h1>

            <%
                String nombre = request.getParameter("nombre");
                String descripcion = request.getParameter("descripcion");
                String cantidad = request.getParameter("cantidad");
            %>
        
            <form name="form" method="post" action="funcionesAgregar/agregarProducto.jsp">
                <p>Nombre</p>
                <input name="nombre" type="date" value="<%=nombre%>"><br>

                <p>Descripcion</p>
                <input name="descripcion" type="date" value="<%=descripcion%>"><br>

                <p>Cantidad en inventario</p>
                <input name="cantidad" type="date" value="<%=cantidad%>"><br>

                
                <br><br><input class="button1" type="submit" value="Guardar Cambios" />
            </form>
        </div>
        
    </body>
</html>
