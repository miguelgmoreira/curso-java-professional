package colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    public String toString(){
        return "Meu nome é " + this.nome + ".";
    }

    Usuario(String nome) {
        this.nome = nome;
    }
}
