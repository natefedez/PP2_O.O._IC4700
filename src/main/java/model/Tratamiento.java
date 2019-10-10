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
import java.util.ArrayList;

public class Tratamiento {
    
    private Date fecha;
    private String descripcion;
    private Veterinario veterinario;
    private ArrayList<String> listaMedicamentos;
    
    public Tratamiento(){};
    
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
    public ArrayList<String> getListaMedicamentos(){ 
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
    public void setListaMedicamentos( ArrayList<String> listaMedicamentos ){
        this.listaMedicamentos = listaMedicamentos; 
    }
 
}
