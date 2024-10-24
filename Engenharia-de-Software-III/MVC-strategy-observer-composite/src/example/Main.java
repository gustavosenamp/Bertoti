package example;

public class Main {
    public static void main(String[] args) {
        // Criar Produto (Model)
        Produto boloDeRolo = new Produto("Bolo de Rolo", 100.0);

        // Criar View
        LojaView lojaView = new LojaView();

        // Criar Controller
        LojaController controller = new LojaController(boloDeRolo, lojaView);

        // Testar estratégias de preço
        controller.alterarEstrategiaDePreco(new PrecoNormal());
        controller.alterarPrecoBase(100);  // Preço normal sem desconto

        controller.alterarEstrategiaDePreco(new PrecoDescontoVIP());
        controller.alterarPrecoBase(100);  // Preço com desconto VIP (20%)

        controller.alterarEstrategiaDePreco(new PrecoDescontoSazonal());
        controller.alterarPrecoBase(100);  // Preço com desconto sazonal (10%)

        CategoriaComposite bolos = new CategoriaComposite("Bolos");
        ProdutoLeaf boloSimples = new ProdutoLeaf("Bolo Simples");
        ProdutoLeaf boloChocolate = new ProdutoLeaf("Bolo de Chocolate");

        CategoriaComposite recheados = new CategoriaComposite("Bolos Recheados");
        ProdutoLeaf boloMorango = new ProdutoLeaf("Bolo de Morango");
        ProdutoLeaf boloDoceLeite = new ProdutoLeaf("Bolo de Doce de Leite");

        bolos.adicionar(boloSimples);
        bolos.adicionar(boloChocolate);
        bolos.adicionar(recheados);

        recheados.adicionar(boloMorango);
        recheados.adicionar(boloDoceLeite);

        System.out.println("Estrutura de Produtos:");
        bolos.exibir();
    }
}

