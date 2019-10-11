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

public class Controller {
    
    
    private SimulDB db = new SimulDB(); //Temporal java class for simulating db
    
    //Se implementa el controlador como un singleton para ser accedido desde los jsp como una sola instancia.
    private static Controller controllerInstance = null;
    public static Controller getInstance(){
        if(controllerInstance == null){
            controllerInstance = new Controller();
        }
        return controllerInstance;
    }
    
    MascotaDAO mascotaDAO;
    
    public static void listarMascotas(){
    
       Connection c;
       Statement stmt;
       try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
          c.setAutoCommit(false);
          System.out.println("Opened database successfully");
          
          stmt = c.createStatement();
          ResultSet rs = stmt.executeQuery( "SELECT * FROM Mascota;" );
 
          while ( rs.next() ) {
             
             int id = rs.getInt("id");
             String tipoMascota = rs.getString("tipomascota");
             String nombre = rs.getString("nombre");
             String fechaNacimiento = rs.getString("fechaNacimiento");

             System.out.print( "[ ID = " + id );
             System.out.print( " TIPO MASCOTA = " + tipoMascota );
             System.out.print( " NAME = " + nombre );
             System.out.print( " FECHA NACIMIENTO = " + fechaNacimiento + " ]");
             System.out.println();
          }
          rs.close();
          stmt.close();
          c.close();
       } 
       catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
       }
    }
    
    //Devuelve la lista de productos que se vendieron en ese rango de fechas con esa mascota.
    public ArrayList<ProductoVendido> listarProductos(Mascota mascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    //Devuelve una lista de servicios que se le vendieron a esa mascota en ese rango de fechas.
    public ArrayList<Servicio> listarServicios(Mascota mascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    //Devuelve lista de todos los clientes en el sistema
    public ArrayList<DuenoMascota> listarClientes(){
        return null;
    }
    
    //Devuelve todas las mascotas tratadas por ese veterinario
    public ArrayList<Mascota> listarMascotas(Veterinario veterinario){
        return null;
    }
    
    //Devuelve todas las facturas de un cliente
    public ArrayList<Factura> listarFacturas(DuenoMascota duennoMascota){
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
    public boolean comprar(CompraDTO compraDTO){
        boolean respuesta = false;
        if(compraDTO.servicio()){
            //Se compro el servicio y pudo habersen comprado productos
            respuesta = comprarConServicio(compraDTO);
        } else {
            //Se compraron solamente productos sin servicios
            respuesta = comprarProducto(compraDTO.getDuenno(), compraDTO.getProducto(), compraDTO.getCantidadProducto());
        }
        return respuesta;
    }
    
    /*
    Disminuye la cantidad del inventario.
    Asigna una nueva factura al duenno.
    */
    public boolean comprarProducto(DuenoMascota duennoMascota, ArrayList<Producto> productos, ArrayList<Integer> cantidades){
        return false;
    }
    
    /*
    Disminuye la cantidad del inventario.
    En el expediente de la mascota se agregan los servicios, la fecha y el veterinario que lo atendio.
    Asigna una nueva factura al duenno.
    */
    public boolean comprarConServicio(CompraDTO compraDTO){
        DuenoMascota duennoMascota = compraDTO.getDuenno();
        Veterinario veterinario = compraDTO.getVeterinario();
        Mascota mascota = compraDTO.getMascota();
        ArrayList<Servicio> servicios = compraDTO.getServicios();
        
        ArrayList<Producto> productos = compraDTO.getProducto();
        ArrayList<Integer> cantidades = compraDTO.getCantidadProducto();
        
        return false;
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
    public void deleteProducto(Producto producto){
        
    }
    public void deleteServicio(Servicio servicio){
        
    }
    public void deleteMascota(Mascota mascota){
        
    }
    public void deleteCliente(DuenoMascota cliente){
        
    }
    public void deleteVeterinario(Veterinario veterinario){
        
    }
    
    
}
