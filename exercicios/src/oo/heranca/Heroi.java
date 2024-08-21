package oo.heranca;

public class Heroi extends Jogador{

    // Por padrão uma classe tem um contrutor padrão, que chama o construtor padrão da classe pai.
    // Se não estiver definido você precisa explicitamente definir o contrutor e dizer o parâmetros necessários.

    public Heroi(int x, int y) {
        super(x, y);
    }

    public boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
