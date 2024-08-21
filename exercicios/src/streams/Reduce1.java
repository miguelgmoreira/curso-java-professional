package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acc, item) -> acc + item;

        // Integer suporta nulo, diferente de int
        Integer total = nums.parallelStream().reduce(soma).get(); // Nesse caso o retorno do reduce é um objeto Optional, que possui alguns métodos
        System.out.println(total);

        Integer total2 = nums.stream().reduce(100, soma); // Nesse caso por ter um valor inicial não volta um Optional e sim um Integer
        System.out.println(total2);

        // Resultado foi um Optional<Integer>
        nums.stream()
                .filter(n -> n > 10)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
