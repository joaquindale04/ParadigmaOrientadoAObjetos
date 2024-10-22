package negocio;

import excepciones.YaAgregadoException;

import java.util.ArrayList;

public class Minimercado {
    public ArrayList<Venta> ventas;
    public ArrayList<Cliente> clientes;
    public Catalogo catalogo;

    public Minimercado(){
        this.ventas = new ArrayList<Venta>();
        this.clientes=new ArrayList<Cliente>();
        this.catalogo=new Catalogo();
    }
    public Minimercado(Catalogo catalogo){
        this.catalogo=catalogo;
        this.clientes=new ArrayList<Cliente>();
        this.ventas=new ArrayList<Venta>();
    }
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Catalogo getCatalogo() {
        return catalogo;
    }
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo=catalogo;
    }
    public double facturacionTotal(){
        double suma=0;
        for(Venta v:ventas){
            suma+=v.getTotal();
        }
        return suma;
    }
    public void agregarVenta(Venta v) throws Exception{
        for(Venta v1:ventas){
            if(v.getId()==v1.getId()){
                throw new YaAgregadoException();
            }
        }
        this.ventas.add(v);

    }
    public void agregarCliente(Cliente c) throws Exception{
        for(Cliente c1:clientes){
            if (c1.getDni()==c.getDni()){
                throw new YaAgregadoException();
            }
        }
        this.clientes.add(c);

    }

    public Venta ObtenerVenta(int id){
        for(Venta v1:ventas){
            if(v1.getId()==id){
                return v1;
            }
        }
        return null;
    }
    public Cliente obtenerCliente(int id){
        for(Cliente c:clientes){
            if (c.getDni()==id){
                return c;
            }
        }
        return null;
    }
    public double calcularFacturacionTotal(){
        double suma = 0;
        for (Venta v : ventas) {
            suma += v.getTotal();
        }
        return suma;
    }




}

