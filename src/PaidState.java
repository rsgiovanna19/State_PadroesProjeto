//classe referenciando o estado do pedido como pago

public class PaidState implements OrderState {
    @Override
    public void pagar(Order order) {
        throw new IllegalStateException("O pagamentto foi realizado.");
    }

    @Override
    public void enviar(Order order) {
        System.out.println("Seu pedido foi enviado.");
        order.setState(new ShippedState());
    }

    @Override
    public void entregar(Order order) {
        throw new IllegalStateException("Seu pediod nao foi enviado. Favor aguardar.");
    }

    @Override
    public void cancelar(Order order) {
        System.out.println("O pedido foi cancelado. O reembolso está a caminho.");
        order.setState(new CancelledState());
    }

    @Override
    public String getNome() {
        return "Pago";
    }
}