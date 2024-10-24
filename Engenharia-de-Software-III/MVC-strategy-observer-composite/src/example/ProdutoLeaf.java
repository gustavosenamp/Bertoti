package example;

 public class ProdutoLeaf implements CompositeComponent {
    private String nome;

    public ProdutoLeaf(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println("Produto: " + nome);
    }
}
