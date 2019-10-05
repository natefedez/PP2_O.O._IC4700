/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package model;
import java.util.Date; // import para utilizar clase Date provista por Java
import java.lang.reflect.Array;

public class Tratamiento {
    
    private Date fecha;
    private String descripcion;
    private Veterinario veterinario;
    private Array listaMedicamentos;
    
    Tratamiento(){};
    
    // Getters para atributos de la clase Tratamiento
    public Date getFecha(){ 
        return this.fecha; 
    }
    public String getDescripcion(){ 
        return this.descripcion; 
    }
    public Veterinario getVeterinario(){ 
        return this.veterinario; 
    }
    public Array getListaMedicamentos(){ 
        return this.listaMedicamentos; 
    }
    
    // Setters para atributos de la clase Tratamiento
    public void setFecha( Date fecha ){
        this.fecha = fecha; 
    }
    public void setDescripcion( String descripcion ){
        this.descripcion = descripcion; 
    }
    public void setVeterinario( Veterinario veterinario ){
        this.veterinario = veterinario;
    }
    public void setListaMedicamentos( Array listaMedicamentos ){
        this.listaMedicamentos = listaMedicamentos; 
    }
 
}
