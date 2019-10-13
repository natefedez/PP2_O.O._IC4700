package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import model.Expediente;
import model.Mascota;

public class MascotaDAO {
    
    public static void insertarValoresMascota(int cedula, String tipoMascota, String nombre, String fechaNacimiento){
        
        Connection c;
        Statement stmt;
        //=========================================================
        // Creacion id Mascota
        Random rand = new Random(); 

        int id = rand.nextInt(1000);
        int extension = 20;
        
        String extensionId = Integer.toString(extension) + Integer.toString(id);
        
        int idMascota = Integer.parseInt(extensionId);
        
        //=========================================================
        // Creacion id Expediente
        Random rand2 = new Random(); 

        id = rand.nextInt(1000);
        extension = 40;
        
        extensionId = Integer.toString(extension) + Integer.toString(id);
        
        int idExpediente = Integer.parseInt(extensionId);
        
        ExpedienteDAO.insertarValoresExpediente(idExpediente);
        
        String comando = "INSERT INTO ";
        String atributos = "MASCOTA (IDMASCOTA,IDEXPEDIENTE,CEDULA,TIPOMASCOTA,NOMBRE,FECHANACIMIENTO) ";
        String valores =  "VALUES (" + idMascota + ", "+ idExpediente +", "+ cedula +", '" + tipoMascota + "', '" + nombre + "', '"+ fechaNacimiento + "' );";
        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
        
    }
    
    public static void borrarValoresMascota(String idMascota){
    
        String comando = "DELETE from ";
        String atributos = "MASCOTA where ID=";
        String valores = idMascota + ";";

        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
        
    
    }
    
    public static ArrayList<Mascota> listarMascotas(ArrayList<Mascota> mascotas){
    
            Connection c;
            Statement stmt;
            
            
            try {
               Class.forName("org.sqlite.JDBC");
               c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
               c.setAutoCommit(false);
               System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]");

               stmt = c.createStatement();
               ResultSet rs = stmt.executeQuery( "SELECT * FROM Mascota;" );
               

               while ( rs.next() ) {
                   
                  Mascota mascota = new Mascota();

                  int idMascota = rs.getInt("IdMascota");
                  int idExpediente = rs.getInt("IdExpediente");
                  int cedula = rs.getInt("Cedula");
                  String tipoMascota = rs.getString("Tipomascota");
                  String nombre = rs.getString("Nombre");
                  String sFecha = rs.getString("FechaNacimiento");
                  
                  Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(sFecha);
                  
                  mascota.setFechaNacimiento(fechaNacimiento);
                  mascota.setId(idMascota);
                  mascota.setNombre(nombre);
                  mascota.setTipoMascota(tipoMascota);
                  
                  Expediente expediente = new Expediente();
                  expediente.setId(idExpediente);
                  
                  mascota.setExpediente(expediente);
                  
                  mascotas.add(mascota);
                  

                  System.out.print( " | ID: " + idMascota );
                  System.out.print( " | ID EXPEDIENTE: " + idExpediente);
                  System.out.print( " | CEDULA DUEÑO: " + cedula);
                  System.out.print( " | TIPO MASCOTA: " + tipoMascota );
                  System.out.print( " | NOMBRE: " + nombre );
                  System.out.print( " | FECHA NACIMIENTO: " + fechaNacimiento + " |");
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
            return mascotas;

       }   
    
}
