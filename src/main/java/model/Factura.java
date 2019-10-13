/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Factura {

    private int idFactura;
    private int cedula;
    private Date fecha;   
    private ArrayList<ProductoVendido> productos;
    private ArrayList<Servicio> servicios;
    
    public Factura(){
        productos = new ArrayList<>();
        servicios = new ArrayList<>();
        
    }
    // Getters para atributos de la clase Factura
    public int getIdFactura(){
    
        return this.idFactura;
    }
    public int getCedula(){
    
        return this.cedula;
    }
    public Date getFecha(){
        return this.fecha;
    }
    public ArrayList<ProductoVendido> getProductos(){
        return this.productos;
    }
    public ArrayList<Servicio> getSevicios(){
        return this.servicios;
    }
    
    // Setters para atributos de la clase Factura
    public void setIdFactura(int idFactura){
    
        this.idFactura = idFactura;
    }
    public void setCedula(int cedula){
        
        this.cedula = cedula;
    }
    public void setFecha( Date fecha ){
        this.fecha = fecha;
    }
    public void setProductos( ArrayList<ProductoVendido> productos ){
        this.productos = productos;
    }
    public void setServicios( ArrayList<Servicio> servicios ){
        this.servicios = servicios;
    }
}
