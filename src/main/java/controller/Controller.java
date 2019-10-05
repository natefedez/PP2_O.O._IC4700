package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.*;

public class Controller {
    
    public ArrayList<Mascota> listarMascota(){
        return null;
    }
    
    public ArrayList<ProductoVendido> listarProductos(int idMascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    public ArrayList<Servicio> listarServicios(int idMascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    public ArrayList<DuenoMascota> listarClientes(){
        return null;
    }
    
    public ArrayList<Mascota> listarMascotas(int cedulaVeterinario){
        return null;
    }
    
    public ArrayList<Factura> listarFacturas(int cedulaCliente){
        return null;
    }
    
    public ArrayList<Producto> listarProductosExistentes(){
        return null;
    }
    
    public boolean comprarProducto(int cedulaCliente, ArrayList<Integer> idProductos, ArrayList<Integer> cantidades){
        return false;
    }
    
    public boolean comprarServicio(int cedulaCliente, int cedulaMedico, int idMascota, ArrayList<Integer> idServicios){
        return false;
    }
    
    public Factura obtenerFactura(){
        return null;
    }
    
    public void informeMascota(){
        
    }
    public void informeServiciosVendidos(Date fechaInicio, Date fechaFin){
        
    }
    public void informeCliente(){
        
    }
    public HashMap<String,  int[]> informeMascota(int idVeterinario){
        return null;
    }
    public void informeFacturas(int idCliente){
        
    }
    public void informeProductos(){
        
    }
    
    
}
