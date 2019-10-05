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

public class Expediente {

    private Array historialVenta;
    private Array tratamientos;
    
    Expediente(){};

    // Getters para atributos de la clase Expediente
    public Array getHistorialVenta(){
        return this.historialVenta;
    }
    public Array getTratamientos(){
        return this.tratamientos;
    }
    
    // Setters para atributos de la clase Expediente
    public void setHistorialVenta( Array historialVenta ){
        this.historialVenta = historialVenta;
    }
    public void setTratamientos( Array tratamientos ){
        this.tratamientos = tratamientos;
    }
    
}
