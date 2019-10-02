/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package natanfdecastro.tiendamascotas.proyectoProgramado2O;

public class Servicio {
    
    private String nombre;
    private int id;
    
    // Getters para atributos de la clase Servicio
    public String getNombre(){ return this.nombre; }
    public int getId(){ return this.id; }
    
    // Setters para atributos de la clase Servicio
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    public void setId( int id ){
        this.id = id;
    }
}
