package example;
import java.util.ArrayList;
import java.util.List;

public class Arquivo implements Componente{
	private String nome;
    private String tipo;

    public Arquivo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Arquivo: " + nome + "." + tipo);
    }
}
