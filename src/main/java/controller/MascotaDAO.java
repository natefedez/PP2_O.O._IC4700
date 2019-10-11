package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Mascota;

public class MascotaDAO {
    
    public void insertarValoresMascota(int id, String tipoMascota, String nombre, String fechaNacimiento){
    
        Connection c;
        Statement stmt;
        
        String idString = Integer.toString(id);
        String tabla = "INSERT INTO Mascota (ID,TIPOMASCOTA,NOMBRE,FECHANACIMIENTO)";
        String valores = "VALUES ('"+ idString +"','"+tipoMascota+"','"+nombre+"','"+ fechaNacimiento +"');";
        //String valores = "VALUES ('"+idString+"','"+tipoMascota+"','"+nombre+"','"+fechaNacimiento+"');";
        
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
           c.setAutoCommit(false);
           System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]" + valores);

           stmt = c.createStatement();
           String sql = tabla + valores; 
            System.err.println(sql);
           stmt.executeUpdate(sql);
        } 
        catch ( ClassNotFoundException | SQLException e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        
        System.out.println(tabla);
        System.out.println(idString);
        System.out.println("[ Valores insertados EXITOSAMENTE ]");
        
    }
    
    public void setId( int id ){
        
       
        /*
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           String sql = "INSERT INTO Mascota (ID,NAME,AGE,ADDRESS,SALARY) " +
                          "VALUES (1, 'Paul', 32, 'California', 20000.00 );"; 
           stmt.executeUpdate(sql);
        } 
        catch ( ClassNotFoundException | SQLException e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
*/      

    }
    
    public String getMascota(){
    
       Connection c = null;
       Statement stmt = null;
       try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
          c.setAutoCommit(false);
          System.out.println("Opened database successfully");

          stmt = c.createStatement();
          ResultSet rs = stmt.executeQuery( "SELECT * FROM Mascota;" );

          while ( rs.next() ) {
             int id = rs.getInt("id");
             String tipoMascota = rs.getString("tipomascota");
             String nombre = rs.getString("nombre");
             String fechaNacimiento = rs.getString("fechaNacimiento");

             System.out.println( "ID = " + id );
             System.out.println( "TIPO MASCOTA = " + tipoMascota );
             System.out.println( "NAME = " + nombre );
             System.out.println( "FECHA NACIMIENTO = " + fechaNacimiento );
             System.out.println();
          }
          rs.close();
          stmt.close();
          c.close();
       } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
       }
       return "Operación Realizada EXITOSAMENTE";
    }
    
    public Mascota getMascota(int id){
        //SQL
        
        
        
        return new Mascota();
    }
    
}
