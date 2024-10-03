package example;

public class RestauranteFacade {
	private Cozinha cozinha;
    private Bar bar;
    private Caixa caixa;

    public RestauranteFacade() {
        this.cozinha = new Cozinha();
        this.bar = new Bar();
        this.caixa = new Caixa();
    }

    public void fazerPedido() {
        System.out.println("Fazendo pedido no restaurante...");
        cozinha.prepararComida();
        bar.prepararBebida();
        caixa.processarPagamento();
        System.out.println("Pedido concluído!");
    }
}
