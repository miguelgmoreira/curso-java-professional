package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        // Se diferenciam em caso não consiga adicionar um item a pilha
        livros.add("O Pequeno Príncipe"); // retorna false
        livros.push("O Hobbit"); // lança uma excessão.

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println();

        for(String livro : livros) {
            System.out.println(livro);
        }
        System.out.println();

        System.out.println(livros.pop()); // Também lança uma excessão
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        // System.out.println(livros.remove());

        // livros.size();
        // livros.clear();
        // livros.contains();
        // livros.isEmpty();

    }
}
