/*
Instituto Tecnológico de Costa Rica
Ingeniería en Computación
Lenguajes de Programación, Semestre 2, 2019
Práctica Programada #2 
Paradigma Orientación a Objetos

Natán Fernández de Castro - 2017105774
Kevin Rojas Salazar - 2016081582
*/

package controller; // [ Paquete de Proyecto ]

// [ Imports ]
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.*;
import view.CompraDTO;
import controller.DAO.*;


public class Controller {
    
    public Controller(){ // Constructor Controlador    
        //OperacionesBaseDatos.crearBase(); // Llamada a metodo crearbase() que crea el la Base de Datos con la biblioteca SQLite
        //OperacionesBaseDatos.crearTablas(); // Llamada al metodo crearTablas() que crea todas las tablas que requerirá el sistema
        
    }
    
    
    private SimulDB db = new SimulDB(); //Temporal java class for simulating db
    
    //Se implementa el controlador como un singleton para ser accedido desde los jsp como una sola instancia.
    private static Controller controllerInstance = null;
    
    public static Controller getInstance(){ // get para hacer instancia del controlador
        if(controllerInstance == null){ // Caso que la instancia del controlador no se haya hecho, se crea el controlador
            controllerInstance = new Controller();
        }
        return controllerInstance; 
    }
 
    //Devuelve la lista de productos que se vendieron en ese rango de fechas.
    public ArrayList<ProductoVendido> listarProductos(Date fechaInicio, Date fechaFin){
        
        return null;
    }
    
    //Devuelve la lista de productos que se vendieron en ese rango de fechas con esa mascota.
    public ArrayList<ProductoVendido> listarProductos(int idMascota, Date fechaInicio, Date fechaFin){
        
        return null;
    }
    
    //Devuelve una lista de servicios que se le vendieron a esa mascota en ese rango de fechas.
    public ArrayList<Servicio> listarServicios(int idMascota, Date fechaInicio, Date fechaFin){
        return null;
    }
    
    //Devuelve lista de todos los clientes en el sistema
    public ArrayList<DuenoMascota> listarClientes(){
        return this.getAllClientes();
    }
    
    //Devuelve todas las mascotas tratadas por ese veterinario
    public ArrayList<Mascota> listarMascotas(int cedulaVeterinario){
        return null;
    }
    
    //Devuelve todas las facturas de un cliente
    public ArrayList<Factura> listarFacturas(int cedulaCliente){
        return null;
    }
    
    //Devuelve una lista de todos los productos que se encuentran en el inventario, no los que ya se acabaron.
    public ArrayList<Producto> listarProductosExistentes(){
        return null;
    }
    
    /*
    Disminuye la cantidad del inventario.
    CompraDTO posee los datos necesarios para llenar dicha factura.
    En el expediente de la mascota se agregan los servicios, la fecha y el veterinario que lo atendio.
    Asigna una nueva factura al duenno.
    */
    public void comprar(CompraDTO compraDTO){
        ArrayList<Integer> idProductos = compraDTO.getProductosId();
        ArrayList<Integer> cantidadProductos = compraDTO.getCantidadProducto();
        ArrayList<Integer> idServicios = compraDTO.getServiciosId();
        
        int cedula = compraDTO.getCedulaDuenno();
        
        
    }

    
    //Metodos para implementar CRUD
    
    //Metodos set buscan si el objeto ya existe en la base de datos, de ser asi lo reemplaza, sino lo crea.
    public void setProducto(Producto nuevoProducto){
        
        // Inserta valores en la tabla Producto por medio de llama al metodo insertarValoresProducto 
        // que recibe como parametro nombre, descripcion y cantidad en existencia del producto
        ProductoDAO.insertarValoresProducto(nuevoProducto.getNombre(), nuevoProducto.getDescripcion(), nuevoProducto.getCantidadExistencia());
        
    }
    public void setServicio(Servicio nuevoServicio){
        
        // Inserta valores en la tabla Servicio por medio de llama al metodo insertarValoresServicio
        // que recibe como parametro nombre del servicio
        ServicioDAO.insertarValoresServicio(nuevoServicio.getNombre());
        
    }
    public void setMascota(Mascota nuevaMascota, int cedula){
        
        
        // Inserta valores en la tabla Producto por medio de llamada al metodo insertarValoresMascota
        // que recibe como parametro cedula del cliente, tipo de mascota, fecha nacimiento, nombre de la mascota
        MascotaDAO.insertarValoresMascota(cedula, nuevaMascota.getTipoMascota(), nuevaMascota.getNombre(), nuevaMascota.getFechaNacimiento());
        
    }
    public void setCliente(DuenoMascota nuevoCliente){
        
        // Inserta valores en la tabla Producto por medio de llamada al metodo insertarValoresCliente 
        // que recibe como parametro cedula. nombre, apellidos, direccion y telefono del CLiente
        DuenoMascotaDAO.insertarValoresDuenoMascota(nuevoCliente.getCedula(), nuevoCliente.getNombre(), nuevoCliente.getApellidos(), nuevoCliente.getDireccion(), nuevoCliente.getTelefono());
           
    }
    public void setVeterinario(Veterinario nuevoVeterinario){
        
        // Inserta valores en la tabla Producto por medio de llamada al metodo insertarValoresProducto 
        // que recibe como parametro cedula, nombre, apellidos, direccion, especialidad, horario de atencion y telefono del veterinario
        VeterinarioDAO.insertarValoresVeterinario(nuevoVeterinario.getCedula(), nuevoVeterinario.getNombre(), nuevoVeterinario.getApellidos(), nuevoVeterinario.getDireccion(), nuevoVeterinario.getEspecialidad(), nuevoVeterinario.getHorarioAtencion(), nuevoVeterinario.getTelefono());
        
    }
    
