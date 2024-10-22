package negocio;

public class Efectivo extends MedioDePago{
    public Efectivo(){
        super();
    }
    public double procesarPago(double monto){
        return monto-monto*0.10;
    }
}
