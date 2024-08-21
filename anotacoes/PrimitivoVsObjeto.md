# Primitivo vs Objeto

### Tudo em Java é objeto (Baseado em classes), menos os 8 tipos primitivos

## Wrappers

### São as versões orientada a objetos dos tipos primitivos.

### Para poder usar métodos com a notação ponto nos tipos primitivos como usamos no ts, que trata os tipos primitivos como objeto, é necessário wrappers, como por exemplo .toString().

### A sintaxe do tipo é a mesma só que com a primeira letra maiúscula, tirando int que é Integer.

```java
        // byte
        Byte b = 1;
        Short s = 1000;

//      Integer i = Integer.parseInt(entrada.next());
        Integer i = 10000; // int
        Long l = 1000000L;
        

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
```