package oo.composicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>(); // Para

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        for(Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }

        return null;
    }

    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(cursos, aluno.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cursos);
    }
}
