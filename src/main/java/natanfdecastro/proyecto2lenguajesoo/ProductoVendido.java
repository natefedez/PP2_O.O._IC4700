/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package natanfdecastro.tiendamascotas.proyectoProgramado2O;
import java.util.Date;

public class ProductoVendido {
    
    private Date fechaCompra;
    private Producto producto;
    private int cantidad; 
    
    // Getters para atributos de la clase ProductoVendido
    public Date getFechaCompra(){ 
        return this.fechaCompra; 
    }
    public Producto getProducto(){ 
        return this.producto; 
    }
    public int getCantidad(){ 
        return this.cantidad; 
    }
    
    // Setters para atributos de la clase ProductoVendido
    public void setFechaCompra( Date fechaCompra ){
        this.fechaCompra = fechaCompra;
    }
    public void setProducto( Producto producto ){
       this.producto = producto;
    }
    public void setCantidad( int cantidad ){
        this.cantidad = cantidad;
    }    
}
