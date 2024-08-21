# JPA (Java Persistence Api)

- ### é uma especificação da plataforma Java que define um padrão para mapeamento objeto-relacional (ORM) e gerenciamento de dados persistentes em aplicações Java. Essencialmente, JPA facilita a interação entre a aplicação Java e um banco de dados relacional, permitindo que os desenvolvedores trabalhem com objetos Java em vez de escrever consultas SQL diretamente.

### Principais Conceitos do JPA:
- _Entidade (Entity)_: Uma classe Java que representa uma tabela no banco de dados. Cada instância da entidade representa uma linha na tabela.
- _Entity Manager_: Interface utilizada para gerenciar o ciclo de vida das entidades, como criação, leitura, atualização e remoção de objetos no banco de dados, converte os dados do objeto em comandos SQL (Já inclui uma conexão).
- _Entity Manager Factory_: Cria um entity manager, e como o Entity Manager encapsula a conexão pode ser necessário criar diferentes conexões baseadas em diferentes unidades de persistência (persistence.xml)
- _Unit of Work (Unidade de Persistência)_: Um conjunto de operações de banco de dados que são tratadas como uma única unidade de trabalho.
- _JPQL (Java Persistence Query Language)_: Uma linguagem de consulta orientada a objetos similar ao SQL, mas que opera com objetos e atributos em vez de tabelas e colunas.

### Para cada modelo, ou seja para cada entidade da aplicação que for mapeada com uma entidade no DB é necessário declarar a class no arquivo persistence.xml

### Modelo básico de arquivo persistence.xml

- Unidades de persistência: Guardam os dados de uma determinada conexão
```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2"
             xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence">
    <persistence-unit name="exercicios-jpa">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>

        <class>modelo.basico.Usuario</class>

        <properties>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/curso_java"/>
            <property name="javax.persistence.jdbc.user" value="root"/>
            <property name="javax.persistence.jdbc.password" value="teste123"/>

            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL57Dialect"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.format_sql" value="true"/>
            <property name="hibernate.hbm2ddl.auto" value="update"/>
        </properties>
    </persistence-unit>
</persistence>
```

### Annotations do JPA
```java
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity // Diz que a classe é uma entidade no DB e logo terá uma tabela de mesmo nome.
@Id // Diz que um atributo é a PK.
@Transient // Diz que um atributo não tem uma correspondência com uma coluna do DB.
@GeneratedValue(strategy = GenerationType.IDENTITY) // Diz se o valor é gerado automaticamente e pode dizer a estratégia de geração.

@OneToOne
@OneToMany -- @ManyToOne
List
@ManyToMany

```

## Hibernate

- ### Hibernate é uma framework de ORM (Object-Relational Mapping) para Java que implementa a especificação JPA, mas que também oferece funcionalidades adicionais além do que a JPA define.

### Funcionalidades do Hibernate:
- _Mapeamento Automático_: O Hibernate automatiza o mapeamento de classes Java para tabelas de banco de dados e de tipos de dados Java para tipos SQL.
- _Cache de Primeiro e Segundo Nível_: O Hibernate oferece caching de dados para reduzir as chamadas ao banco de dados.
- _Lazy Loading e Eager Loading_: Controla quando as associações de entidades (como relações um-para-muitos) são carregadas do banco de dados.
- _HQL (Hibernate Query Language)_: Uma extensão do JPQL, com suporte a funções específicas do Hibernate.

## Especificação vs. Implementação:

- ### JPA é uma especificação; define um conjunto de interfaces e padrões que precisam ser implementados. Não é uma ferramenta ou framework em si.

- ### Hibernate é uma framework que implementa a especificação JPA, oferecendo uma implementação concreta das interfaces definidas pela JPA. Além disso, o Hibernate também fornece funcionalidades que vão além da JPA.