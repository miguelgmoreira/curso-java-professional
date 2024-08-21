package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        // Utilizando var o java tipa por inferência
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;

        System.out.println(maisUmaFrase);


        // %s --> strings
        // %d --> inteiros
        // %f --> ponto flutuante, pode passar quantas casa decimais quer representar ex: %.2f
        // %n --> quebra a linha (\n também serve)
        System.out.printf("Nome: %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("\nNome: %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 8));
    }
}
