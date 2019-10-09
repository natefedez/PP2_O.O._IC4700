package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.*;

public class Controller {
    
    MascotaDAO mascotaDAO;
    
    public ArrayList<ProductoVendido> listarProductos(Mascota mascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    public ArrayList<Servicio> listarServicios(Mascota mascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    public ArrayList<DuenoMascota> listarClientes(){
        return null;
    }
    
    //TODO cambiar id por objeto
    public ArrayList<Mascota> listarMascotas(Veterinario veterinario){
        return null;
    }
    
    public ArrayList<Factura> listarFacturas(DuenoMascota duennoMascota){
        return null;
    }
    
    public ArrayList<Producto> listarProductosExistentes(){
        return null;
    }
    
    public boolean comprarProducto(DuenoMascota duennoMascota, ArrayList<Producto> idProductos, ArrayList<Integer> cantidades){
        return false;
    }
    
    public boolean comprarServicio(DuenoMascota duennoMascota, Veterinario veterinario, Mascota mascota, ArrayList<Integer> idServicios){
        
        return false;
    }
    
    public Factura obtenerFactura(){
        return null;
    }
    
    public ArrayList<Mascota> informeMascota(){
       
        return null;
    }
    public void informeServiciosVendidos(Date fechaInicio, Date fechaFin){
        
    }
    public void informeCliente(){
        
    }
    public HashMap<String,  int[]> informeMascota(Veterinario veterinario){
        return null;
    }
    public void informeFacturas(DuenoMascota duenoMascota){
        
    }
    public void informeProductos(){
        
    }
    
    
}
