package Bot.Telegram;

public class MenuObserver implements Observer {
    @Override
    public void update(String message, StringBuilder response) {
        if (message.equalsIgnoreCase("menu") || message.equalsIgnoreCase("sabores")) {
            response.append("Sabores disponíveis: Margherita, Calabresa, Frango com Catupiry.");
        }
    }
}
