package example;

public class DatabaseManager {
    private static DatabaseManager instance;
    
    private String connection;
    
    private DatabaseManager() {
        connection = "Conexão ao Banco de Dados Iniciada";
    }

    public static synchronized DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado ao banco de dados: " + connection);
    }

    public void disconnect() {
        System.out.println("Desconectado do banco de dados");
    }

    public static void main(String[] args) {
        DatabaseManager dbManager1 = DatabaseManager.getInstance();
        dbManager1.connect();

        DatabaseManager dbManager2 = DatabaseManager.getInstance();
        dbManager2.disconnect();

        System.out.println(dbManager1 == dbManager2);
    }
}

