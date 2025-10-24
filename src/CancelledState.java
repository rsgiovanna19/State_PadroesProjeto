//classe referenciando o cancelamento do pedido

public class CancelledState implements OrderState {
    @Override
    public void pagar(Order order) {
        throw new IllegalStateException("O pedido foi cancelado");
    }

    @Override
    public void enviar(Order order) {
        throw new IllegalStateException("O pedido foi cancelado.");
    }

    @Override
    public void entregar(Order order) {
        throw new IllegalStateException("O pedido foi cancelado.");
    }

    @Override
    public void cancelar(Order order) {
        throw new IllegalStateException("Pedido já cancelado.");
    }

    @Override
    public String getNome() {
        return "Cancelado";
    }
}