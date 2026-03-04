// arquivo: src/SistemaDelivery.java
import java.util.ArrayList;
import java.util.List;

public class SistemaDelivery {
    private List<Pedido> pedidos = new ArrayList<>();

    // Cria um pedido e adiciona à lista
    public Pedido criarPedido(Cliente c, Restaurante r, double valor) {
        Pedido p = new Pedido(c, r, valor);
        pedidos.add(p);
        return p;
    }

    // pedidos cadastrados
    public void listarPedidos() {
        System.out.println("===== RELATÓRIO DE PEDIDOS =====");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        int i = 1;
        for (Pedido p : pedidos) {
            System.out.println("#" + i + " - " + p.toString());
            i++;
        }
        System.out.println("Total de pedidos: " + pedidos.size());
        System.out.println("================================");
        System.out.println();
    }
}