package bertoti;

public class Funcionario {
	private String nome;
    private String cargo;
    
    public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void atualizarCargo(String novoCargo) {
        this.cargo = novoCargo;
    }
}
