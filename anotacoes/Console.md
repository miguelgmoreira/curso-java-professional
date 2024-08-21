# Console

### Para leitura de dados vindos do console utilizamos o Scanner do java.util

### Após finalizar a leitura é necessário dar o .close() no Scanner.

```java
Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close();
```

### O Scanner.nextInt() deixa um \n gerado após o enter para trás, para que os nextLine() que vierem depois possam funcionar é necessário pegar esse \n que ficou para trás, para isso usamos um nextLine() adicioanl após o \n.

```java
Scanner teclado = new Scanner(System.in);
 
    System.out.println("Qual a sua idade?");
    int idade = teclado.nextInt();
    teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
    System.out.println("Qual o seu nome?");
    String nome = teclado.nextLine();
    System.out.println("Qual o seu sobrenome?");
    String sobrenome = teclado.nextLine();
 
    teclado.close();
```