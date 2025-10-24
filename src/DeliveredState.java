public class DeliveredState implements OrderState {
    @Override
    public void pagar(Order order) {
        throw new IllegalStateException("Seu pedido foi finalizado");
    }

    @Override
    public void enviar(Order order) {
        throw new IllegalStateException("Seu pedido foi finalizado");
    }

    @Override
    public void entregar(Order order) {
        throw new IllegalStateException("Seu pedido foi entregue!");
    }

    @Override
    public void cancelar(Order order) {
        throw new IllegalStateException("Seu pedido foi entregue! O cancelamento não é possível.");
    }

    @Override
    public String getNome() {
        return "Entregue!";
    }
}