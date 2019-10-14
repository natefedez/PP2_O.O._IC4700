/*
Instituto Tecnológico de Costa Rica
Ingeniería en Computación
Lenguajes de Programación, Semestre 2, 2019
Práctica Programada #2 
Paradigma Orientación a Objetos

Natán Fernández de Castro - 2017105774
Kevin Rojas Salazar - 2016081582
*/
package controller.DAO; // Ubicacion Paquete Proyecto

// Imports de bibliotecas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.DuenoMascota;

public class DuenoMascotaDAO { // Clase DuenoMascotaDAO, tiene como funcion realizar operaciones asociando los objetos 
                               // y la base de datos SQLite
    
    public static void insertarValoresDuenoMascota(int cedula, String nombre, String apellidos, String direccion, int telefono){
          
        // Metodo estatico que tiene como funcion insertar valores especificos en la tabla DuenoMascota
        // Entradas: cedula (Entero), apellidos (String), direccion (String), telefono (Entero)
        // Salidas: Valores especificados insertados en la tabla DuenoMascota
        // Restricciones: Ninguna
        
        Connection c;
        Statement stmt;
        
        // Comando INSERT a realizar y se guarda en la variable comando 
        String comando = "INSERT INTO "; 
        
        // Atributos a insertar en la tabla DuenoMascota 
        String atributos = "DuenoMascota (CEDULA,NOMBRE,APELLIDOS,DIRECCION,TELEFONO) ";
        
        // Valores a insertar en la tabla y accesados por parametros transferidos al metodo
        String valores =  "VALUES (" + cedula + ", '" + nombre + "', '" + apellidos + "', '"+ direccion + "', "+ telefono +" );"; //
        
        // Llamada al metodo estatico que opera sobre la base de datos y se le pasa por parametro los valores a insertar
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);

    }
    
     
    public static void borrarValoresDuenoMascota(String cedula){
        
        // Metodo estatico que tiene como funcion borrar los datos de la tabla DuenoMascota segun un id especificado
        // Entradas: cedula (Entero)
        // Salidas: Dueno de la tabla DuenoMascota borrado de la tabla segun el id
        // Restriccion: No presenta ninguna restriccion
    
        // Variable comando que guarda la operacion a ejecutar en la tabla
        String comando = "DELETE from ";
        
        // Variable atributos que almacena la tabla y la validacion a aplicar
        String atributos = "DuenoMascota where CEDULA=";
        
        // Variable valores que almacena el valor especifico de cedula que se desea borrar de la tabla
        String valores = cedula + ";";

        // Llamada al metodo estatico que opera sobre la base de datos y se le pasa por parametro los valores a borrar
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
  
    }

    
    public static ArrayList<DuenoMascota> listarDuenosMascota(ArrayList<DuenoMascota> duenosMascotas){
        
        // Metodo estatico que tiene como funcion listar todos los duenos de mascota en la tabla DuenoMascota 
        // Entradas: Arreglo de objetos tipo DuenoMascota vacio
        // Salidas: Arreglo de objetos tipo DuenoMascota lleno de los valores seleccionado de la tabla
        // Restricciones: No presenta ninguna restriccion
    
        Connection c;
        Statement stmt;
        
        // Realiza un try catch en caso que la operacion dispare algun error y sea necesario mostrar cual error presenta
        try {
            
           // Accede a la dependencia de SQLite
           Class.forName("org.sqlite.JDBC");
           
           // Realiza la conexion con la base de datos y el nombre y ubicacion especificados
           c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
          
           c.setAutoCommit(false);
          
           stmt = c.createStatement();
           // Operacion a realizar en la tabla DuenMascota que seleccion todos los valores de tabla
           ResultSet rs = stmt.executeQuery( "SELECT * FROM DuenoMascota;" );


           // Realiza un ciclo mientras presente un valor siguiente sin consultar
           while ( rs.next() ) {
               
              // Crea un objeto mascota generico en el que tiene como funcion convertir
              // los valores consultados a la tabla a tipo objeto
              DuenoMascota duenoMascota = new DuenoMascota();
              
              // Se captura el valor cedula (Entero) de la tabla y se almacena
              int cedula = rs.getInt("Cedula");
              
              // Se captura el valor nombre (String) de la tabla y se almacena
              String nombre = rs.getString("Nombre");
              // Se captura el valor apellidos (String) de la tabla y se almacena 
              String apellidos = rs.getString("Apellidos");
              // Se captura el valor direccion (String) de la tabla y se almacena 
              String direccion = rs.getString("Direccion");
              // Se captura el valor telefono (Entero) de la tabla y se almacena
              int telefono = rs.getInt("Telefono");
              
              // Se asigna el valor cedula al atrubuto del objeto duenoMascota
              duenoMascota.setCedula(cedula);
              // Se asigna el valor nombre al atrubuto del objeto duenoMascota
              duenoMascota.setNombre(nombre);
              // Se asigna el valor apellidos al atrubuto del objeto duenoMascota
              duenoMascota.setApellidos(apellidos);
              // Se asigna el valor direccion al atrubuto del objeto duenoMascota
              duenoMascota.setDireccion(direccion);
              // Se asigna el valor telefono al atrubuto del objeto duenoMascota
              duenoMascota.setTelefono(telefono);
              
              // Se agrega el objeto duenoMascota al arreglo de objetos
              duenosMascotas.add(duenoMascota);
              
              // Se imprime en pantalla los valores consultados
              System.out.print( " | CEDULA: " + cedula );
              System.out.print( " | NOMBRE: " + nombre );
              System.out.print( " | APELLIDOS: " + apellidos );
              System.out.print( " | DIRECCION: " + direccion);
              System.out.print( " | TELEFONO: " + telefono + " |");
              System.out.println();
           }
           rs.close(); // Se cierra el operador de los valores de la tabla
           stmt.close(); // Se cierra el operador de la tabla
           c.close(); // Se cierra la conexion
        } 
        catch ( Exception e ) {
            
            // Validacion que tiene como proposito mostrar mensaje especifico en caso de fallo en la operacion
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        
        // Retorna arreglo mascota para ser mostrado
        return duenosMascotas;
            
       }    
    
}
