package example;

public class PrecoDescontoSazonal implements PrecoStrategy {
    @Override
    public double calcularPreco(double precoBase) {
        return precoBase * 0.9; // 10% de desconto
    }
}
