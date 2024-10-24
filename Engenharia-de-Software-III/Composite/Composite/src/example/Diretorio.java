package example;
import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Componente {
    private String nome;
    private List<Componente> itens;

    public Diretorio(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionar(Componente componente) {
        itens.add(componente);
    }

    public void remover(Componente componente) {
        itens.remove(componente);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Diretório: " + nome);
        for (Componente item : itens) {
            item.exibirDetalhes();
        }
    }
}
