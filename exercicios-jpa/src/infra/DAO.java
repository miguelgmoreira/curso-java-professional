package infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        } catch (Exception e) {
            // logar -> log4j
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> teste() {
        return this;
    }

    public DAO<E> abrirT() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharT() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade) {
        return this.abrirT().incluir(entidade).fecharT();
    }

    public E obterPorId(Object id) {
        return em.find(classe, id);
    }

    public E obterPorNome(String nome) {
        return em.createQuery("SELECT n FROM " + classe.getSimpleName() + " n WHERE n.nome = :nome", classe)
                .setParameter("nome", nome)
                .getSingleResult();
    }

    public List<E> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int qtde, int deslocamento) {
        if(classe == null) {
            throw new UnsupportedOperationException("Classe nula.");
        }

        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qtde);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }

    public DAO<E> deletar(E entidade) {
        em.remove(entidade);
        return this;
    }

    public DAO<E> deletarAtomicoPorId(E entidade, Long id) {
        E entidadeEcontrada = this.obterPorId(id);
        abrirT().deletar(entidadeEcontrada).fecharT();
        return this;
    }

    public List<E> consultar(String nomeConsulta, Object... params) {
        TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);

        for (int i = 0; i < params.length; i += 2) {
            query.setParameter(params[i].toString(), params[i + 1]);
        }

        return query.getResultList();
    }

    public E consultarUm(String nomeConsulta, Object... params) {
        List<E> lista = consultar(nomeConsulta, params);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public void fechar() {
        em.close();
    }
}
