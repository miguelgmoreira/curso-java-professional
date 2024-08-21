package modelo.heranca.meudesafio;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedreiros")
public class Pedreiro extends Pessoa {

    public Pedreiro() {
    }

    public Pedreiro(String nome, double altura) {
        super(nome, altura);
    }
}
