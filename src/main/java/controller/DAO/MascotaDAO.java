package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Expediente;
import model.Mascota;

public class MascotaDAO {
    
    public static void insertarValoresMascota(int idMascota, int idExpediente, int cedula, String tipoMascota, String nombre, String fechaNacimiento){
        
        Connection c;
        Statement stmt;
        
        ExpedienteDAO.insertarValoresExpediente();
        
        String comando = "INSERT INTO ";
        String atributos = "MASCOTA (IDMASCOTA,IDEXPEDIENTE,CEDULA,TIPOMASCOTA,NOMBRE,FECHANACIMIENTO) ";
        String valores =  "VALUES (" + idMascota + ", "+ idExpediente +", "+ cedula +", '" + tipoMascota + "', '" + nombre + "', '"+ fechaNacimiento + "' );";
        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
        
    }
    
    //public static void setMascota(int id, String tipoMascota, String nombre, String fechaNacimiento)
    
    public static ArrayList<Mascota> listarMascotas(){
    
            Connection c;
            Statement stmt;
            ArrayList<Mascota> mascotas = new ArrayList<>();
            
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
                  String fechaNacimiento = rs.getString("FechaNacimiento");
                  
                  mascota.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
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
