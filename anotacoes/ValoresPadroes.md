# Valores padrões

### Para variáveis definidas diretamente no corpo da classe e não em métodos, os valores padrões são:

```java
// byte, short, int, long -> 0
// float, double -> 0.0
// boolean -> false
// char -> '\u000'
// Objetos (Todo o resto) -> null
// String (é um objeto) -> null
```

### Já variáveis locais e constantes não são inicializadas por padrão!

## Obs: Quando for uma constante ela ter seu valor definido na inicialização ou no máximo até o contrutor ter sido chamado (dentro do contrutor)