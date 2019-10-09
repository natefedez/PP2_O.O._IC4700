<%-- 
    Document   : descargarElementosJSP
    Created on : Oct 8, 2019, 8:01:29 PM
    Author     : kevinrojas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="informes.html" %>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        
        <%
            //Se descargan los objetos necesarios
            
            String nombresMascotas [] = {"mascotaA","mascotaB","mascotaC","mascotaD"};
            String cedulaClientes [] = {"clienteA","clienteB","clienteC","clienteD"};
            String cedulaVeterinarios [] = {"VeterinarioA","VeterinarioB","VeterinarioC","VeterinarioD"};
            
        
        %>
        
        
        <div id="productosTable" class="productos" >
            <h1>Productos</h1>
            
            <form name="form" method="post" action="deployProductos.jsp">
                
                <select name="productoSelect">
                    <option value="Todos" selected>Todos</option>
                    <%

                        for(int i = 0; i<nombresMascotas.length; ++i){
                         %>
                             <option value="<%= nombresMascotas[i] %>"><%= nombresMascotas[i] %></option>
                         <%
                        }
                    %>

                </select>
                   
                <input name="startSelect" type="date" text="DD/MM/YY">
                <input name="endSelect" type="date">


               <input type="submit" value="Buscar" />
            </form>
            
           <div id="tablaProducto" class="table"> </div>

        </div>
        

             
        <div id="serviciosTable" class="servicios" >
            <h1>Servicios</h1>
            
            <form name="form" method="post" action="deployServicios.jsp">
                
               <select name="servicioSelect">
                   <%
                       
                       for(int i = 0; i<nombresMascotas.length; ++i){
                        %>
                            <option value="<%= nombresMascotas[i] %>"><%= nombresMascotas[i] %></option>
                        <%
                       }
                   %>
                   
               </select>
                <input name="startSelect" type="date" text="DD/MM/YY">
                <input name="endSelect" type="date">

               <input type="submit" value="Buscar" />
            </form>
            
           <div id="tablaServicio" class="table"> </div>

        </div>
        
              
        
        <div id="mascotasTable" class="mascotas" >
            <h1>Mascotas</h1>
            
            <form name="form" method="post" action="deployMascotas.jsp">
                
               <select name="mascotaSelect">
                   <%
                       
                       for(int i = 0; i<cedulaVeterinarios.length; ++i){
                        %>
                            <option value="<%= cedulaVeterinarios[i] %>"><%= cedulaVeterinarios[i] %></option>
                        <%
                       }
                   %>
                   
               </select>

               <input type="submit" value="Buscar" />
            </form>
            
           <div id="tablaMascota" class="table"> </div>

        </div>
        
        
        <div id="clientesTable" class="clientes" >
            <h1>Clientes</h1>
            
            <form name="form" method="post" action="deployClientes.jsp">
               <input type="submit" value="Buscar Todos los Clientes" />
            </form>
            
           <div id="tablaCliente" class="table"> </div>

        </div>
        
        
        <div id="facturasTable" class="facturas" >
            <h1>Facturas</h1>
            
            <form name="form" method="post" action="deployFacturas.jsp">
                
               <select name="facturaSelect">
                   <%
                       
                       for(int i = 0; i<cedulaClientes.length; ++i){
                        %>
                            <option value="<%= cedulaClientes[i] %>"><%= cedulaClientes[i] %></option>
                        <%
                       }
                   %>
                   
               </select>

               <input type="submit" value="Buscar" />
            </form>
            
           <div id="tablaFactura" class="table"> </div>

        </div>
        

        

    </body>

</html>
