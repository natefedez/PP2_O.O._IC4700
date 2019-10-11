package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Mascota;

public class MascotaDAO {
    
        public void insertarValoresMascota(int idMascota,int Cedula, String tipoMascota, String nombre, String fechaNacimiento){
    
            Connection c;
            Statement stmt;

            //String idString = Integer.toString(id);
            //String tabla = "INSERT INTO MASCOTA (ID,TIPOMASCOTA,NOMBRE,FECHANACIMIENTO) ";
            String valores =  "VALUES (" + idMascota + ", '" + tipoMascota + "', '" + nombre + "', '"+ fechaNacimiento + "' );";


            try {
               Class.forName("org.sqlite.JDBC");
               c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
               c.setAutoCommit(false);
               System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]" + valores);

               stmt = c.createStatement();
               String sql = "INSERT INTO MASCOTA (IDMASCOTA,TIPOMASCOTA,NOMBRE,FECHANACIMIENTO) " + valores; 
               stmt.executeUpdate(sql);
               
               stmt.close();
               c.commit();
               c.close();
            } 
            catch ( ClassNotFoundException | SQLException e ) {
               System.err.println( e.getClass().getName() + ": " + e.getMessage() );
               System.exit(0);
            }

            System.out.println("[ Valores insertados EXITOSAMENTE ]");
        
        }
    
    //public static void setMascota(int id, String tipoMascota, String nombre, String fechaNacimiento)
    
        public static void listarMascotas(){
    
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

                  int idMascota = rs.getInt("IdMascota");
                  String tipoMascota = rs.getString("Tipomascota");
                  String nombre = rs.getString("Nombre");
                  String fechaNacimiento = rs.getString("FechaNacimiento");

                  System.out.print( " | ID: " + idMascota );
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
       

       }    
    
}
