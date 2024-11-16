package Bot.Telegram;

public class OrderObserver implements Observer {
    @Override
    public void update(String message, StringBuilder response) {
        if (message.toLowerCase().startsWith("pedido:")) {
            String pedido = message.substring(7).trim();
            response.append("Pedido recebido: ").append(pedido).append(". Preparando sua pizza!");
        }
    }
}
