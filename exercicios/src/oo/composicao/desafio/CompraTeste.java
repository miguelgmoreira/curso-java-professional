package oo.composicao.desafio;

import java.util.ArrayList;

public class CompraTeste {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Miguel");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 998.90), 1);

        Cliente cliente = new Cliente("Maria julia");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.printf("O total gasto foi de R$%.2f", cliente.obterTotalGasto());
    }
}
