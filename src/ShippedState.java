//classe referenciando o estado do pedido como enviado

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
    public void cancelar(Order order) { //caso nao seja possivel cancelar pelo pedido ja ter sido enviado
        throw new IllegalStateException("O pedido foi enviado. Não é possível cancelar.");
    }

    @Override
    public String getNome() {
        return "Enviado";
    }
}