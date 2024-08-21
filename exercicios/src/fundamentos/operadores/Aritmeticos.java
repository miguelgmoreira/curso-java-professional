package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {

        System.out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(y / 2);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        // A divisão entre um int e um double é um double
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);

        System.out.println(a % b);
        System.out.println(8 % 3);
    }
}
