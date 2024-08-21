package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos tem na turma ? ");
        int numeroDeAlunos = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Quantas notas tem cada aluno ? ");
        int quantidadeDeNotasPorAluno = entrada.nextInt();
        entrada.nextLine();

        double[][] notasDaTurma = new double[numeroDeAlunos][quantidadeDeNotasPorAluno];

        for(int i = 0; i < notasDaTurma.length; i++) {
            for(int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Digite a %dª nota do aluno %d: ", j + 1, i + 1);
                notasDaTurma[i][j] = entrada.nextDouble();
                entrada.nextLine();
            }
        }

        for(double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
    }

}
