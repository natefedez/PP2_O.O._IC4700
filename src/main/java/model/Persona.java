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

public abstract class Persona {
    
    private int cedula;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    
    // Getters para los atributos en la clase Persona
    public int getCedula(){ 
        return this.cedula; 
    }
    public String getNombre(){ 
        return this.nombre; 
    }
    public String getApellidos(){ 
        return this.apellidos; 
    }
    public String getDireccion(){ 
        return this.direccion; 
    }
    public int getTelefono(){ 
        return this.telefono; 
    }
    
    // Setters para los atributos en la clase Persona
    public void setCedula(int cedula){ 
        this.cedula = cedula; 
    }
    public void setNombre(String nombre){ 
        this.nombre = nombre; 
    }
    public void setApellidos(String apellidos){ 
        this.apellidos = apellidos; 
    }
    public void setDireccion(String direccion){ 
        this.direccion = direccion; 
    }
    public void setTelefono(int telefono){ 
        this.telefono = telefono; 
    }

}
