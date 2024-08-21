package modelo.heranca.meudesafio;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "programadores")
public class Programador extends Pessoa {

    @ManyToMany
    @JoinTable(
            name = "programadores_linguagens",
            joinColumns = @JoinColumn(name = "programador_id"),
            inverseJoinColumns = @JoinColumn(name = "linguagem_id")
    )
    private List<Linguagem> linguagens;

    public Programador() {
    }

    public Programador(String nome, double altura) {
        super(nome, altura);
    }

    public List<Linguagem> getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(List<Linguagem> linguagens) {
        this.linguagens = linguagens;
    }
}
