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
        
        //OperacionesBaseDatos.crearBase();
        //OperacionesBaseDatos.crearTablas();
        
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
    public void setProducto(Producto nuevoProducto){
        
        ProductoDAO.insertarValoresProducto(nuevoProducto.getNombre(), nuevoProducto.getDescripcion(), nuevoProducto.getCantidadExistencia());
        
    }
    public void setServicio(Servicio nuevoServicio){
        
        ServicioDAO.insertarValoresServicio(nuevoServicio.getNombre());
        
    }
    public void setMascota(Mascota nuevaMascota, int cedula){

        MascotaDAO.insertarValoresMascota(cedula, nuevaMascota.getTipoMascota(), nuevaMascota.getNombre(), nuevaMascota.getFechaNacimiento());
        
    }
    public void setCliente(DuenoMascota nuevoCliente){
        
        DuenoMascotaDAO.insertarValoresDuenoMascota(nuevoCliente.getCedula(), nuevoCliente.getNombre(), nuevoCliente.getApellidos(), nuevoCliente.getDireccion(), nuevoCliente.getTelefono());
           
    }
    public void setVeterinario(Veterinario nuevoVeterinario){
        
        VeterinarioDAO.insertarValoresVeterinario(nuevoVeterinario.getCedula(), nuevoVeterinario.getNombre(), nuevoVeterinario.getApellidos(), nuevoVeterinario.getDireccion(), nuevoVeterinario.getEspecialidad(), nuevoVeterinario.getHorarioAtencion(), nuevoVeterinario.getTelefono());
        
    }
    
    //Devuelve todos los valores de la base de datos
    public ArrayList<Factura> getAllFacturas(){
        
        ArrayList<Factura> facturas = new ArrayList<>();
        
        FacturaDAO.listarProductos(facturas);
        
        return facturas;
    }
    public ArrayList<Producto> getAllProdutos(){
        
        ArrayList<Producto> productos = new ArrayList<>();
        
        ProductoDAO.listarProductos(productos);
        
        return productos;
    }
    public ArrayList<Servicio> getAllServicios(){
        
        ArrayList<Servicio> servicios = new ArrayList<>();
        
        ServicioDAO.listarServicio(servicios);
        
        return servicios;
    }
    public ArrayList<Mascota> getAllMascotas(){
        
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        MascotaDAO.listarMascotas(mascotas);    
        
        return mascotas;
    }
    public ArrayList<DuenoMascota> getAllClientes(){
        
        ArrayList<DuenoMascota> duenosMascotas = new ArrayList<>();
        
        DuenoMascotaDAO.listarDuenosMascota(duenosMascotas);
        
        return duenosMascotas;
        
    }
    public ArrayList<Veterinario> getAllVeterinarios(){
        
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        
        VeterinarioDAO.listarVeterinario(veterinarios);
        
        return veterinarios;
    }

    
    //Metodos delete que eliminan el dato de la base
    public void deleteProducto(int idProducto){
        
        ProductoDAO.borrarValoresProducto(idProducto);
        
    }
    public void deleteServicio(int idServicio){
        
        ServicioDAO.borrarValoresServicio(idServicio);
        
    }
    public void deleteMascota(int idMascota){
        
        MascotaDAO.borrarValoresMascota(idMascota);
        
    }
    public void deleteCliente(int cedula){
        
        DuenoMascotaDAO.borrarValoresDuenoMascota(cedula);
        
    }
    public void deleteVeterinario(int cedula){
        
        VeterinarioDAO.borrarValoresVeterinario(cedula);
        
    }
    
    
}
