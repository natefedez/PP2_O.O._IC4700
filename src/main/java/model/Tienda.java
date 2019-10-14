/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package model;

import java.util.ArrayList;
import view.CompraDTO;

public interface Tienda {

    ArrayList<Producto> inventario = new ArrayList<>();
    
    public void eliminarProducto(int idProducto);
    public void agregarProducto(Producto producto);
    
    
}
