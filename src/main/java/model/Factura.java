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

    private Date fecha;
    private ArrayList<ProductoVendido> productos;
    private ArrayList<Servicio> servicios;
    
    // Getters para atributos de la clase Factura
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
