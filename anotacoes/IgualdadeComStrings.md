# Igualdade com Strings

## Para comparar Strings em java usamos o .equals() e não o ==

```java
System.out.println("2" == "2"); // true

String s1 = new String("2");
System.out.println("2" == s1); // false
System.out.println("2".equals(s1)); // true

Scanner entrada = new Scanner(System.in);

String s2 = entrada.next();
System.out.println("2" == s2.trim()); // false
System.out.println("2".equals(s2.trim())); // true

entrada.close();
```