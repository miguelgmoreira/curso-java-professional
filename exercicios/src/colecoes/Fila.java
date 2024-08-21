package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila esta cheia!
        // Offer -> Caso não consiga adicionar ele irá retornar falso.
        // Add -> Lança uma excessão caso não consiga adicionar.
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Paulo");
        fila.offer("Julia");
        fila.add("Isabela");
        fila.offer("Manu");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        // Quando a fila for vazia
        // Peek -> retorna nulo
        // Element -> Lança uma excessão
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        // Poll e Remove -> obter o próximo elemento da fila e remove.

        // Retorna o primeiro elemento da fila e remove.
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // lança uma excessão
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // fila.size()
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...)
    }
}
