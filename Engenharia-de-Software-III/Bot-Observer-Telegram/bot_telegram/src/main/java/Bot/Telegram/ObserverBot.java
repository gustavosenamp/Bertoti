package Bot.Telegram;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class ObserverBot extends TelegramLongPollingBot {
	 private TelegramBotSubject subject = new TelegramBotSubject();

	    public ObserverBot() {
	        // Registra os observers
	        subject.addObserver(new MenuObserver());
	        subject.addObserver(new OrderObserver());
	        subject.addObserver(new DefaultObserver());
	    }

	    @Override
	    public void onUpdateReceived(Update update) {
	        if (update.hasMessage() && update.getMessage().hasText()) {
	            String receivedMessage = update.getMessage().getText();
	            StringBuilder response = new StringBuilder(); // Usar StringBuilder para construir a resposta

	            // Notifica os observers para processar a resposta
	            subject.notifyObservers(receivedMessage, response);

	            // Se não houve resposta dos observers, exibe uma mensagem padrão
	            if (response.length() == 0) {
	                response.append("Bem-vindo à Pizzaria Bot! Pergunte sobre o menu ou faça um pedido.");
	            }

	            // Cria e envia a mensagem de resposta
	            SendMessage message = new SendMessage();
	            message.setChatId(update.getMessage().getChatId().toString());
	            message.setText(response.toString());

	            try {
	                execute(message); // Envia a mensagem ao Telegram
	            } catch (TelegramApiException e) {
	                e.printStackTrace();
	            }
	        }
	    }


    @Override
    public String getBotUsername() {
        return "engenharia_iii_bot";
    }

    @Override
    public String getBotToken() {
        return "7444925238:AAEIAPMCv63KygsQLeAg5xgU81SkNAc9vtM";
    }
}

