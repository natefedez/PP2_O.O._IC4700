<%@page import="controller.Controller"%>
<%@page import="model.DuenoMascota"%>
<%@page import="java.util.ArrayList"%>
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

            <%
                ArrayList<DuenoMascota> clientes = Controller.getInstance().getAllClientes();
            %>
            <form name="form" method="post" action="funcionesAgregar/agregarMascota.jsp">
                <p>Tipo de Mascota</p>
                <input name="tipo"><br>

                <p>Nombre</p>
                <input name="nombre"><br>

                <p>Fecha de Nacimiento</p>
                <input name="fecha" type="date" placeholder="dd/mm/yyyy"><br>
                
                <p>Dueno de mascota</p>
                <select name="clienteSelect">
                    <%

                        for(int i = 0; i<clientes.size(); ++i){
                         %>
                         <option value="<%= clientes.get(i).getCedula()%>"><%= clientes.get(i).getNombre()%> <%= clientes.get(i).getApellidos()%> <%= clientes.get(i).getCedula()%> </option>
                         <%
                        }
                    %>
                </select>

                <br><br><input class="button1" type="submit" value="Agregar Mascota Nueva" />
            </form>
        </div>
        
    </body>
</html>
