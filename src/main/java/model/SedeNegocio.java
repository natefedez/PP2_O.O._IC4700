package model;

import view.CompraDTO;

public class SedeNegocio implements Tienda, Clinica{


    @Override
    public void eliminarProducto(int idProducto) {
        for (int i = 0; i < 10; i++) {
            if(inventario.get(i).getId() == idProducto){
                inventario.remove(i);
            }
        }
    }

    @Override
    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }
    
}
