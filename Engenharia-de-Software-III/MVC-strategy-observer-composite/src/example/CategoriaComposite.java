package example;

import java.util.ArrayList;
import java.util.List;

public class CategoriaComposite implements CompositeComponent {
    private String nome;
    private List<CompositeComponent> componentes;

    public CategoriaComposite(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public void adicionar(CompositeComponent componente) {
        componentes.add(componente);
    }

    public void remover(CompositeComponent componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibir() {
        System.out.println("Categoria: " + nome);
        for (CompositeComponent componente : componentes) {
            componente.exibir();
        }
    }
}
