package negocio;

public class Venta {
    private int id;
    private Cliente cliente;
    private Detalle detalle;
    private double total;
    private MedioDePago medioDePago;

    public Venta(int id, Cliente cliente, Detalle detalle, double total) {
        this.id = id;
        this.cliente = cliente;
        this.detalle = detalle;
        this.total = total;
        this.medioDePago = null;
    }

    public Venta() {
        this.cliente = null;
        this.detalle = null;
        this.total = 0;
        this.medioDePago = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }

    public void calcularTotal() {
        double subtotal = detalle.getSubTotal();
        this.total = medioDePago.procesarPago(subtotal);
    }
}
