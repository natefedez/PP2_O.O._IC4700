package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import model.Factura;
import model.Producto;

public class FacturaDAO {
    
        public static void insertarValoresFactura(int cedula, String fecha){
    
        
        Connection c;
        Statement stmt;
        
        Random rand = new Random(); 

        int id = rand.nextInt(1000);
        int extension = 60;
        
        String extensionId = Integer.toString(extension) + Integer.toString(id);
        
        int idFactura = Integer.parseInt(extensionId);

        String comando = "INSERT INTO ";
        String atributos = "FACTURA (IDFACTURA,CEDULA,FECHA) ";
        String valores =  "VALUES (" + idFactura + ", " + cedula + ", '" + fecha + "');";
        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
        
    }
        
        public static ArrayList<Factura> listarFacturas(ArrayList<Factura> facturas){
    
            Connection c;
            Statement stmt;
            
            try {
               Class.forName("org.sqlite.JDBC");
               c = DriverManager.getConnection("jdbc:sqlite:tienda.db");
               c.setAutoCommit(false);
               System.out.println("[ Base de Datos Abierta CORRECTAMENTE ]");

               stmt = c.createStatement();
               ResultSet rs = stmt.executeQuery( "SELECT * FROM Factura;" );


               while ( rs.next() ) {
                   
                  Factura factura = new Factura();

                  int idFactura = rs.getInt("IdFactura");
                  int cedula = rs.getInt("Cedula");
                  String sFecha = rs.getString("Fecha");
                  
                  Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(sFecha);
                  
                  factura.setIdFactura(idFactura);
                  factura.setCedula(cedula);
                  factura.setFecha(fecha);
                  
                  facturas.add(factura);

                  System.out.print( " | ID FACTURA: " + idFactura );
                  System.out.print( " | CEDULA DUENO MASCOTA: " + cedula );
                  System.out.print( " | FECHA EMISION: " + fecha + " |");
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
       
            return facturas;
      }
    
}
