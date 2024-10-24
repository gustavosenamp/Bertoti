package example;

public class TesteEstacao {
    public static void main(String[] args) {
        // Criando a estação meteorológica
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        // Criando os observadores
        DisplayTemperatura display = new DisplayTemperatura();
        AlarmeTemperatura alarme = new AlarmeTemperatura();

        // Adicionando os observadores à estação
        estacao.adicionarObservador(display);
        estacao.adicionarObservador(alarme);

        // Alterando a temperatura (os observadores serão notificados)
        estacao.definirTemperatura(25.0);
        estacao.definirTemperatura(32.0);
    }
}

