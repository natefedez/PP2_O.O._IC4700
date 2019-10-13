/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package model;
import java.util.ArrayList;

public class Expediente {

    private int id;
    private ArrayList<ProductoVendido> historialVenta;
    private ArrayList<Tratamiento> tratamientos;
    
    public Expediente(){
        historialVenta = new ArrayList<>();
        tratamientos = new ArrayList<>();
        
    };

    // Getters para atributos de la clase Expediente
    public ArrayList<ProductoVendido> getHistorialVenta(){
        return this.historialVenta;
    }
    public  ArrayList<Tratamiento>  getTratamientos(){
        return this.tratamientos;
    }
    
    // Setters para atributos de la clase Expediente
    public void setHistorialVenta( ArrayList<ProductoVendido> historialVenta ){
        this.historialVenta = historialVenta;
    }
    public void setTratamientos( ArrayList<Tratamiento> tratamientos ){
        this.tratamientos = tratamientos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
