package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        /*
        Tipos numéricos inteiros - se diferenciam em capacidade de armazenamento

        byte:  a otimização é minima e é raramente usado

        short: a otimização é minima e é raramente usado

        int: melhor escolha para tratar numero inteiro que não seja muito grandes

        long: lida com número bem maiores

        Tipos com ponto flutuantes

        float:

        double:

        Outros tipos

        char: Um caractere delimitado por aspas simples 'a'

        boolean: true/false

        Conversão entre tipos

        a conversão quando feito de um tipo menor para um tipo maior é tranquilo, agora o contrário dará um erro

         */

        // Informações do funcionário

        //Tipos numéricos inteiros

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;

        long pontosAcumulados = 3_134_845_223L; // caso seja um número que ultrapassa a capacidade dos inteiros é necessario adicionar o L ao final;

        // Tipos numéricos reais

        float salario = 11_445.44F; // float tem a metade do double, logo é necessário colocar o F no final, caso contrario tentará armazenar um double;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'a'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha => " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }


}
