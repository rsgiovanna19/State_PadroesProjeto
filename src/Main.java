public class Main {
    public static void main(String[] args) {
        Order order = new Order("777");

        order.pagar();
        order.enviar();
        order.entregar();

        //se o caso for invalido...
        try {
            order.pagar(); //se ja entregue
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage()); //apresentar o erro
        }
    }
}