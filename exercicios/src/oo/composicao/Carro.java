package oo.composicao;

import java.util.Arrays;

public class Carro {

    Motor motor = new Motor();
    Porta[] portas = new Porta[4];

    Carro() {
        for (int i = 0; i < portas.length; i++) {
            portas[i] = new Porta();
        }
    }

    void acelerar() {
        boolean isAgumaPortaAberta = Arrays.stream(portas).anyMatch(porta -> porta.aberta);

        if (isAgumaPortaAberta) {
            System.out.println("Para acelerar, primeiro feche as portas.");
            return;
        }

        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao >= 0.4) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
