public class ShippedState implements OrderState {
    @Override
    public void pagar(Order order) {
        throw new IllegalStateException("O pedido foi pago.");
    }

    @Override
    public void enviar(Order order) {
        throw new IllegalStateException("Seu pedido foi enviado.");
    }

    @Override
    public void entregar(Order order) {
        System.out.println("Sua entrega foi realizada.");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancelar(Order order) {
        throw new IllegalStateException("Não é possível cancelar. Seu pedido foi cancelado.");
    }

    @Override
    public String getNome() {
        return "Enviado";
    }
}