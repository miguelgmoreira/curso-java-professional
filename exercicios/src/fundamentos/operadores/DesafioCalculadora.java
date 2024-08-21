package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero 1: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o numero 2: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o simbolo da operação:");
        String operacao = entrada.next();

        double resultado = operacao.equals("+") ? num1 + num2 : 0;
        resultado = operacao.equals("-") ? num1 - num2 : resultado;
        resultado = operacao.equals("/") ? num1 / num2 : resultado;
        resultado = operacao.equals("*") ? num1 * num2 : resultado;
        resultado = operacao.equals("%") ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f\n", num1, operacao, num2, resultado);
        System.out.println(resultado);
        entrada.close();
    }
}
