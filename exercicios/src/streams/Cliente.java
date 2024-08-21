package streams;

public class Cliente {

    final String nome;
    final int idade;
    final String cidade;
    String apelido;

    public Cliente(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String toString() {
        return String.format("Nome do cliente: %s\nIdade do cliente: %d\nCidade em que o cliente reside: %s\n", apelido, idade, cidade);
    }
}
