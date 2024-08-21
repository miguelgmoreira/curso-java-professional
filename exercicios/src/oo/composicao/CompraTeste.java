package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "Cleber";
        compra.adicionarItem("Caneta", 20, 7.45);
        compra.adicionarItem(new Item("Borracha", 12, 3.89));
        compra.adicionarItem(new Item("Caderno", 3, 18.79));

        System.out.println(compra.itens.size());
        System.out.println("Valor total R$" + compra.obterValorTotal());
    }
}
