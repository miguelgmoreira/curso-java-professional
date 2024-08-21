package arrays.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas o aluno terá ? ");
        int numeroDeNotas = entrada.nextInt();
        entrada.nextLine();

        double[] notas = new double[numeroDeNotas];

        for(int i = 0; i < numeroDeNotas; i++) {
            System.out.printf("Digite a nota numero %d: ", i + 1);
            double nota = entrada.nextDouble();
            notas[i] = nota;
        }

        double total = 0;
        for(double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.printf("As notas foram %s, e a média foi %.2f: ", Arrays.toString(notas), media);
    }
}
