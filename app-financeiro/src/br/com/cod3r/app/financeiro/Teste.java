package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.Calculadora;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                        .findFirst()
                        .get();
        System.out.println(calc.soma(2, 3, 4));

//        OperacoesAritmeticas op = new OperacoesAritmeticas();
//        System.out.println(op.soma(4, 5, 6));

        // Com reflection é possível alterar a visibilidade de atributos private com a palavra reservada open/opens...to
//        Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
//        fieldId.setAccessible(true);
//        try {
//            fieldId.set(calc, "def");
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
    }
}
