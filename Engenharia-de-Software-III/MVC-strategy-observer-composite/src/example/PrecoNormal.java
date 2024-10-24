package example;

public class PrecoNormal implements PrecoStrategy {
    @Override
    public double calcularPreco(double precoBase) {
        return precoBase; // Preço sem alterações
    }
}

