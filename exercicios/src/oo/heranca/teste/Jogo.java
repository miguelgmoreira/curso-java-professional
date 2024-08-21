package heranca.teste;


import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Monstro jogador1 = new Monstro();
        jogador1.x = 10;
        jogador1.y = 10;

        Heroi jogador2 = new Heroi(10, 11);

        System.out.println("Monstro tem ==> " + jogador1.obterVida());
        System.out.println("Herói tem ==> " + jogador2.obterVida());

        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);

        System.out.println("Monstro tem ==> " + jogador1.obterVida());
        System.out.println("Herói tem ==> " + jogador2.obterVida());
    }
}
