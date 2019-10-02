/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package natanfdecastro.tiendamascotas.proyectoProgramado2O;
import java.util.Date; // import para utilizar clase Date provista por Java

public abstract class Veterinario extends Persona {
    
    private Date horarioAtencion; // Atributo de tipo Date para el horario de atencion del veterinario
    
    // Get para atributos de clase Veterinario
    public Date getHorarioAtencion(){
        return this.horarioAtencion;
    }
    
    // Set para atributo de clase Veterinario
    public void setHorarioAtencion( Date horarioAtencion ){
        this.horarioAtencion = horarioAtencion;
    }
    
    
}
