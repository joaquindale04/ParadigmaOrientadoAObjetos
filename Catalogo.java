package negocio;

import excepciones.NoAgregadoException;
import excepciones.YaAgregadoException;
import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) throws YaAgregadoException {
        for (Producto p : productos) {
            if (p.getCodigo() == producto.getCodigo()) {
                throw new YaAgregadoException();
            }
        }
        productos.add(producto);
    }

    public void eliminarProducto(int codigo) throws NoAgregadoException {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                productos.remove(p);
                return;
            }
        }
        throw new NoAgregadoException();
    }

    public Producto obtenerProducto(int codigo) throws NoAgregadoException {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        throw new NoAgregadoException();
    }

    public ArrayList<Producto> productosAReponer() {
        ArrayList<Producto> productosAReponer = new ArrayList<Producto>();
        for (Producto producto : productos) {
            if (producto.getStock() < producto.getStockMinimo()) {
                productosAReponer.add(producto);
            }
        }
        return productosAReponer;
    }

    public boolean stockSuficiente(int id, int cantidad) throws NoAgregadoException {
        Producto producto = this.obtenerProducto(id);
        return producto.getStock() >= cantidad;
    }
}
