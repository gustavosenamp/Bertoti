package example;

public class LojaView implements Observer {
    @Override
    public void atualizar(Produto produto) {
        System.out.println("O preço atualizado do produto " + produto.getNome() + " é: R$" + produto.calcularPreco());
    }

    public void exibirPreco(double preco) {
        System.out.println("Preço final: R$" + preco);
    }
}
