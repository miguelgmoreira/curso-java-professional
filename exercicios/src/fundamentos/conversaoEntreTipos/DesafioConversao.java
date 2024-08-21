package fundamentos.conversaoEntreTipos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário 1: ");
        String s1 = entrada.nextLine();
        System.out.print("Digite o salário 2: ");
        String s2 = entrada.nextLine();
        System.out.print("Digite o salário 3: ");
        String s3 = entrada.nextLine();


        s1 = s1.replace(",", ".");
        s2 = s2.replace(",", ".");
        s3 = s3.replace(",", ".");

        double salario1 = Double.parseDouble(s1);
        double salario2 = Double.parseDouble(s2);
        double salario3 = Double.parseDouble(s3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.printf("A média dos salários é %.2f", media);

        entrada.close();
    }
}
