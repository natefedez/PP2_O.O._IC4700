package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.*;
import view.CompraDTO;

public class Controller {
    
    //Se implementa el controlador como un singleton para ser accedido desde los jsp como una sola instancia.
    private static Controller controllerInstance = null;
    public static Controller getInstance(){
        if(controllerInstance == null){
            controllerInstance = new Controller();
        }
        return controllerInstance;
    }
    
    MascotaDAO mascotaDAO;
    
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
        return null;
    }
    public ArrayList<Producto> getAllProdutos(){
        return null;
    }
    public ArrayList<Servicio> getAllServicios(){
        return null;
    }
    public ArrayList<Mascota> getAllMascotas(){
        return null;
    }
    public ArrayList<DuenoMascota> getAllClientes(){
        return null;
    }
    public ArrayList<Veterinario> getAllVeterinarios(){
        return null;
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
