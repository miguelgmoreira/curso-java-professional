package classe.desafio;

public class Jantar {

    public static void main(String[] args) {
        Comida comida1 = new Comida("Arroz", 0.2);
        Comida comida2 = new Comida("Feijao", 0.3);

        Pessoa pessoa1 = new Pessoa("Miguel", 80);

        pessoa1.comer(comida1);
        pessoa1.comer(comida2);
    }
}
