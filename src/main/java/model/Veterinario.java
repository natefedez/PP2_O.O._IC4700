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

public abstract class Veterinario extends Persona {
    
    private String especialidad;
    private Date horarioAtencion; // Atributo de tipo Date para el horario de atencion del veterinario
    private String tipo;
    
    // Get para atributos de clase Veterinario
    public String getHorarioAtencion(){
        
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String strDate = dateFormat.format(horarioAtencion); 
        
        return strDate;
    }
    public String getEspecialidad(){
    
        return this.especialidad;
    }
    
    // Set para atributo de clase Veterinario
    public void setHorarioAtencion( Date horarioAtencion ){
        
        this.horarioAtencion = horarioAtencion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
