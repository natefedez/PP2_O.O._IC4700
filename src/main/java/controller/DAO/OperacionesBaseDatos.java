package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OperacionesBaseDatos {
    
     private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:tienda.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static void crearBase(){
        
        Connection c = null;

        try {    
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");  
        } 
        catch ( ClassNotFoundException | SQLException e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);  
        }   
        System.out.println("[ Base De Datos Creada EXITOSAMENTE ]");
    }
    
    public static void crearTablas(){
    
        Connection c;
        Statement stmt;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
           System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]");

           stmt = c.createStatement();
           
           String sql = "CREATE TABLE DuenoMascota " +
                          "(Cedula INT PRIMARY KEY NOT NULL," +
                          "Nombre CHAR(50)," + 
                          "Apellidos CHAR(50)," + 
                          "Direccion CHAR(50)," + 
                          "Telefono INT)"; 
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE Veterinario " +
                          "(Cedula INT PRIMARY KEY NOT NULL," +
                          "Nombre CHAR(50)," + 
                          "Apellidos CHAR(50)," + 
                          "Direccion CHAR(50)," + 
                          "Especialidad CHAR(50)," + 
                          "HorarioAtencion CHAR(50)," + 
                          "Telefono INT)"; 
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE Expediente" +
                          "(IdExpediente INTEGER PRIMARY KEY AUTOINCREMENT)";

            stmt.executeUpdate(sql);
           
           sql = "CREATE TABLE Mascota " +
                          "(IdMascota INT PRIMARY KEY NOT NULL," +
                          "IdExpediente INT," +
                          "Cedula INT," +
                          "TipoMascota CHAR(50)," + 
                          "Nombre CHAR(50)," + 
                          "FechaNacimiento CHAR(50)," +
                          "FOREIGN KEY (IdExpediente) REFERENCES Expediente(IdExpediente)," +
                          "FOREIGN KEY (Cedula) REFERENCES Persona(Cedula))"; 
           stmt.executeUpdate(sql);
           
            sql = "CREATE TABLE Factura " +
                          "(IdFactura INT PRIMARY KEY NOT NULL," +
                          "Cedula INT," + 
                          "Fecha CHAR(50)," + 
                          "ListaProductos CHAR(50)," + 
                          "Lista CHAR(50)," +
                          "FOREIGN KEY (Cedula) REFERENCES Persona(Cedula))"; 
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE Servicio " +
                          "(IdServicio INT PRIMARY KEY NOT NULL," + 
                          "Nombre CHAR(50))";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE LineaFacturaServicio " +
                          "(IdFactura INT," +
                          "IdServicio INT," + 
                          "FOREIGN KEY (IdFactura) REFERENCES Factura(IdFactura)," +
                          "FOREIGN KEY (IdServicio) REFERENCES Servicio(IdServicio))";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE Producto" +
                          "(IdProducto INT PRIMARY KEY NOT NULL," +
                          "Nombre CHAR(50)," + 
                          "Descripcion CHAR(50)," +
                          "CantidadExistente INT)";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE ProductoVendido" +
                          "(IdProductoVendido INT PRIMARY KEY NOT NULL," +
                          "IdProducto INT," +
                          "Cantidad INT," +
                          "FOREIGN KEY (IdProducto) REFERENCES Producto(IdProducto))";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE LineaFacturaProducto" +
                          "(IdProductoVendido INT," +
                          "IdFactura INT," +
                          "FOREIGN KEY (IdProductoVendido) REFERENCES ProductoVendido(IdProductoVendido)," +
                          "FOREIGN KEY (IdFactura) REFERENCES Factura(IdFactura))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE ExpedienteProducto" +  
                          "(IdProductoVendido INT," +
                          "IdExpediente INT," +
                          "FOREIGN KEY (IdProductoVendido) REFERENCES ProductoVendido(IdProductoVendido)," +
                          "FOREIGN KEY (IdExpediente) REFERENCES Expediente(IdExpediente))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE Tratamiento " +
                          "(IdTratamiento INT PRIMARY KEY NOT NULL," +
                          "Cedula INT," +
                          "Fecha CHAR(50)," +
                          "Descripcion CHAR(50)," +
                          "FOREIGN KEY (Cedula) REFERENCES Veterinario(Cedula))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE TratamientoExpediente " +
                          "(IdTratamiento INT," +
                          "IdExpediente INT," +
                          "FOREIGN KEY (IdTratamiento) REFERENCES Tratamiento(IdTratamiento)," +
                          "FOREIGN KEY (IdExpediente) REFERENCES Expediente(IdExpediente))";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE ListaMedicamentos" +
                          "(IdTratamiento INT," +
                          "nombre CHAR(50)," +
                          "FOREIGN KEY (IdTratamiento) REFERENCES Tratamiento(IdTratamiento))";
            stmt.executeUpdate(sql);

           stmt.close();
           c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("[ Tablas Creada EXITOSAMENTE ]"); 
        
        
    
    }
    
    public static void operacionesValoresTabla(String comando, String atributos, String valores){
        
        Connection c;
        Statement stmt;

        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
           c.setAutoCommit(false);

           stmt = c.createStatement();
           String sql = comando + atributos + valores;
                         
           stmt.executeUpdate(sql);

           stmt.close();
           c.commit();
           c.close();
        } catch ( ClassNotFoundException | SQLException e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("Datos insertados EXITOSAMENTE");
    
    }
    /*
    public static void borrarValoresTabla(String comando, String atributos, String valores){
        
       Connection c = null;
       Statement stmt = null;
      
       try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:test.db");
           c.setAutoCommit(false);
           System.out.println("Opened database successfully");

           stmt = c.createStatement();
           //String sql = comando + atributo + ;
           stmt.executeUpdate(sql);
           c.commit();
           
      
      stmt.close();
      c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Operation done successfully");
      */
    
    
    
    
    
    
}
