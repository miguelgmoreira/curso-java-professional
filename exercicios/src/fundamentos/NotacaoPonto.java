package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        // As palavras reservadas do JAVA tem um highlight, dentre elas estão os tipos primitivos
        double a = 2.3;

        // String se escreve diferente pois não é um tipo primitivo
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "miguel".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Jorge")
                .toUpperCase()
                .concat("!!!");

        System.out.println(y);

        // Tipos primitivos não tem o operdador "."
        int z = 3;


    }

}
