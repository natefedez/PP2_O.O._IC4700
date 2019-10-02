/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package natanfdecastro.tiendamascotas.proyectoProgramado2O;

public class Producto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private int cantidadExistencia;
    
    // Getters para atributos clase Producto
    public int getId(){ 
        return this.id;
    }
    public String getNombre(){ 
        return this.nombre;
    }
    public String getDescripcion(){ 
        return this.descripcion; 
    }
    public int getCantidadExistencia(){ 
        return this.cantidadExistencia; 
    }
    
    // Setters para atributos clase Producto
    public void setId( int id ){
        this.id = id;
    }
    public void setNombre( String nombre ){ 
        this.nombre = nombre; 
    }
    public void setDescripcion( String descripcion ){ 
        this.descripcion = descripcion; 
    }
    public void setCantidadExistencia( int cantidadExistencia ){ 
        this.cantidadExistencia = cantidadExistencia; 
    }
    
}
