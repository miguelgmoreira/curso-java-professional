package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class DesafioFilter {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Miguel", 19, "Brasília");
        Cliente c2 = new Cliente("Pedro", 25, "Águas lindas");
        Cliente c3 = new Cliente("Cleber", 32, "Washington");
        Cliente c4 = new Cliente("Julia", 15, "São Paulo");
        Cliente c5 = new Cliente("Chico", 10, "Brasília");
        Cliente c6 = new Cliente("Joaquim", 12, "Brasília");

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6);

        Consumer<Cliente> exibirDados = c -> System.out.println(c);
        Predicate<Cliente> moraEmBrasilia = c -> c.cidade.equalsIgnoreCase("brasília");
        Predicate<Cliente> maiorDeIdade = c -> c.idade >= 6;
        UnaryOperator<Cliente> zinho = c -> {
          c.apelido = c.nome + "zinho";
          return c;
        };

        clientes.stream()
                .filter(moraEmBrasilia)
                .filter(maiorDeIdade)
                .map(zinho)
                .forEach(exibirDados);
    }
}
