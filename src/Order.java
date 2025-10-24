//classe referenciando o pedido completo

public class Order {
    private OrderState state;
    private final String id;

    public Order(String id) {
        this.id = id;
        this.state = new NewOrderState(); // estado inicial: Novo
        System.out.println("Pedido " + id + " criado. Estado: " + state.getNome());
    }

    public void pagar() {   //pagamento
        state.pagar(this);
    }

    public void enviar() {  //envio
        state.enviar(this);
    }

    public void entregar() {    //entrega
        state.entregar(this);
    }

    public void cancelar() {    //cancelamento
        state.cancelar(this);
    }

    void setState(OrderState state) {   //alteração do pedido 
        this.state = state;
        System.out.println("Pedido " + id + " mudou para: " + state.getNome());
    }

    public String getStateName() {
        return state.getNome();
    }

    public String getId() {
        return id;
    }
}