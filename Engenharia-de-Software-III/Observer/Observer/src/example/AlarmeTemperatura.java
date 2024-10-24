package example;

public class AlarmeTemperatura implements Observador {
    private double temperatura;

    @Override
    public void atualizar(double temperatura) {
        this.temperatura = temperatura;
        verificarAlarme();
    }

    public void verificarAlarme() {
        if (temperatura > 30.0) {
            System.out.println("Alarme: Temperatura alta! (" + temperatura + " graus)");
        } else {
            System.out.println("Alarme: Temperatura normal. (" + temperatura + " graus)");
        }
    }
}

