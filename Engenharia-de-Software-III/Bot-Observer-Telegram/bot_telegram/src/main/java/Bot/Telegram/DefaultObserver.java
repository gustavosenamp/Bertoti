package Bot.Telegram;

public class DefaultObserver implements Observer {
    @Override
    public void update(String message, StringBuilder response) {
        if (response.length() == 0) { // Se a resposta ainda não foi modificada
            response.append("Não entendi sua mensagem. Você pode perguntar pelo 'menu' ou fazer um 'pedido: [sabor]'.");
        }
    }
}
