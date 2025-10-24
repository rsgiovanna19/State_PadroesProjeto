public class NewOrderState implements OrderState {
    @Override
    public void pagar(Order order) {
        System.out.println("Pagamento aprovado.");
        order.setState(new PaidState());
    }

    @Override
    public void enviar(Order order) {
        throw new IllegalStateException("Seu pedido nao foi pago. Não foi possível finalizar.");
    }

    @Override
    public void entregar(Order order) {
        throw new IllegalStateException("Seu pedido nao foi pago. Não foi possível finalizar.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("Pagamento não realizado. Pedido cancelado.");
        order.setState(new CancelledState());
    }

    @Override
    public String getNome() {
        return "Novo";
    }
}