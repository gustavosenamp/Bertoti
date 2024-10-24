package example;

public class Conta {
    private Estrategia estrategia;
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void definirEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularJuros() {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia de juros foi definida.");
        }
        return estrategia.calcularJuros(saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
