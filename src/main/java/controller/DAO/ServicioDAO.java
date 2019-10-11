package controller.DAO;

public class ServicioDAO {

    public static void insertarValoresServicio(int idServicio, String nombre){
    
        String comando = "INSERT INTO ";
        String atributos = "SERVICIO (IDSERVICIO,NOMBRE) ";
        String valores =  "VALUES (" + idServicio + ", '" + nombre + "');";
        
        OperacionesBaseDatos.operacionesValoresTabla(comando, atributos, valores);
    
    
    }
    
}
