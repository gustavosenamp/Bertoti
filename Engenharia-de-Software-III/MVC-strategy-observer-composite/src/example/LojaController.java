package example;

public class LojaController {
    private Produto produto;
    private LojaView view;

    public LojaController(Produto produto, LojaView view) {
        this.produto = produto;
        this.view = view;
        produto.adicionarObservador(view);
    }

    public void alterarPrecoBase(double novoPrecoBase) {
        produto.setEstrategiaDePreco(produto.estrategiaDePreco);
        double precoFinal = produto.calcularPreco();
        view.exibirPreco(precoFinal);
    }

    public void alterarEstrategiaDePreco(PrecoStrategy estrategia) {
        produto.setEstrategiaDePreco(estrategia);
    }
}

