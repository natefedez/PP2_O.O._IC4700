<%@page import="model.DuenoMascota"%>
<%@page import="controller.Controller"%>
<%@page import="model.Servicio"%>
<%@page import="model.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../menuStyle.html" %>

<div style="padding-left:16px">
  <h2>Carrito de compras</h2>
  <p>En esta seccion se pueden escoger productos y servicios para comprar.</p>
</div>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compra</title>
    </head>
    <body>
        
        <%
            //Se descargan los objetos necesarios
            ArrayList<DuenoMascota> clientes = new ArrayList<>();
            ArrayList<Producto> productosDisponibles = new ArrayList<>();
            ArrayList<Servicio> servicios = new ArrayList<>();
            
            productosDisponibles = Controller.getInstance().getAllProdutos();
            servicios = Controller.getInstance().getAllServicios();
            clientes = Controller.getInstance().getAllClientes();
            
            
        
        %>
        
        <h3>Cliente que realiza la compra</h3>
        <select id="clienteSelect">
            <%

                for(int i = 0; i<clientes.size(); ++i){
                 %>
                 <option value="<%= clientes.get(i).getCedula()%>"><%= clientes.get(i).getNombre() %> </option>
                 <%
                }
            %>
        </select>
        
        <h3>Productos</h3>
        
        <select id="productoSelect">
            <%

                for(int i = 0; i<productosDisponibles.size(); ++i){
                 %>
                 <option value="<%= productosDisponibles.get(i).getId()%>"><%= productosDisponibles.get(i).getNombre() %> </option>
                 <%
                }
            %>
        </select>
        <input id="quantity" type="number">

        <button type="button" class="button1" onclick="insertarProducto()">Agregar producto a carrito</button>
            
        
        
        <h3>Servicios</h3>
        <select id="servicioSelect">
            <%

                for(int i = 0; i<servicios.size(); ++i){
                 %>
                 <option value="<%= servicios.get(i).getId()%>"><%= servicios.get(i).getNombre() %></option>
                 <%
                }
            %>

        </select>
        <button type="button" class="button1" onclick="insertarServicio()">Agregar servicio a carrito</button>
        

        <h3>Factura</h3>
        <table border=5 bordercolor=black background=black id='tabla'>
            <tr id="rows">
                <th>Tipo</th>
                <th>ID</th>
                <th>Nombre</th>
                <th>Cantidad</th>
            </tr>
        </table>
        
        <button type="button" class="button1" onclick="comprar()">Calcular compras</button>
        <div id="formBuy"></div>

    </body>
    
    
    <script>
        
        function insertarProducto(){
            var tabla = document.getElementById("tabla");

            var id = document.getElementById("productoSelect").value;
            var producto = document.getElementById("productoSelect").options[document.getElementById("productoSelect").selectedIndex].text;
            var cantidad = document.getElementById("quantity").value;
           
            
            
            var indexOfProduct = 0;
            var productoInList = false;
            var rows = tabla.rows;
            for (var i = 0, max = tabla.rows.length; i < max; i++) {
                var cells = rows[i].cells;
                if(cells[1].innerHTML == id){
                    indexOfProduct = i;
                    productoInList = true;
                }
            }
            
            if(productoInList){
                var cellCantidad = tabla.rows[indexOfProduct].cells[3];
                var nuevaCantidad = Number(cellCantidad.innerHTML) + Number(cantidad);
                
                cellCantidad.innerHTML = nuevaCantidad;
                
            } else {
                var row = tabla.insertRow(-1);
                var tipoCell = row.insertCell(0);
                var idCell = row.insertCell(1);
                var nombreCell = row.insertCell(2);
                var cantidadCell = row.insertCell(3);
                
                tipoCell.innerHTML = "Producto";
                idCell.innerHTML = id;
                nombreCell.innerHTML = producto;
                cantidadCell.innerHTML = cantidad;
            }


        }
        
        function insertarServicio(){
            var tabla = document.getElementById("tabla");
            var id = document.getElementById("servicioSelect").value;
            var servicio = document.getElementById("servicioSelect").options[document.getElementById("servicioSelect").selectedIndex].text;


            var productoInList = false;
            var rows = tabla.rows;
            for (var i = 0, max = tabla.rows.length; i < max; i++) {
                var cells = rows[i].cells;
                if(cells[1].innerHTML == id){
                    
                    productoInList = true;
                }
            }
            
            if(!productoInList){

                var row = tabla.insertRow(-1);
                var tipoCell = row.insertCell(0);
                var idCell = row.insertCell(1);
                var nombreCell = row.insertCell(2);
                var cantidadCell = row.insertCell(3);

                tipoCell.innerHTML = "Servicio";
                nombreCell.innerHTML = servicio;
                idCell.innerHTML = id;
                cantidadCell.innerHTML = "0";
            }
            


        }
        
        function comprar(){
            var form = document.getElementById("formBuy");
            var tabla = document.getElementById("tabla");
            var cedula = document.getElementById("clienteSelect").value;
            
            var html = "";
            html += "<form name='form' method='post' action='comprar.jsp'>"
            
            html += "<input hidden name='" + cedula + "' value='cliente'>"
            var rows = tabla.rows;
            for (var i = 1, max = tabla.rows.length; i < max; i++) {
                var cells = rows[i].cells;
                
                html += "<input hidden name='id."+i+"/"+ cells[1].innerHTML +"' value='" + cells[1].innerHTML + "'>"
                html += "<input hidden name='quantity."+i+"/"+ cells[3].innerHTML +"' value='" + cells[3].innerHTML + "'>"
                
            }
            
            html+= "<input type='submit' class='button1' value='Comprar' />"
            html+= "</form>"
            
            form.innerHTML = html;

        }
        
    </script>
</html>
