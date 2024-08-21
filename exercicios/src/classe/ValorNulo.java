package classe;

public class ValorNulo {

    public static void main(String[] args) {

        // Tentar acessar algum atributo ou método de algo nulo gerará um erro de NullPointerException (runtime error)

        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null;

        if(d1 != null) {
            d1.mes = 4;
            System.out.println(d1.obterDataFormata());
        }

        String s2 = Math.random() > 0.5 ? "Opa" : null;

        if(s2 != null) {
            System.out.println(s2.concat("????"));
        }

    }
}
