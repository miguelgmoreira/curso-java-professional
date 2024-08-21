# Equals e Hashcode

### Quando usamos == para objetos estamos comparando o endereço de memória

```java
Produto p1 = new Produto("caneta");
Produto p2 = new Produto("caneta");

p1 == p2; // Falso --> 0x123 == 0x234
```

### Já para os tipos primitivos a comparação por == compara os valores diretamente

```java
2 == 2 // Verdadeiro
```

## Equals

## TODO objeto em Java possui o método .equals().

### Se não for feito nada o comportamento do .equals é exatamente igual ao ==.

```java
p1.equals(p2); // Se não for feito nada = Falso
```

### Pode ser uma comparação lenta, principalmente se muitos objetos de um conjunto estão sendo comparados

## HashCode

### Retorna um inteiro, ao contrário do hashcode que retorna um boolean

### Elimina grande parte dos objetos de um conjunto que não possuem o hashcode especificado igual, de forma bem mais rápida, para só então fazer o .equals().

