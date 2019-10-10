<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="../menuStyle.html" %>
<%@include file="menuBody.html" %>    

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>

        <%
            //Se descargan los objetos necesarios
            String cedulaClientes [] = {"clienteA","clienteB","clienteC","clienteD"};
       
        %>
        
        <a class="button">Cliente</a>
        <div class="cliente">
            <form name="form" method="post" action="agregarCliente.jsp">
                Cedula:<br>
                    <input type="text" name="cedula"><br>
                    
                Nombre:<br>
                    <input type="text" name="nombre"><br>
                    
                Apellidos:<br>
                    <input type="text" name="apellidos"><br>
                    
                Telefono<br>
                    <input type="text" name="telefono"><br>
                
                    
                    
                <input type="submit" value="Agregar Cliente" />
          </form>
        </div>
        
        <br><br><br>
        
        <a class="button">Mascota</a>
        <div class="mascota">
            <form name="form" method="post" action="agregarMascota.jsp">
                Duenno:<br>
                <select name="duenoSelect">
                    <%
                        for(int i = 0; i<cedulaClientes.length; ++i){
                         %>
                             <option value="<%= cedulaClientes[i] %>"><%= cedulaClientes[i] %></option>
                         <%
                        }
                    %>
                </select><br>
                    
                Tipo de mascota:<br>
                    <input type="text" name="tipo"><br>
                    
                Nombre:<br>
                    <input type="text" name="nombre"><br>
                    
                Fecha de Nacimiento:<br>
                    <input type="date" name="fechaNacimiento" placeholder="DD/MM/YYYY"><br>
                
                    
                <input type="submit" value="Agregar Mascota" />
          </form>
        </div>
        
                <br><br><br>
                
        <a class="button">Producto</a>
            <div class="producto">
            <form name="form" method="post" action="agregarProducto.jsp">
                Nombre:<br>
                    <input type="text" name="nombre"><br>
                    
                Descripcion:<br>
                    <input type="text" name="descripcion"><br>
                    
                Cantidad en inventario:<br>
                    <input type="text" name="cantidad"><br>
                    
                    
                <input type="submit" value="Agregar Producto" />
          </form>
        </div>
        
        <br><br><br>
        
        <a class="button">Servicio</a>
                <div class="cliente">
            <form name="form" method="post" action="agregarServicio.jsp">
                Nombre<br>
                    <input type="text" name="nombre"><br>
                    
                <input type="submit" value="Agregar Cliente" />
          </form>
        </div>
        
        <br><br><br>
        
        <a class="button">Veterinario</a>
                <div class="cliente">
            <form name="form" method="post" action="agregarVeterinario.jsp">
                Cedula:<br>
                    <input type="text" name="cedula"><br>
                    
                Nombre:<br>
                    <input type="text" name="nombre"><br>
                    
                Apellidos:<br>
                    <input type="text" name="apellidos"><br>
                    
                Telefono<br>
                    <input type="text" name="telefono"><br>
                
                Especialidad<br>
                    <input type="text" name="especialidad"><br>
                
                    
                <input type="submit" value="Agregar Cliente" />
          </form>
        </div>
    </body>
</html>
