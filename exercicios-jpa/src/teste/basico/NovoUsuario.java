package teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Leo", "leo@lanche.com.br");

        em.getTransaction().begin();
        em.persist(novoUsuario); // INSERT
        em.getTransaction().commit();

        System.out.println("O Id gerado foi: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
