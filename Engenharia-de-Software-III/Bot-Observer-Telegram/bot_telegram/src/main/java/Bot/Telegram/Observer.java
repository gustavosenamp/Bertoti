package Bot.Telegram;

public interface Observer {
    void update(String message, StringBuilder response);
}
