<%@page import="model.Veterinario"%>
<%@page import="model.Mascota"%>
<%@page import="model.DuenoMascota"%>
<%@page import="controller.Controller"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>
<div style="padding-left:16px">
  <h2>Pagina de informes</h2>
  <p>En esta pagina se listaran los informes.</p>
</div>
<html>
    
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body id="body" background="background.png">
        
        <%
            //Se descargan los objetos necesarios
            ArrayList<Mascota> mascotas = new ArrayList<>();
            ArrayList<DuenoMascota> clientes = new ArrayList<>();
            ArrayList<Veterinario> veterinarios = new ArrayList<>();
            
            mascotas = Controller.getInstance().getAllMascotas();
            clientes = Controller.getInstance().getAllClientes();
            veterinarios = Controller.getInstance().getAllVeterinarios();
            
        
        %>
        
        
        <div id="productosTable" class="productos" >
            <h1>Productos</h1>
            
            <form name="form" method="post" action="deployProductos.jsp">
                
                <select name="productoSelect">
                    <option value="Todos" selected>Todos</option>
                    <%

                        for(int i = 0; i<mascotas.size(); ++i){
                         %>
                         <option value="<%= mascotas.get(i).getId() %>"><%= mascotas.get(i).getNombre() %></option>
                         <%
                        }
                    %>

                </select>
                   
                <input name="startSelect" type="date" placeholder="DD/MM/YY">
                <input name="endSelect" type="date" placeholder="DD/MM/YY">


               <input type="submit" value="Buscar" />
            </form>
            
           <div id="tablaProducto" class="table"> </div>

        </div>
        

             
        <div id="serviciosTable" class="servicios" >
            <h1>Servicios</h1>
            
            <form name="form" method="post" action="deployServicios.jsp">
                
               <select name="servicioSelect">
                   <%
                       
                       for(int i = 0; i<mascotas.size(); ++i){
                        %>
                        <option value="<%= mascotas.get(i).getId() %>"><%= mascotas.get(i).getNombre() %></option>
                        <%
                       }
                   %>
                   
               </select>
                <input name="startSelect" type="date" placeholder="DD/MM/YY">
                <input name="endSelect" type="date" placeholder="DD/MM/YY">

               <input type="submit" value="Buscar" />
            </form>
            
           <div id="tablaServicio" class="table"> </div>

        </div>
        
              
        
        <div id="mascotasTable" class="mascotas" >
            <h1>Mascotas</h1>
            
            <form name="form" method="post" action="deployMascotas.jsp">
                
               <select name="mascotaSelect">
                   <%
                       
                       for(int i = 0; i<veterinarios.size(); ++i){
                        %>
                        <option value="<%= veterinarios.get(i).getCedula() %>"><%= veterinarios.get(i).getNombre() %></option>
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
                       
                       for(int i = 0; i<clientes.size(); ++i){
                        %>
                        <option value="<%= clientes.get(i).getCedula() %>"><%= clientes.get(i).getNombre() %></option>
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
