# Valor vs Referancia

## Em uma atribuição por valor dependendo do tipo do atributo o comportamento é diferente

### Tipos primitivos:

```java
double a = 2;
double b = a; // atribuição por valor (Tipo primitivo)
```

### Nesse caso é feito uma cópia do valor, criando um novo espaço em memória indepenedente.

### Objetos:

```java
Data d1 = new Data(1, 6, 2022);
Data d2 = d1; // atribuição por referência (Objeto)
```

### Nesse caso é feito um apontamento para um referência desse valor, de forma que alterar um objeto altera todos os outros que também apontam para a mesma referência em memória.

## A mesma coisa acontece quando passados como parâmetro para métodos:

```java
// Altera diretamente a referência, impactando diretamento no objeto;
static void voltarDataParaValorPadrao(Data d) {
    d.dia = 1;
    d.mes = 1;
    d.ano = 1970;
}

// Cria uma referência nova em memória completamente independente, não altera o valor da variável.
static void alterarPrimitivo(int a) {
    a++;
}
```