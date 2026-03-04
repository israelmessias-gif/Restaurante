// arquivo: src/Cliente.java
public class Cliente {
    // Atributos
    String nome;
    String telefone;

    // Construtor completo
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // exibir dados
    public void exibirDados() {
        System.out.println("=== Cliente ===");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Cliente {nome='" + nome + "', telefone='" + telefone + "'}";
    }
}
