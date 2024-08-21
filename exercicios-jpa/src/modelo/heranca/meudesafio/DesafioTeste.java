package modelo.heranca.meudesafio;

import infra.DAO;

import java.util.Arrays;
import java.util.List;

public class DesafioTeste {

    public static void main(String[] args) {

        DAO<Linguagem> daoLinguagem = new DAO<>(Linguagem.class);
        DAO<Programador> daoProgramador = new DAO<>(Programador.class);
        List<Linguagem> linguagens = Arrays.asList(new Linguagem("Java"), new Linguagem("Javascript"), new Linguagem("Php"));

        daoLinguagem.abrirT();
        for(Linguagem linguagem : linguagens) {
            daoLinguagem.incluir(linguagem);
        }
        daoLinguagem.fecharT();

        Linguagem java = daoLinguagem.obterPorNome("Java");
        Linguagem javascript = daoLinguagem.obterPorNome("Javascript");

        Pedreiro pedreiro = new Pedreiro("Cleber", 178.0);

        daoProgramador.abrirT();
        Programador programador = new Programador("Miguel", 178);
        programador.setLinguagens(Arrays.asList(java, javascript));
        daoProgramador.incluir(programador).fecharT();

        System.out.println(pedreiro.getNome());

        daoProgramador.fechar();
        daoLinguagem.fechar();
    }
}
