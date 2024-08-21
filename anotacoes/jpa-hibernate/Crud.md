### Toda ação que gera um impacto no db precisa estar em um contexto transacional

## CREATE

### Para inserção é necessário estar no contexto de uma transação

```java
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
```

## GET

### Não precisa estar no contexto de uma transação!

### Para buscar um usuário

```java
    public static void main(String[] args) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    EntityManager em = emf.createEntityManager();

    Usuario usuario = em.find(Usuario.class, 1L); // GET
    System.out.println(usuario.getNome());

    em.close();
    emf.close();
}
```

### Para buscar uma lista de usuários:

#### O Entity Manager não fornece uma forma nativa de buscar todos os usuários!

```java
 public static void main(String[] args) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    EntityManager em = emf.createEntityManager();

    String jpql = "select u from Usuario u";
    TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
    query.setMaxResults(5); // Limita a quantidade máxima para 5 registros, evitando uma busca critica de todos os usuários

    List<Usuario> usuarios = query.getResultList();

    em.close();
    emf.close();
}
```

## UPDATE

### Dentro de um contexto de uma transação a entidade está em um estado gerenciado, o que significa que toda alteração feita no objeto é sincronizada com o DB. É possível desacoplar essa entidade do contexto da transação usando
_em.detach(entidade)_;

### Nesse exemplo por mais que o em.merge() não tenha sido chamada o update foi efetuado

```java
 public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    Usuario usuario = em.find(Usuario.class, 7L);
    usuario.setNome("Leonardo Alterado");
    
    // em.merge(usuario);

    em.getTransaction().commit();

    em.close();
    emf.close();
}
```

## DELETE

```java

public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    EntityManager em = emf.createEntityManager();

    Usuario usuario = em.find(Usuario.class, 5L);

    if (usuario != null) {
        em.getTransaction().begin();
        em.remove(usuario);
        em.getTransaction().commit();
    }

    em.close();
    emf.close();
```