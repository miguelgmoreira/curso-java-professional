package teste.consulta;

import infra.DAO;
import modelo.consulta.NotaFilme;

//<sql-result-set-mapping name="NotaFilmeMap">
//        <constructor-result target-class="modelo.consulta.NotaFilme">
//            <column name="media" class="java.lang.Double"/>
//        </constructor-result>
//    </sql-result-set-mapping>

// O intuito de se fazer isso é mapear a coluna com o nome media da resposta da consulta ao db e jogar o resultado no construtor para então converter para o objeto

public class ObterMediaDosFilmes {

    public static void main(String[] args) {

        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
