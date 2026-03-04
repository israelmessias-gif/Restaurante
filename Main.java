// arquivo: src/Main.java
void main() {
    // Restaurante
    Restaurante r1 = new Restaurante();
    Restaurante r2 = new Restaurante();

    // r1 - atributos
    r1.nome = "Pizzaria Lua";
    r1.endereco = "Ijaci, 45";
    r1.categoria = "Pizza";


    // r2 - atributos
    r2.nome = "Churras";
    r2.endereco = "Rua do boi, n2";
    r2.categoria = "Churrascaria";


    // exibir dados
    r1.exibirDados();
    r2.exibirDados();


    Cliente c1 = new Cliente("Ana Souza", "(35) 99999-1111");
    Cliente c2 = new Cliente("Carlos Lima", "(35) 98888-2222");

    // (Opcional) Mostrar cadastro
    // r1.exibirDados();
    // r2.exibirDados();
    // c1.exibirDados();
    // c2.exibirDados();

    // 2) Processar: criar pedidos no SistemaDelivery
    SistemaDelivery sistema = new SistemaDelivery();
    sistema.criarPedido(c1, r1, 80);
    sistema.criarPedido(c2, r2, 45.50);

    // (Opcional) Exibir resumo individual dos pedidos
    // for (Pedido p : new Pedido[]{
    //     new Pedido(c1, r1, 89.90), new Pedido(c2, r2, 45.50) }) p.exibirResumo();

    // 3) Relatório: listar pedidos cadastrados
    sistema.listarPedidos();
}

