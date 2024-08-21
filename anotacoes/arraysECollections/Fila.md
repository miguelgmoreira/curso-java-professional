# Fila

## Adicionar elementos na fila
### obs: Se diferem no comportamento quando a fila esta cheia!

### Offer -> Caso não consiga adicionar ele irá retornar falso.
```java
fila.offer("Bia");
```

### Add -> Lança uma excessão caso não consiga adicionar.
```java
fila.add("Ana");
```

## Obter o próximo elemento da fila (sem remover)
### obs: Se diferem no comportamento quando a fila for vazia.

### Peek -> retorna nulo
```java
fila.peek();
```

### Element -> lança uma excessão
```java
fila.element();
```

## Obter o próximo elemento da fila (removendo);

### Poll -> retorna false
```java
fila.poll();
```

### remove -> lança uma excessão
```java
fila.remove();
```

### Exemplo:
```java
 public static void main(String[] args) {

    Queue<String> fila = new LinkedList<>();
    
    fila.add("Ana");
    fila.offer("Bia");
    fila.add("Paulo");
    fila.offer("Julia");
    fila.add("Isabela");
    fila.offer("Manu");
    
    System.out.println(fila.peek());
    System.out.println(fila.peek());
    System.out.println(fila.element());
    System.out.println(fila.element());
    
    // Retorna o primeiro elemento da fila e remove.
    System.out.println(fila.poll()); // retorna false
    System.out.println(fila.remove()); // lança uma excessão
    System.out.println(fila.poll());
    System.out.println(fila.poll());

    // fila.size()
    // fila.clear();
    // fila.isEmpty();
    // fila.contains(...)
}
```

