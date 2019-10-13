/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Veterinario;

/**
 *
 * @author windows10
 */
public class VeterinarioDAO {
    
    public static void insertarValoresVeterinario(int cedula, String nombre, String apellidos, String direccion, String especialidad, String horarioAtencion, int telefono){
    
        Connection c;
        Statement stmt;
        
        String comando = "INSERT INTO ";
        String atributos = "VETERINARIO (CEDULA,NOMBRE,APELLIDOS,DIRECCION,ESPECIALIDAD,HORARIOATENCION,TELEFONO) ";
        String valores =  "VALUES (" + cedula + ", '" + nombre + "', '" + apellidos + "', '"+ direccion + "', '"+ especialidad +"', '"+ horarioAtencion +"', "+telefono+");";
        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
    }
    
    public static void borrarValoresVeterinario(int cedula){
    
        String comando = "DELETE from ";
        String atributos = "Veterinario where ID=";
        String valores = cedula + ";";

        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
  
    }
    
    public static ArrayList<Veterinario> listarVeterinario(ArrayList<Veterinario> veterinarios){
    
            Connection c;
            Statement stmt;
            
            try {
               Class.forName("org.sqlite.JDBC");
               c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
               c.setAutoCommit(false);
               System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]");

               stmt = c.createStatement();
               ResultSet rs = stmt.executeQuery( "SELECT * FROM VETERINARIO;" );


               while ( rs.next() ) {
                   
                  Veterinario vet = new Veterinario();

                  int cedula = rs.getInt("Cedula");
                  String nombre = rs.getString("Nombre");
                  String apellidos = rs.getString("Apellidos");
                  String direccion = rs.getString("Direccion");
                  String especialidad = rs.getString("Especialidad");
                  String horarioAtencion = rs.getString("HorarioAtencion");
                  int telefono = rs.getInt("Telefono");
                  
                 
                  vet.setCedula(cedula);
                  vet.setNombre(nombre);
                  vet.setApellidos(apellidos);
                  vet.setDireccion(direccion);
                  vet.setEspecialidad(especialidad);
                  vet.setHorarioAtencion(horarioAtencion);
                  vet.setTelefono(telefono);
                  
                  veterinarios.add(vet);

                  System.out.print( " | CEDULA: " + cedula );
                  System.out.print( " | NOMBRE: " + nombre );
                  System.out.print( " | APELLIDOS: " + apellidos );
                  System.out.print( " | DIRECCION: " + direccion);
                  System.out.print( " | ESPECIALIDAD: " + especialidad);
                  System.out.print( " | HORARIO ATENCION: " + horarioAtencion);
                  System.out.print( " | TELEFONO: " + telefono + " |");
                  System.out.println();
               }
               rs.close();
               stmt.close();
               c.close();
            } 
            catch ( Exception e ) {
               System.err.println( e.getClass().getName() + ": " + e.getMessage() );
               System.exit(0);
            }
            
            return veterinarios;
            
       }    
    
}
