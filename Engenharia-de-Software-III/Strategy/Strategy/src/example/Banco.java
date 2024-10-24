package example;

public class Banco {
    public static void main(String[] args) {
        // Criando uma conta com saldo inicial
        Conta conta = new Conta(1000.00);

        // Definindo estratégia de juros simples
        Estrategia jurosSimples = new EstrategiaJurosSimples(0.05);
        conta.definirEstrategia(jurosSimples);
        System.out.println("Juros simples calculados: " + conta.calcularJuros());

        // Definindo estratégia de juros compostos
        Estrategia jurosCompostos = new EstrategiaJurosCompostos(0.05, 2);
        conta.definirEstrategia(jurosCompostos);
        System.out.println("Juros compostos calculados: " + conta.calcularJuros());
    }
}
