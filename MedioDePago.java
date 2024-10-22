package negocio;

public abstract class MedioDePago {

    public MedioDePago(){
    }

    public double procesarPago(double monto){
        return monto;
    }
}
