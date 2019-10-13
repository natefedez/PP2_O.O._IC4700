/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package model;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;   
import java.util.Calendar;  
import java.util.Date; // import para utilizar clase Date provista por Java

public class Veterinario extends Persona {
    
    private String especialidad;
    private String horarioAtencion; // Atributo de tipo Date para el horario de atencion del veterinario
    private String tipo;
    
    // Get para atributos de clase Veterinario
    public String getHorarioAtencion(){
        return horarioAtencion;
    }
    public String getEspecialidad(){
    
        return this.especialidad;
    }
    
    public void setEspecialidad( String especialidad ){
    
        this.especialidad = especialidad;
        
    }
    
    // Set para atributo de clase Veterinario
    public void setHorarioAtencion( String horarioAtencion ){
        
        this.horarioAtencion = horarioAtencion;
    }
    
    
    
}
