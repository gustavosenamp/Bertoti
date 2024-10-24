package example;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Sujeito {
    private List<Observador> observadores;
    private double temperatura;

    public EstacaoMeteorologica() {
        observadores = new ArrayList<>();
    }

    public void definirTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(temperatura);
        }
    }
}
