package oo.heranca.teste;


import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Crv;
import oo.heranca.desafio.Ferrari;

public class Corrida {

    public static void main(String[] args) {
        Carro c1 = new Civic();
        Carro c2 = new Crv();
        Ferrari c3 = new Ferrari();

        System.out.println("Civic ==> " + c1);
        System.out.println("Crv ==> " + c2);
        System.out.println("Ferrari ==> " + c3);

        c3.ligarTurbo();

        c1.acelerar();
        c2.acelerar();
        c3.acelerar();

        c3.desligarTurbo();

        System.out.println("Civic ==> " + c1);
        System.out.println("Crv ==> " + c2);
        System.out.println("Ferrari ==> " + c3);

        c1.frear();
        c2.frear();
        c3.frear();

        System.out.println("Civic ==> " + c1);
        System.out.println("Crv ==> " + c2);
        System.out.println("Ferrari ==> " + c3);
    }
}
