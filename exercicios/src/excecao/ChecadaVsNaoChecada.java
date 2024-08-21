package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Exceção checada ou verificada (Força o tratamento ou a declaração explícita)
    static void geraErro2() throws Exception {
            throw new Exception("Ocorreu um erro bem legal #02!");
    }

    // Exceção NÃO checada ou NÃO verificada (Não obriga o tratamento do erro)
    static void geraErro1() {
        throw  new RuntimeException("Ocorreu um erro bem legal #01!");
    }

}
