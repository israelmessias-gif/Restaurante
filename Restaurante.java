// arquivo: src/Restaurante.java
public class Restaurante {
    // Atributos
    String nome;
    String endereco;
    String categoria;

    public Restaurante() {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
    }

    public void exibirDados() {
        System.out.println("=== Restaurante ===");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Categoria: " + categoria);
        System.out.println();
    }

    // toString
    @Override
    public String toString() {
        return "Restaurante {" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}