//interface inicial relacionado ao order + estados possiveis

public interface OrderState {
    void pagar(Order order); //pagamento
    void enviar(Order order); //envio
    void entregar(Order order); //entrega
    void cancelar(Order order); //cancelamento
    String getNome();
}