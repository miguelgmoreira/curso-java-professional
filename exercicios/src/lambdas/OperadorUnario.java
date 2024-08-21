package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        // chama por ultimo o .apply do primeiro
        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);

        System.out.println(resultado1);

        // compose executa o que vem depois antes
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
    }
}
