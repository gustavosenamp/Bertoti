package example;

public class PrecoDescontoVIP implements PrecoStrategy {
    @Override
    public double calcularPreco(double precoBase) {
        return precoBase * 0.8; // 20% de desconto
    }
}
