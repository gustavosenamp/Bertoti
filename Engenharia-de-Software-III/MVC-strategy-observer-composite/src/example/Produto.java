package example;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double precoBase;
    public PrecoStrategy estrategiaDePreco;
    private List<Observer> observers;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.observers = new ArrayList<>();
    }

    public void setEstrategiaDePreco(PrecoStrategy estrategiaDePreco) {
        this.estrategiaDePreco = estrategiaDePreco;
        notificarObservadores();
    }

    public double calcularPreco() {
        return estrategiaDePreco.calcularPreco(precoBase);
    }

    public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    private void notificarObservadores() {
        for (Observer observer : observers) {
            observer.atualizar(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}
