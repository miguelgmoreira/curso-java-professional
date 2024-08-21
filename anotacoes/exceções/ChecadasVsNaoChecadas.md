## Escolher entre usar exceções checadas e não checadas é uma decisão importante no design de software, especialmente em linguagens como Java que diferenciam entre esses dois tipos. Aqui estão alguns critérios e orientações para ajudar você a decidir:

## Exceções Checadas
## Características:

### São verificadas pelo compilador: O código deve lidar com essas exceções (usando try-catch) ou declará-las na assinatura do método (throws).
### Usadas para condições excepcionais esperadas e recuperáveis: Situações que podem ser previstas e das quais o código pode se recuperar.
## Quando usar:

#### Erro Recuperável: Quando a exceção representa um problema do qual o aplicativo pode se recuperar. Exemplo: falha ao abrir um arquivo porque ele não existe (o usuário pode fornecer um caminho de arquivo diferente).
### Usuário Final Pode Corrigir: Quando a ação que causa a exceção pode ser corrigida pelo usuário final ou por uma entrada diferente. Exemplo: entrada inválida de dados que pode ser solicitada novamente.
### Controle de Fluxo de Negócios: Em alguns casos de lógica de negócios onde a exceção faz parte do fluxo normal de operações. Exemplo: exceção de saldo insuficiente ao tentar realizar uma transação bancária.
## Exemplo:

```java
public void readFile(String filePath) throws IOException {
    FileInputStream fis = new FileInputStream(filePath);
    fis.close();
}
```

## Exceções Não Checadas
### Características:

### Não são verificadas pelo compilador: O código não é obrigado a lidar com essas exceções explicitamente.
### Usadas para condições excepcionais inesperadas e irrecuperáveis: Situações que não são esperadas e normalmente indicam erros de programação.
## Quando usar:

### Erro de Programação: Quando a exceção é causada por um erro de programação, como NullPointerException, ArrayIndexOutOfBoundsException, etc. Isso geralmente indica um bug que deve ser corrigido no código.
### Condições Irrecuperáveis: Quando a exceção representa uma condição da qual o aplicativo não pode se recuperar. Exemplo: falha de alocação de memória.
### Operações Críticas: Em situações onde a continuação da execução do programa não é segura ou possível. Exemplo: falha em um componente crítico do sistema.
### Exemplo:

```java
public void divide(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("Divisão por zero");
    }
    int result = a / b;
}
```

# Prós e Contras
## Exceções Checadas:

## Prós:
### Forçam o tratamento ou a declaração explícita, tornando o código mais robusto.
### Indicadas para erros que o programa pode razoavelmente esperar e lidar.
## Contras:
### Podem tornar o código mais verboso e complexo.
### Podem ser excessivas em APIs públicas, onde os usuários da API são forçados a lidar com exceções que podem não entender completamente.
### Exceções Não Checadas:

## Prós:
### Menos verbosidade no código, permitindo foco na lógica principal.
### Indicadas para erros inesperados e irrecuperáveis.
## Contras:
### Podem ser negligenciadas pelo desenvolvedor, levando a possíveis falhas de runtime não tratadas.
### Não informam o usuário da API sobre possíveis falhas, o que pode resultar em comportamento inesperado.
### Boas Práticas
### Documentação: Sempre documente as exceções que um método pode lançar, mesmo que sejam não checadas.
### Tratamento Adequado: Trate exceções checadas de maneira que permita a recuperação ou a notificação adequada ao usuário.
### Evitar Uso Excessivo de Exceções Checadas: Não use exceções checadas para controle de fluxo normal; reserve-as para condições excepcionais.
# Conclusão
## Use exceções checadas para situações recuperáveis onde o usuário ou o sistema pode tomar uma ação corretiva.
## Use exceções não checadas para erros de programação, situações inesperadas e irrecuperáveis.
## A escolha entre exceções checadas e não checadas deve ser baseada na natureza da exceção e no contexto de uso dentro do seu sistema.