package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        double numA =  Math.pow(6 * (3 + 2), 2);
        double denA = 2 * 3;
        double formula1 = numA / denA;

        double numB = Math.pow((1 - 5) * (2 - 7) / 2, 2);
        double formula2 = numB;

        double resultadoFinal = Math.pow(formula1 - formula2, 3) / Math.pow(10, 3);

        System.out.println((int) resultadoFinal);
    }
}
