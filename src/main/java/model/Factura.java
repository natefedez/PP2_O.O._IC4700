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
import java.util.Date;

public class Factura {

    private Date fecha;
    private Array productos;
    private Array servicios;
    
    // Getters para atributos de la clase Factura
    public Date getFecha(){
        return this.fecha;
    }
    public Array getProductos(){
        return this.productos;
    }
    public Array getSevicios(){
        return this.servicios;
    }
    
    // Setters para atributos de la clase Factura
    public void setFecha( Date fecha ){
        this.fecha = fecha;
    }
    public void setProductos( Array productos ){
        this.productos = productos;
    }
    public void setServicios( Array servicios ){
        this.servicios = servicios;
    }
}
