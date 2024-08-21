package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Produto produto1 = new Produto("Ipad", 3235.89, 0.50);

        Function<Produto, Double> precoReal = p -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> impostoMunicipal =
                valor -> valor >= 3000 ? valor * 1.085 : valor;

        UnaryOperator<Double> frete =
                valor -> valor >= 3000 ? valor + 100 : valor + 50;

        UnaryOperator<Double> arredondar = valor -> {
            String stringFormatada = String.format("%.2f", valor);
            return Double.parseDouble(stringFormatada);
        };

        Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");

        String valorFinalFormatado = precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(produto1);

        System.out.println(valorFinalFormatado);
    }
}
