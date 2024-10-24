package example;

public class EstrategiaJurosSimples implements Estrategia {
    private double taxa;

    public EstrategiaJurosSimples(double taxa) {
        this.taxa = taxa;
    }

    public double calcularJuros(double saldo) {
        return saldo * taxa;
    }
}
