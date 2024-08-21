# Conversão entre tipos

- A conversão quando feito de um tipo MENOR para um tipo MAIOR é tranquilo, agora o contrário deverá ser explicito (CAST).
- O java não analisa o valor e sim o tipo.

# Exemplos

## Tipos numéricos inteiros
```java
byte anosDeEmpresa = 23;
short numeroDeVoos = 542;
int id = 56789;

// Caso seja um número que ultrapassa a capacidade dos inteiros é necessario adicionar o L ao final;
long pontosAcumulados = 3_134_845_223L;
```

## Tipos numéricos reais

```java
// float tem a metade do double, logo é necessário colocar o F no final, caso contrario tentará armazenar um double;
float salario = 11_445.44F;
double vendasAcumuladas = 2_991_797_103.01;
```

## Tipo booleano
```java
boolean estaDeFerias = true;
```

## Tipo caractere
```java
char status = 'a';
```

# Casting


## Quando a conversão for de um tipo maior para um tipo menor, ou seja, quando há perda de informação é necessário deixar explicito (CAST)

```java
double a = 1; // implícita
System.out.println(a);

float b = (float) 1.12312312312312323; // explícita (CAST)

int c = 4;
byte d = (byte) c; // explícita (CAST)
System.out.println(d);

double e = 1.999999;

int h = e;
int f = (int) e; // explícita (CAST)
System.out.println(f);
```

### O casting deve ser evitado.

# Conversão Numero para String

```java
Integer num1 = 10000;
System.out.println(num1.toString().length());

int num2 = 10000;
System.out.println(Integer.toString(num2).length());

// System.out.println(Double.toString());// System.out.println(Long.toString());
```

# Conversão String para Numero

```java
String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
String valor2 = JOptionPane.showInputDialog("Digite o segundo número");

System.out.println(valor1 + valor2);

double numero1 = Double.parseDouble(valor1);
double numero2 = Double.parseDouble(valor2);

double soma = numero1 + numero2;
System.out.printf("Soma é %.2f\n", soma);
System.out.printf("A média é %.2f\n", soma / 2);
```

