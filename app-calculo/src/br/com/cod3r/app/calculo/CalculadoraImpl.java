package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;


public class CalculadoraImpl implements Calculadora {

    private String id = "ABC";

   private OperacoesAritmeticas opAtirmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAtirmeticas.soma(nums);
    }
}
