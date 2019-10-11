package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

public class SimulDB {
    public DuenoMascota clienteA = new DuenoMascota();
    public DuenoMascota clienteB = new DuenoMascota();
    
    
    public Factura facturaA = new Factura();
    public Factura facturaB = new Factura();
    
    
    public Mascota mascotaA = new Mascota();
    public Mascota mascotaB = new Mascota();
    public Mascota mascotaC = new Mascota();
    public Mascota mascotaD = new Mascota();
    
    
    public Producto productoA = new Producto();
    public Producto productoB = new Producto();
    public Producto productoC = new Producto();
    
    
    public ProductoVendido productoVendidoA = new ProductoVendido();
    public ProductoVendido productoVendidoB = new ProductoVendido();
    
    
    public Servicio servicio = new Servicio();
    public Servicio servicioB = new Servicio();
    public Servicio servicioC = new Servicio();
    
    
    public Tratamiento tratamiento = new Tratamiento();
    
    public EspecialidadConcreta veterinario = new EspecialidadConcreta();
    
    public Expediente expediente = new Expediente();
    
            
    
    public SimulDB () {

        
        
        try {
            

            
            // ----------------------- MASCOTA---------------------------------------
            mascotaA.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            mascotaA.setId(0);
            mascotaA.setNombre("Mascotita");
            mascotaA.setTipoMascota("Muy peluda");
            mascotaA.setExpediente(expediente);
            
            mascotaB.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            mascotaB.setId(1);
            mascotaB.setNombre("El animal");
            mascotaB.setTipoMascota("Muy poderoso");
            mascotaB.setExpediente(expediente);
            
            mascotaC.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            mascotaC.setId(2);
            mascotaC.setNombre("Macota de nombre 001");
            mascotaC.setTipoMascota("Muy alegre");
            mascotaC.setExpediente(expediente);
            
            mascotaD.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            mascotaD.setId(3);
            mascotaD.setNombre("Pez");
            mascotaD.setTipoMascota("Sabe volar");
            mascotaD.setExpediente(expediente);
            // ----------------------- MASCOTAS---------------------------------------
            
            
            // ----------------------- PRODUCTOS---------------------------------------
            productoA.setCantidadExistencia(100);
            productoA.setDescripcion("Muy bueno");
            productoA.setId(0);
            productoA.setNombre("manzana");
            
            productoB.setCantidadExistencia(300);
            productoB.setDescripcion("Muy bueno y delicioso supongo");
            productoB.setId(1);
            productoB.setNombre("pera");
            
            productoC.setCantidadExistencia(1);
            productoC.setDescripcion("La mejor uva que ha existido");
            productoC.setId(2);
            productoC.setNombre("uva");
            
            
            // ----------------------- PRODUCTOS---------------------------------------
            
            
            
            // ----------------------- PRODUCTOS VENDIDOS---------------------------------------
            productoVendidoA.setCantidad(2);
            productoVendidoA.setFechaCompra(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            productoVendidoA.setProducto(productoB);
            
            productoVendidoB.setCantidad(10);
            productoVendidoB.setFechaCompra(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            productoVendidoB.setProducto(productoC);
            
            // ----------------------- PRODUCTOS VENDIDOS---------------------------------------
            
            
            
            
            // ----------------------- SERVICIOS---------------------------------------
            servicio.setId(96976);
            servicio.setNombre("acariciar");
            
            servicioB.setId(2345);
            servicioB.setNombre("discutir");
            
            servicioC.setId(654754);
            servicioC.setNombre("ver a la pared");
            
            // ----------------------- SERVICIO---------------------------------------
            
            
            // ----------------------- FACTURAS---------------------------------------
            facturaA.setFecha(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            ArrayList<ProductoVendido> productos = new ArrayList<>();
            ArrayList<Servicio> servicios = new ArrayList<>();
            facturaA.setProductos(productos);
            facturaA.setServicios(servicios);
            
            facturaB.setFecha(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            productos = new ArrayList<>();
            servicios = new ArrayList<>();
            facturaB.setProductos(productos);
            facturaB.setServicios(servicios);
            // ----------------------- FACTURAS---------------------------------------
            
            
            // ----------------------- CLIENTES---------------------------------------
            clienteA.setApellidos("Apellido Excelente");
            clienteA.setCedula(12345);
            clienteA.setDireccion("Siga hasta topar con cerca por el palo de aguacate.");
            
            ArrayList<Factura> facturas = new ArrayList<>();
            facturas.add(facturaA);
            facturas.add(facturaB);
            clienteA.setFacturas(facturas);
            
            ArrayList<Mascota> mascotas = new ArrayList<>();
            mascotas.add(mascotaA);
            mascotas.add(mascotaB);
            clienteA.setMascotas(mascotas);
            clienteA.setNombre("Clark Ken");
            clienteA.setTelefono(123765);
            
            
            
            
            clienteB.setApellidos("blah blah");
            clienteB.setCedula(5432);
            clienteB.setDireccion("Ni el mismo sabe.");
            
            facturas = new ArrayList<>();
            clienteB.setFacturas(facturas);
            
            mascotas = new ArrayList<>();
            mascotas.add(mascotaC);
            mascotas.add(mascotaD);
            clienteB.setMascotas(mascotas);
            clienteB.setNombre("La silla sin nombre");
            clienteB.setTelefono(22222222);
            // ----------------------- SERVICIO---------------------------------------
            
            
            // ----------------------- VETERINARIO---------------------------------------
            veterinario.setApellidos("blah blah");
            veterinario.setCedula(5432);
            veterinario.setDireccion("Ni el mismo sabe.");
            veterinario.setNombre("La silla sin nombre");
            veterinario.setTelefono(3333333);
            veterinario.setTipo("Especialidad Concreta");
            
            veterinario.setHorarioAtencion(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            // ----------------------- SERVICIO---------------------------------------
            
            
            
            // ----------------------- TRATAMIENTOS---------------------------------------
            tratamiento.setDescripcion("Hablar sobre las preocupaciones.");
            tratamiento.setFecha(new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"));
            ArrayList<String> listaMedicamentos = new ArrayList<>();
            tratamiento.setListaMedicamentos(listaMedicamentos);
            tratamiento.setVeterinario(veterinario);
            // ----------------------- TRATAMIENTOS---------------------------------------
            
            
            // ----------------------- PRODUCTOS VENDIDOS---------------------------------------
            expediente.setHistorialVenta(productos);
            expediente.setId(0);
            ArrayList<Tratamiento> tratamientos = new ArrayList<>();
            tratamientos.add(tratamiento);
            expediente.setTratamientos(tratamientos);
            
            // ----------------------- PRODUCTOS VENDIDOS---------------------------------------
            
        } catch (ParseException ex) {
            Logger.getLogger(SimulDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}
