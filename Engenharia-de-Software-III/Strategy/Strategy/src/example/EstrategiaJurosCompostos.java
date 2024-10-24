package example;

public class EstrategiaJurosCompostos implements Estrategia {
    private double taxa;
    private int vezesComposto;

    public EstrategiaJurosCompostos(double taxa, int vezesComposto) {
        this.taxa = taxa;
        this.vezesComposto = vezesComposto;
    }
 
    public double calcularJuros(double saldo) {
        return saldo * Math.pow((1 + taxa), vezesComposto) - saldo;
    }
}

