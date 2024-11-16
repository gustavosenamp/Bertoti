package Bot.Telegram;

import java.util.ArrayList;
import java.util.List;

public class TelegramBotSubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifica os observers e passa o response para que eles possam modificar a resposta
    public void notifyObservers(String message, StringBuilder response) {
        for (Observer observer : observers) {
            observer.update(message, response);
        }
    }
}
