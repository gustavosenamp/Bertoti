package bertoti;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exemplo de uso
        Empresa empresa = new Empresa("MinhaEmpresa");
        Funcionario funcionario1 = empresa.adicionarFuncionario("João", "Desenvolvedor");
        Projeto projeto1 = empresa.adicionarProjeto("Projeto1", "Descrição do Projeto 1");

        System.out.println("Funcionário: " + funcionario1.getNome() + ", Cargo: " + funcionario1.getCargo());
        System.out.println("Projeto: " + projeto1.getNome() + ", Descrição: " + projeto1.getDescricao());
    }
}


