package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import model.Servicio;

public class ServicioDAO {

    public static void insertarValoresServicio(String nombre){
        
        Random rand = new Random(); 

        int id = rand.nextInt(1000);
        int extension = 50;
        
        String extensionId = Integer.toString(extension) + Integer.toString(id);
        
        int idServicio = Integer.parseInt(extensionId);
        
        String comando = "INSERT INTO ";
        String atributos = "SERVICIO (IDSERVICIO,NOMBRE) ";
        String valores =  "VALUES (" + idServicio + ", '" + nombre + "');";
        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
    
    
    }
    
    public static void borrarValoresServicio(int idServicio){
    
        String comando = "DELETE from ";
        String atributos = "Servicio where ID=";
        String valores = idServicio + ";";

        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
    
    }
    
    public static ArrayList<Servicio> listarServicio(ArrayList<Servicio> servicios){
    
        Connection c;
        Statement stmt;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
           c.setAutoCommit(false);
           System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]");

           stmt = c.createStatement();
           ResultSet rs = stmt.executeQuery( "SELECT * FROM DuenoMascota;" );


           while ( rs.next() ) {

              Servicio servicio = new Servicio();

              int idServicio = rs.getInt("IdServicio");
              String nombre = rs.getString("Nombre");

              servicio.setId(idServicio);
              servicio.setNombre(nombre);

              servicios.add(servicio);

              System.out.print( " | CEDULA: " + idServicio );
              System.out.print( " | NOMBRE: " + nombre );
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
            
            return servicios;
            
       }    
    
    
}
    

