package negocio;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precioUnitario;
    private int stock;
    private int stockMinimo;
    public Producto() {
        this.codigo=0;
        this.descripcion="";
        this.precioUnitario=0;
        this.stock=0;
        this.stockMinimo=0;

    }
    public Producto(int codigo, String descripcion, double precioUnitario, int stock, int stockMinimo) {
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioUnitario=precioUnitario;
        this.stock=stock;
        this.stockMinimo=stockMinimo;

    }
    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario=precioUnitario;
    }
    public void setStock(int stock) {
        this.stock=stock;
    }
    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo=stockMinimo;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public int getStock() {
        return stock;
    }
    public int getStockMinimo() {
        return stockMinimo;
    }
    public void actualizarStock(int cantidad){
        this.stock=this.stock+cantidad;
    }
    public boolean stockBajo(){
        return (this.stockMinimo>this.stock);
    }
}
