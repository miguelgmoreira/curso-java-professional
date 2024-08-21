# Tipos primitivos em Java

## Tipos numéricos inteiros

- _Byte_: A otimização é minima e é raramente usado (1 byte).
- _Short_: A otimização é minima e é raramente usado (2 bytes).
- _Int_: Melhor escolha para tratar numeros inteiros que não sejam muito grandes (4 bytes).
- _Long_: Lida com número bem maiores (8 bytes).

## Tipos com ponto flutuantes

- _Float_: Armazena até 4 bytes.
- _Double_: Armazena até 8 bytes.

### Qualquer literal inteiro por padrão é do tipo _INT_ e qualquer literar com ponto flutuante é do tipo _DOUBLE_, logo por mais que tenha sido declarado no tipo da variável, se ultrapassar o limite dos tipos padrões ou se o padrão não couber em um menor o tipo deve estar explicito no final.

## Outros tipos

- _Char_: Delimitado por aspas simples 'a'.
- _Boolean_: Em java boolean é sempre _TRUE_ ou _FALSE_.

### Obs: String não é um valor primitivo

### Ao usar var e não passar o tipo, o tipo é inferido

```java
var b = 4.5; // Tipo double

var c = "Texto"; // Tipo String

c = "Outro texto";

// c = 4.5; // Não pode ser convertido para outro tipo

double d; // Variável foi declarada
d = 123.65; // Variável foi inicializada

// var e;
// e = 10;   Se usado var ao invés do tipo um valor deve ser passado no declaração
// O Java infere o tipo da variavel no momento da declaração!
```