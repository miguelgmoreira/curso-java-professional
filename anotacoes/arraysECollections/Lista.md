# Lista

### Por ser indexada podemos buscar por índice

```java
lista.get(3);
```

### Podemos remover tanto por índice como por comparação dos objetos, usa o equal e o hashcode

```java
lista.remove(1);
lista.remove(new Usuario("Cleber"));
```

### Exemplo:
```java
 public static void main(String[] args) {
    List<Usuario> lista = new ArrayList<>();

    Usuario u1 = new Usuario("Miguel");

    lista.add(u1);
    lista.add(new Usuario("Carlos"));
    lista.add(new Usuario("Carol"));
    lista.add(new Usuario("Claudio"));
    lista.add(new Usuario("Cleber"));
    lista.add(new Usuario("Cleber"));

    System.out.println(lista.get(3)); // Acessar pelo índice

    lista.remove(1);
    lista.remove(new Usuario("Cleber"));

    System.out.println(lista.contains(new Usuario("Carol")));

    for (Usuario usuario : lista) {
        System.out.println(usuario.nome);
    }
}
```