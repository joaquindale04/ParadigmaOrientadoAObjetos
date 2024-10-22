package negocio;

import excepciones.NoAgregadoException;
import excepciones.StockInsuficienteException;
import java.util.ArrayList;

public class Detalle {
    private ArrayList<Producto> productos;
    private double subTotal;

    public Detalle(double subTotal) {
        this.productos = new ArrayList<Producto>();
        this.subTotal = subTotal;
    }

    public Detalle() {
        this.productos = new ArrayList<Producto>();
        this.subTotal = 0;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void agregarProducto(Producto producto, int cantidad) throws Exception {
        if (producto.getStock() >= cantidad) {
            for (int k = 0; k < cantidad; k++) {
                productos.add(producto);
                subTotal += producto.getPrecioUnitario();
                producto.actualizarStock(-1);
            }
        } else {
            throw new StockInsuficienteException();
        }
    }

    public void eliminarProducto(Producto producto, int cantidad) throws Exception {
        if (productos.contains(producto)) {
            for (int k = 0; k < cantidad; k++) {
                if (productos.contains(producto)) {
                    productos.remove(producto);
                    subTotal -= producto.getPrecioUnitario();
                    producto.actualizarStock(+1);
                }
            }
        } else {
            throw new NoAgregadoException();
        }
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Producto p : productos) {
            subtotal += p.getPrecioUnitario();
        }
        return subtotal;
    }

    public int cantidadApariciones(Producto producto) {
        int cantidad = 0;
        for (Producto p : productos) {
            if (producto.getCodigo() == p.getCodigo()) {
                cantidad++;
            }
        }
        return cantidad;
    }
}

