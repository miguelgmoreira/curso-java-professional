package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 30;
    }

    @Override
    public void ligarTurbo() {
        delta = 55;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }

    //    @Override
//    void acelerar() {
//        this.velocidadeAtual += 30;
//    }
}
