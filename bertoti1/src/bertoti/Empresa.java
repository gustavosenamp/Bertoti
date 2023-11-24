package bertoti;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	 private String nome;
	    private List<Funcionario> listaFuncionarios;
	    private List<Projeto> listaProjetos;

	    public Empresa(String nome) {
	        this.nome = nome;
	        this.listaFuncionarios = new ArrayList<>();
	        this.listaProjetos = new ArrayList<>();
	    }

	    public Funcionario adicionarFuncionario(String nome, String cargo) {
	        Funcionario novoFuncionario = new Funcionario(nome, cargo);
	        listaFuncionarios.add(novoFuncionario);
	        return novoFuncionario;
	    }

	    public void removerFuncionario(Funcionario funcionario) {
	        listaFuncionarios.remove(funcionario);
	    }

	    public Projeto adicionarProjeto(String nome, String descricao) {
	        Projeto novoProjeto = new Projeto(nome, descricao);
	        listaProjetos.add(novoProjeto);
	        return novoProjeto;
	    }

	    public void removerProjeto(Projeto projeto) {
	        listaProjetos.remove(projeto);
	    }
}
