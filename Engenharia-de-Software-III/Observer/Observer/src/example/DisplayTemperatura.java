package example;

public class DisplayTemperatura implements Observador {
    private double temperatura;

    @Override
    public void atualizar(double temperatura) {
        this.temperatura = temperatura;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Display: Temperatura atual é " + temperatura + " graus.");
    }
}

