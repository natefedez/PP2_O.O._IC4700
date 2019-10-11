package controller.DAO;

import java.sql.Connection;
import java.sql.Statement;

public class ExpedienteDAO {

    public static void insertarValoresExpediente(){
        
        Connection c;
        Statement stmt;
        
        String comando = "INSERT INTO ";
        String atributos = "EXPEDIENTE (IDEXPEDIENTE) ";
        String valores =  "VALUES (" + null + ");";
        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
        
    }
    
}
