/*
Instituto Tecnológico de Costa Rica
Ingeniería en Computación
Lenguajes de Programación, Semestre 2, 2019
Práctica Programada #2 
Paradigma Orientación a Objetos

Natán Fernández de Castro - 2017105774
Kevin Rojas Salazar - 2016081582
*/
package controller.DAO; // Paquete del Proyecto

// Imports de bibliotecas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class OperacionesBaseDatos {
    
    // Metodo que realiza la conexion a la base de datos
     private Connection connect() {
        // SQLite String para realizar la conexion especificando la direccion y el nombre de archivo
        String url = "jdbc:sqlite:tienda.db";
        
        // Variable para operar sobre la conexion
        Connection conn = null;
        
        // try catch para validar una conexion exitosa
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static void crearBase(){
        
        // Metodo estatico que tiene la funcion de crear la base de datos
        // Entradas: Ninguna
        // Salidas: Base de datos creada 
        // Restricciones: La base de datos solo es necesario crearla una vez
        // por lo que este metodo solo debe ser llamado una vez
        
        // Variable para operar sobre la conexion
        Connection c = null;

        // try catch para validar una conexion exitosa
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
        
        // Metodo estatico que tiene como funcion crear las tablas necesarias el funcionamiento del sistema
        // Entradas: Ninguna
        // Salidas: Tablas creadas en la base de datos
        // Restricciones: Las tablas solo deben crearse una vez
        // por lo que este metodo solo debe ser llamado una vez
    
        Connection c; // Variable para operar sobre la conexion
        Statement stmt; // Variable para operar sobre la base de datos

        // try catch que valida una operacion sin problemas, caso contrario dispara el problema presentado en la operacion
        try {
           Class.forName("org.sqlite.JDBC");
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
           System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]");

           stmt = c.createStatement();
           
           // Script almacenado en variable tipo String sql y crea la tabla DuenoMascota
           String sql = "CREATE TABLE DuenoMascota " +
                          "(Cedula INT PRIMARY KEY NOT NULL," +
                          "Nombre CHAR(50)," + 
                          "Apellidos CHAR(50)," + 
                          "Direccion CHAR(50)," + 
                          "Telefono INT)"; 
            stmt.executeUpdate(sql);
           
            // Script almacenado en variable tipo String sql y crea la tabla Veterinario
            sql = "CREATE TABLE Veterinario " +
                          "(Cedula INT PRIMARY KEY NOT NULL," +
                          "Nombre CHAR(50)," + 
                          "Apellidos CHAR(50)," + 
                          "Direccion CHAR(50)," + 
                          "Especialidad CHAR(50)," + 
                          "HorarioAtencion CHAR(50)," + 
                          "Telefono INT)"; 
            stmt.executeUpdate(sql);
            
            // Script almacenado en variable tipo String sql y crea la tabla Expediente
            sql = "CREATE TABLE Expediente" +
                          "(IdExpediente INT PRIMARY KEY NOT NULL)";

            stmt.executeUpdate(sql);
           
            // Script almacenado en variable tipo String sql y crea la tabla Mascota
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
           
           // Script almacenado en variable tipo String sql y crea la tabla Factura
            sql = "CREATE TABLE Factura " +
                          "(IdFactura INT PRIMARY KEY NOT NULL," +
                          "Cedula INT," + 
                          "Fecha CHAR(50)," + 
                          "FOREIGN KEY (Cedula) REFERENCES Persona(Cedula))"; 
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla Servicio
            sql = "CREATE TABLE Servicio " +
                          "(IdServicio INT PRIMARY KEY NOT NULL," + 
                          "Nombre CHAR(50))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla LineaFacturaServicio
            sql = "CREATE TABLE LineaFacturaServicio " +
                          "(IdFactura INT," +
                          "IdServicio INT," + 
                          "FOREIGN KEY (IdFactura) REFERENCES Factura(IdFactura)," +
                          "FOREIGN KEY (IdServicio) REFERENCES Servicio(IdServicio))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla Producto
            sql = "CREATE TABLE Producto" +
                          "(IdProducto INT PRIMARY KEY NOT NULL," +
                          "Nombre CHAR(50)," + 
                          "Descripcion CHAR(50)," +
                          "CantidadExistente INT)";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla ProductoVendido
            sql = "CREATE TABLE ProductoVendido" +
                          "(IdProductoVendido INT PRIMARY KEY NOT NULL," +
                          "IdProducto INT," +
                          "Cantidad INT," +
                          "FOREIGN KEY (IdProducto) REFERENCES Producto(IdProducto))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla LineaFacturaProducto
            sql = "CREATE TABLE LineaFacturaProducto" +
                          "(IdProductoVendido INT," +
                          "IdFactura INT," +
                          "FOREIGN KEY (IdProductoVendido) REFERENCES ProductoVendido(IdProductoVendido)," +
                          "FOREIGN KEY (IdFactura) REFERENCES Factura(IdFactura))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla ExpedienteProducto
            sql = "CREATE TABLE ExpedienteProducto" +  
                          "(IdProductoVendido INT," +
                          "IdExpediente INT," +
                          "FOREIGN KEY (IdProductoVendido) REFERENCES ProductoVendido(IdProductoVendido)," +
                          "FOREIGN KEY (IdExpediente) REFERENCES Expediente(IdExpediente))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla Tratamiento
            sql = "CREATE TABLE Tratamiento " +
                          "(IdTratamiento INT PRIMARY KEY NOT NULL," +
                          "Cedula INT," +
                          "Fecha CHAR(50)," +
                          "Descripcion CHAR(50)," +
                          "FOREIGN KEY (Cedula) REFERENCES Veterinario(Cedula))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla TratamientoExpediente
            sql = "CREATE TABLE TratamientoExpediente " +
                          "(IdTratamiento INT," +
                          "IdExpediente INT," +
                          "FOREIGN KEY (IdTratamiento) REFERENCES Tratamiento(IdTratamiento)," +
                          "FOREIGN KEY (IdExpediente) REFERENCES Expediente(IdExpediente))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos
            
            // Script almacenado en variable tipo String sql y crea la tabla ListaMedicamentos
            sql = "CREATE TABLE ListaMedicamentos" +
                          "(IdTratamiento INT," +
                          "nombre CHAR(50)," +
                          "FOREIGN KEY (IdTratamiento) REFERENCES Tratamiento(IdTratamiento))";
            stmt.executeUpdate(sql); // Se ejecuta una actualizacion en la base de datos

           stmt.close(); // Ejecuta un cierre en la base de datos
           c.close(); // Hace un cierre en la conexion
        } catch ( Exception e ) {
            
           // Mensaje especifico de error en la operacion
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("[ Tablas Creada EXITOSAMENTE ]"); 
        
        
    
    }
    
    public static void operacionesValoresTabla(String comando, String atributos, String valores){
        
        // Metodo estatico que se encarga de operar sobre la base de datos
        // El metodo puede aplicar las operaciones de insertar, modificar y borrar de manera generica
        
        Connection c; // Variable para operar sobre la conexion
        Statement stmt; // Variable para operar sobre la base de datos

        try {
            
           // Conexion a la base de datos especificada en el url
           Class.forName("org.sqlite.JDBC"); // 
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
           c.setAutoCommit(false);
           
          
           stmt = c.createStatement();
           String sql = comando + atributos + valores; // Se concatenan las variables recibidas por parametro en sql
                         
           stmt.executeUpdate(sql); // Se ejecuta una actualizacion de la base de datos con sql como parametro
           c.commit(); // Se confirman los cambios
           stmt.close(); // Se cierra la operacion con la base de datos
           c.close(); // Se cierra la conexion con la base de datos 
           
        } catch ( ClassNotFoundException | SQLException e ) {
            
            // Validacion en caso que resulte error en la operacion con la base de datos
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("Operacion realizada EXITOSAMENTE");
    
    }

}
