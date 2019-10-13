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

public class DuenoMascota extends Persona {
    
    private ArrayList<Mascota> mascotas;
    private ArrayList<Factura> facturas;
        
    public DuenoMascota(){
        mascotas = new ArrayList<>();
        facturas = new ArrayList<>();
    }
    
    
    
    
    // Getters para atributos clase DuenoMascota
    public ArrayList<Mascota> getMascotas(){
        return this.mascotas;
    }
    public ArrayList<Factura> getFacturas(){
        return this.facturas;
    }
    
    // Setters para atributos clase DuenoMascota
    public void setMascotas(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }
    public void setFacturas(ArrayList<Factura> facturas){
        this.facturas = facturas;
    }
}
