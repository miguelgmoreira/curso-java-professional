# Classe vs Instância

## Classe

### Atributos e métodos que pertencem a classe são inicializados com static

```java
static final double pi = 3.1415;
```

### Devem ser acessados chamando o nome da classe diretamente

```java
public class AreaCirc {

    double raio;
    static final double pi = 3.1415;
    
}

public class AreaCircTeste {
    // Fora de um método só é possível inicializar valores
    double piValue = AreaCirc.pi;

    public static void main(String[] args) {
        System.out.println(AreaCirc.pi);
    }
} 
```

### Métodos static não podem referenciar os atributos de instância, apenas o atributos e métodos da classe

```java
public class AreaCirc {

    double raio;
    static final double pi = 3.1415;

    AreaCirc(double raio) {
        this.raio = raio;
    }
    
    static void teste() {
        System.out.println(pi); // Correto pois pi também é um atributo da classe
        System.out.println(this.raio); // Erro pois this não pode ser chamado em um método da classe
    }
}
```

## Instância

### Atributos e métodos que pertencem a instância não possuem static

```java
public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
        //  dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970);
    }

    ;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    ;

    String obterDataFormata() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    ;
}

public class DataTeste {

    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(6, 5, 2005);
        System.out.println(d1.obterDataFormata());
    }
}

```

