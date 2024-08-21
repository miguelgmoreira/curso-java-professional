package classe.desafio;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            System.out.printf("Peso do %s antes de comer %s: %.2f\n", this.nome, comida.nome.toLowerCase(), this.peso);
            this.peso += comida.peso;
            System.out.printf("Peso do %s depois de comer %s %.2f\n", this.nome, comida.nome.toLowerCase(), this.peso);
        }
    }
}
