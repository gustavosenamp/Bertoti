package Bot.Telegram;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 try {
             TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
             botsApi.registerBot(new ObserverBot());
             System.out.println("Bot iniciado com sucesso!");
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
