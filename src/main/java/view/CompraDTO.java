package view;

import java.util.ArrayList;
import model.DuenoMascota;
import model.Mascota;
import model.Producto;
import model.Servicio;
import model.Veterinario;

public class CompraDTO {
    private ArrayList<Integer> productosId;
    private ArrayList<Integer> cantidadProducto;
    private ArrayList<Integer> serviciosId;
    
    private int cedulaDuenno;


    public ArrayList<Integer> getProductosId() {
        return productosId;
    }

    public void setProductosId(ArrayList<Integer> productosId) {
        this.productosId = productosId;
    }

    public ArrayList<Integer> getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(ArrayList<Integer> cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public ArrayList<Integer> getServiciosId() {
        return serviciosId;
    }

    public void setServiciosId(ArrayList<Integer> serviciosId) {
        this.serviciosId = serviciosId;
    }

    public int getCedulaDuenno() {
        return cedulaDuenno;
    }

    public void setCedulaDuenno(int cedulaDuenno) {
        this.cedulaDuenno = cedulaDuenno;
    }
    
}
