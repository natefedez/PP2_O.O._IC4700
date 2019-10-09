package view;

import java.util.ArrayList;
import model.DuenoMascota;
import model.Mascota;
import model.Producto;
import model.Servicio;
import model.Veterinario;

public class CompraDTO {
    ArrayList<Producto> producto;
    ArrayList<Integer> cantidadProducto;
    ArrayList<Servicio> servicios;
    
    Mascota mascota;    
    DuenoMascota duenno;
    Veterinario veterinario;
    
    private boolean seDioServicio;

    public CompraDTO(ArrayList<Producto> producto, ArrayList<Integer> cantidadProducto, ArrayList<Servicio> servicios, Mascota mascota, DuenoMascota duenno, Veterinario veterinario, boolean seDioServicio) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.servicios = servicios;
        this.mascota = mascota;
        this.duenno = duenno;
        this.veterinario = veterinario;
        this.seDioServicio = seDioServicio;
    }

    public boolean servicio(){
        return seDioServicio;
    }
    
    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public ArrayList<Integer> getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(ArrayList<Integer> cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public DuenoMascota getDuenno() {
        return duenno;
    }

    public void setDuenno(DuenoMascota duenno) {
        this.duenno = duenno;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    
    
    
}
