// arquivo: src/Pedido.java
public class Pedido {
    // Referências
    Cliente cliente;
    Restaurante restaurante;
    double valorTotal;

    // Construtor
    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal) {
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.valorTotal = valorTotal;
    }

    // Exibição simples
    public void exibirResumo() {
        System.out.println("=== Pedido ===");
        System.out.println("Cliente: " + cliente.nome + " (" + cliente.telefone + ")");
        System.out.println("Restaurante: " + restaurante.nome + " - " + restaurante.categoria);
        System.out.println("Valor Total: " + String.format("R$ %.2f", valorTotal));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Pedido {cliente='" + cliente.nome + "', restaurante='" + restaurante.nome +
                "', valorTotal=" + String.format("R$ %.2f", valorTotal) + "}";
    }
}
