package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Miguel");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Carol"));
        lista.add(new Usuario("Claudio"));
        lista.add(new Usuario("Cleber"));
        lista.add(new Usuario("Cleber"));

        System.out.println(lista.get(3).toString()); // Acessar pelo índice

        lista.remove(1);
        lista.remove(new Usuario("Cleber"));

        System.out.println(lista.contains(new Usuario("Carol")));

        for (Usuario usuario : lista) {
            System.out.println(usuario.nome);
        }
    }
}
