package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // Adiciona caso não exista e substitui caso já exista
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Miguel");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // retorna as chaves
        System.out.println(usuarios.values()); // retorna os valores
        System.out.println(usuarios.entrySet()); // Retorna as chaves e os valores

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(20)); // Busca pela chave e não pelo index no Map
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Gui"));

        for(int chave : usuarios.keySet()) { // Percorrer pela chave
            System.out.println(chave);
        }

        for(String valor : usuarios.values()) { // Percorrer pelo valor
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) { // Percorrer pelo par chave/valor
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
