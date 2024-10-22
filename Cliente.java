package negocio;

import excepciones.YaAgregadoException;
import java.util.ArrayList;

public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private ArrayList<Venta> ventas;

    public Cliente(int dni, String nombre, String apellido, int telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ventas = new ArrayList<Venta>();
    }

    public Cliente() {
        this.dni = 0;
        this.nombre = "";
        this.apellido = "";
        this.telefono = 0;
        this.direccion = "";
        this.ventas = new ArrayList<Venta>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public void agregarVenta(Venta venta) throws YaAgregadoException {
        for (Venta v : ventas) {
            if (v.getId() == venta.getId()) {
                throw new YaAgregadoException();
            }
        }
        ventas.add(venta);
    }
}
