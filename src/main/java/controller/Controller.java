package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.*;
import view.CompraDTO;
import controller.DAO.*;

public class Controller {
    
    public Controller(){
        
        OperacionesBaseDatos.crearBase();
        OperacionesBaseDatos.crearTablas();
        
    }
    
    
    private SimulDB db = new SimulDB(); //Temporal java class for simulating db
    
    //Se implementa el controlador como un singleton para ser accedido desde los jsp como una sola instancia.
    private static Controller controllerInstance = null;
    
    public static Controller getInstance(){
        if(controllerInstance == null){
            controllerInstance = new Controller();
        }
        return controllerInstance;
    }
 
    //Devuelve la lista de productos que se vendieron en ese rango de fechas.
    public ArrayList<ProductoVendido> listarProductos(Date fechaInicio, Date fechaFin){
        
        return null;
    }
    
    //Devuelve la lista de productos que se vendieron en ese rango de fechas con esa mascota.
    public ArrayList<ProductoVendido> listarProductos(int idMascota, Date fechaInicio, Date fechaFin){
        
        return null;
    }
    
    //Devuelve una lista de servicios que se le vendieron a esa mascota en ese rango de fechas.
    public ArrayList<Servicio> listarServicios(int idMascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    //Devuelve lista de todos los clientes en el sistema
    public ArrayList<DuenoMascota> listarClientes(){
        return this.getAllClientes();
    }
    
    //Devuelve todas las mascotas tratadas por ese veterinario
    public ArrayList<Mascota> listarMascotas(int cedulaVeterinario){
        return null;
    }
    
    //Devuelve todas las facturas de un cliente
    public ArrayList<Factura> listarFacturas(int cedulaCliente){
        return null;
    }
    
    //Devuelve una lista de todos los productos que se encuentran en el inventario, no los que ya se acabaron.
    public ArrayList<Producto> listarProductosExistentes(){
        return null;
    }
    
    /*
    Disminuye la cantidad del inventario.
    CompraDTO posee los datos necesarios para llenar dicha factura.
    En el expediente de la mascota se agregan los servicios, la fecha y el veterinario que lo atendio.
    Asigna una nueva factura al duenno.
    */
    public void comprar(CompraDTO compraDTO){
        ArrayList<Integer> idProductos = compraDTO.getProductosId();
        ArrayList<Integer> cantidadProductos = compraDTO.getCantidadProducto();
        ArrayList<Integer> idServicios = compraDTO.getServiciosId();
        
        int cedula = compraDTO.getCedulaDuenno();
        
        
    }

    
    //Metodos para implementar CRUD
    
    //Metodos set buscan si el objeto ya existe en la base de datos, de ser asi lo reemplaza, sino lo crea.
    public void setProducto(Producto nuevoProduto){
        
    }
    public void setServicio(Servicio nuevoServicio){
        
    }
    public void setMascota(Mascota nuevaMascota, DuenoMascota duenno){
        
    }
    public void setCliente(DuenoMascota nuevoCliente){
        
        DuenoMascotaDAO.insertarValoresDuenoMascota(nuevoCliente.getCedula(), nuevoCliente.getNombre(), nuevoCliente.getApellidos(), nuevoCliente.getDireccion(), nuevoCliente.getTelefono());
           
    }
    public void setVeterinario(Veterinario nuevoVeterinario){
        
    }
    
    //Devuelve todos los valores de la base de datos
    public ArrayList<Factura> getAllFacturas(){
        
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(db.facturaA);
        facturas.add(db.facturaB);
        
        return facturas;
    }
    public ArrayList<Producto> getAllProdutos(){
        
        ArrayList<Producto> facturas = new ArrayList<>();
        facturas.add(db.productoA);
        facturas.add(db.productoB);
        facturas.add(db.productoC);
        
        return facturas;
    }
    public ArrayList<Servicio> getAllServicios(){
        
        ArrayList<Servicio> facturas = new ArrayList<>();
        facturas.add(db.servicio);
        facturas.add(db.servicioB);
        facturas.add(db.servicioC);
        
        return facturas;
    }
    public ArrayList<Mascota> getAllMascotas(){
        
        ArrayList<Mascota> facturas = new ArrayList<>();
        facturas.add(db.mascotaA);
        facturas.add(db.mascotaB);
        facturas.add(db.mascotaC);
        facturas.add(db.mascotaD);
        
        return facturas;
    }
    public ArrayList<DuenoMascota> getAllClientes(){
        
         ArrayList<DuenoMascota> facturas = new ArrayList<>();
        facturas.add(db.clienteA);
        facturas.add(db.clienteB);
        
        return facturas;
    }
    public ArrayList<Veterinario> getAllVeterinarios(){
        
        ArrayList<Veterinario> facturas = new ArrayList<>();
        facturas.add(db.veterinario);
        
        return facturas;
    }

    
    //Metodos delete que eliminan el dato de la base
    public void deleteProducto(int idProducto){
        
    }
    public void deleteServicio(int idServicio){
        
    }
    public void deleteMascota(int idMascota){
        
    }
    public void deleteCliente(int cedula){
        
    }
    public void deleteVeterinario(int idVeterinario){
        
    }
    
    
}
