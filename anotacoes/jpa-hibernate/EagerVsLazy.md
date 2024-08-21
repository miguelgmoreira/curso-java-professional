### No JPA, a estratégia de carregamento (fetching) determina como e quando as associações entre entidades são carregadas do banco de dados. Existem duas estratégias principais: FetchType.EAGER e FetchType.LAZY.

## FetchType.LAZY
### Comportamento Padrão:

#### É o comportamento padrão para os relacionamentos @OneToMany, @ManyToMany, e @ElementCollection.
#### A associação é carregada de forma preguiçosa, ou seja, os dados associados não são carregados imediatamente quando a entidade pai é carregada.
Somente quando você acessa explicitamente a propriedade associada (por exemplo, getPedidos()), a consulta ao banco de dados é executada para buscar os dados relacionados.
Quando Ocorre:

### Use FetchType.LAZY quando você não precisa dos dados relacionados imediatamente e deseja otimizar a performance do sistema carregando-os apenas quando necessário.
#### Exemplo:

```java
@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
private List<Pedido> pedidos;
```
### Neste exemplo, a lista de Pedido associada ao Cliente será carregada apenas quando a propriedade pedidos for acessada explicitamente.

## FetchType.EAGER
### Comportamento Padrão:

#### É o comportamento padrão para os relacionamentos @ManyToOne e @OneToOne.
#### A associação é carregada de forma imediata junto com a entidade pai. Ou seja, quando a entidade pai é carregada, todas as associações marcadas como EAGER são carregadas automaticamente em uma única consulta ao banco de dados.
### Quando Ocorre:

#### Use FetchType.EAGER quando você precisa dos dados relacionados imediatamente, e não quer ou não pode permitir múltiplas consultas ao banco de dados posteriormente.
Cuidado com o N+1 select problem, onde múltiplas consultas são feitas para buscar dados relacionados, o que pode impactar negativamente a performance.
Exemplo:

```java
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "cliente_id")
private Cliente cliente;
```
### Neste exemplo, o Cliente associado a um Pedido será carregado imediatamente quando o Pedido for carregado.

### Resumo:
- #### FetchType.LAZY: Carregamento preguiçoso. Os dados relacionados são carregados somente quando acessados explicitamente. É o padrão para coleções (@OneToMany, @ManyToMany).
- #### FetchType.EAGER: Carregamento imediato. Os dados relacionados são carregados junto com a entidade principal, em uma única consulta. É o padrão para @ManyToOne e @OneToOne.
### Quando Usar Cada Um:
#### FetchType.LAZY: Utilize quando as associações não são necessárias de imediato ou em todas as operações. Isso ajuda a melhorar a performance, especialmente em entidades com muitas associações.
#### FetchType.EAGER: Utilize quando você sempre precisa dos dados relacionados junto com a entidade principal, e quando a quantidade de dados não é excessiva para ser carregada de uma vez.