package arrays;

import java.util.Arrays;

public class ExercicioForeach {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        double totalAlunoA = 0;
        for (double nota : notasAlunoA) {
            totalAlunoA += nota;
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notaAlunoB = {6.9, 8.9, notaArmazenada, 10};

        double totalAlunoB = 0;
        for (double nota : notaAlunoB) {
            totalAlunoB+= nota;
        }

        System.out.println(totalAlunoB / notaAlunoB.length);
    }
}
