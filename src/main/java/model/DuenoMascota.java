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

public class DuenoMascota extends Persona {
    
    private Array mascotas;
    private Array facturas;
    
    DuenoMascota(){};
    
    // Getters para atributos clase DuenoMascota
    public Array getMascotas(){
        return this.mascotas;
    }
    public Array getFacturas(){
        return this.mascotas;
    }
    
    // Setters para atributos clase DuenoMascota
    public void setMascotas(Array mascotas){
        this.mascotas = mascotas;
    }
    public void setFacturas(Array facturas){
        this.facturas = facturas;
    }
}