    //Devuelve todos los valores de la base de datos
    public ArrayList<Factura> getAllFacturas(){
        
        // Crea un nuevo arreglo que contiene objetos tipo Factura
        ArrayList<Factura> facturas = new ArrayList<>();
        
        // LLama al metodo estatico listarFacturas para hacer un select de lo que contenga la tabla Factura 
        FacturaDAO.listarFacturas(facturas);
        
        // Retorna el arreglo con objetos Factura
        return facturas;
    }
    public ArrayList<Producto> getAllProdutos(){
        
        // Crea un nuevo arreglo que contiene objetos tipo Producto
        ArrayList<Producto> productos = new ArrayList<>();
        
        // LLamada al metodo estatico listarProductos para hacer un select de lo que contenga la tabla Producto
        ProductoDAO.listarProductos(productos);
        
        // Retorna el arreglo con objetos Producto
        return productos;
    }
    public ArrayList<Servicio> getAllServicios(){
        
        // Crea un nuevo arreglo que contiene objetos tipo Servicio
        ArrayList<Servicio> servicios = new ArrayList<>();
        
        // LLamada al metodo estatico listarServicio para hacer un select de lo que contenga la tabla Servicio
        ServicioDAO.listarServicio(servicios);
        
        // Retorna el arreglo con objetos Servicio
        return servicios;
    }
    public ArrayList<Mascota> getAllMascotas(){
        
        // Crea un nuevo arreglo que contiene objetos tipo Mascota
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        // LLamada al metodo estatico listarMascota para hacer un select de lo que contenga la tabla Mascota
        MascotaDAO.listarMascotas(mascotas);    
        
        // Retorna el arreglo con objetos tipo Mascota
        return mascotas;
    }
    public ArrayList<DuenoMascota> getAllClientes(){
        
        // Crea un nuevo arreglo que contiene objetos tipo 
        ArrayList<DuenoMascota> duenosMascotas = new ArrayList<>();
        
        // LLamada al metodo estatico listarMascota para hacer un select de lo que contenga la tabla DuenoMascota
        DuenoMascotaDAO.listarDuenosMascota(duenosMascotas);
        
        // Retorna el arreglo con objetos tipo DuenoMascota
        return duenosMascotas;
        
    }
    public ArrayList<Veterinario> getAllVeterinarios(){
        
        // Crea un nuevo arreglo que contiene objetos tipo 
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        
        // Llamada al metodo estatico listaVeterinarios que hace un select de lo que contenga la tabla Veterinario
        VeterinarioDAO.listarVeterinario(veterinarios);
        
        // Retorna arreglo con objetos tipo Veterinario
        return veterinarios;
    }

    
    //Metodos delete que eliminan el dato de la base
    public void deleteProducto(int idProducto){

        // LLamada al metodo estatico deleteProducto que realiza la operacion de DELETE en la tabla Producto de la Base de Datos TIENDA
        ProductoDAO.borrarValoresProducto(Integer.toString(idProducto));
        
    }
    public void deleteServicio(int idServicio){
        // Llamada al metodo estatico deleteServicio que realiza la operacion de DELETE en la tabla SERVICIO de la base de datos TIENDA
        ServicioDAO.borrarValoresServicio(Integer.toString(idServicio));
        
    }
    public void deleteMascota(int idMascota){
        // Llamada al metodo estatico deleteMascota que realiza la operacion de DELETE en la tabla Mascota de la base de datos TIENDA
        MascotaDAO.borrarValoresMascota(Integer.toString(idMascota));
        
    }
    public void deleteCliente(int cedula){
        // Llamada al metodo estatico deleteCliente que realiza la operacion de DELETE en la tabla CLIENTE de la base de datos TIENDA
        DuenoMascotaDAO.borrarValoresDuenoMascota(Integer.toString(cedula));
        
    }
    public void deleteVeterinario(int cedula){
        
        // Llamada al metodo estatico deleteVeterinario que realiza la operacion de DELETE en la tabla Veterinario de la base de datos TIENDA
        VeterinarioDAO.borrarValoresVeterinario(Integer.toString(cedula));
        
    }

    
    //Metodos upgrade buscan un match en la base con el ide, borra datos y agrega de nuevo.
//Metodos upgrades que modifican el dato de la base
    public void upgradeProducto(Producto producto){
        deleteProducto(producto.getId());
        setProducto(producto);
    }
    
    public void upgradeServicio(Servicio servicio){
        deleteServicio(servicio.getId());
        setServicio(servicio);
    }
    public void upgradeMascota(Mascota mascota){

        ArrayList<DuenoMascota> clientes = this.getAllClientes();
        ArrayList<Mascota> mascotas = null;

        int cedula = 888888888;
        for (int i = 0; i < clientes.size(); i++) {
            mascotas = clientes.get(i).getMascotas();

            for (int j = 0; j < mascotas.size(); j++) {
                if(mascotas.get(j).getId() == mascota.getId()){
                    cedula = clientes.get(i).getCedula();
                }
            }
        }
        deleteMascota(mascota.getId());
        setMascota(mascota, 0);
    }
    
    public void upgradeCliente(DuenoMascota cliente){
        deleteCliente(cliente.getCedula());
        setCliente(cliente);
    }
    
    public void upgradeVeterinario(Veterinario veterinario){
        deleteVeterinario(veterinario.getCedula());
        setVeterinario(veterinario);
    }
    
    
}
