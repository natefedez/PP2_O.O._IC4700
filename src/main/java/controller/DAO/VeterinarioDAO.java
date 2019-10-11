/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DAO;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author windows10
 */
public class VeterinarioDAO {
    
    public static void insertarValoresVeterinario(int cedula, String nombre, String apellidos, String direccion, String especialidad, String horarioAtencion, int telefono){
    
        Connection c;
        Statement stmt;
        
        String comando = "INSERT INTO ";
        String atributos = "VETERINARIO (CEDULA,NOMBRE,APELLIDOS,DIRECCION,TELEFONO,HORARIOATENCION) ";
        String valores =  "VALUES (" + cedula + ", '" + nombre + "', '" + apellidos + "', '"+ direccion + "', '"+ especialidad +"', '"+ horarioAtencion +"', "+telefono+");";
        
        OperacionesBaseDatos.insertarTabla(comando, atributos, valores);
    }
    
}
