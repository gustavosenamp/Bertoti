package example;

public class SistemaArquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando diferentes tipos de arquivos
        Componente arquivo1 = new Arquivo("documento", "txt");
        Componente arquivo2 = new Arquivo("foto", "jpg");
        Componente arquivo3 = new Arquivo("apresentacao", "pdf");

        // Criando diretórios
        Diretorio dir1 = new Diretorio("Projetos");
        Diretorio dir2 = new Diretorio("Trabalhos");

        // Adicionando arquivos ao diretório 1
        dir1.adicionar(arquivo1);
        dir1.adicionar(arquivo2);

        // Adicionando diretório 1 e arquivo 3 ao diretório 2
        dir2.adicionar(dir1);
        dir2.adicionar(arquivo3);

        // Exibindo detalhes dos diretórios
        dir2.exibirDetalhes();
        
	}

}
