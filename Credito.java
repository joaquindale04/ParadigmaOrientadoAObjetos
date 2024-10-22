package negocio;

public class Credito extends MedioDePago {
    private int cuotas;

    public Credito() {
        super();
        this.cuotas = 0;
    }

    public Credito(int cuotas) {
        super();
        this.cuotas = cuotas;
    }

    public double procesarPago(double monto) {
        if (this.cuotas == 2) {
            return monto + monto * 0.06;
        } else if (this.cuotas == 3) {
            return monto + monto * 0.12;
        } else if (this.cuotas == 6) {
            return monto + monto * 0.20;
        } else {
            return monto;
        }
    }
}
