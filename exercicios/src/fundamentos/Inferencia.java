package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        // Caso não passado o tipo (usando var), o tipo é inferido.
        // Independente de passar ou não o tipo java aida é estritamente tipada, e não dará para alterar os tipos

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5;

        double d; // Variável foi declarada
        d = 123.65; // Variável foi inicializada
        System.out.println(d); // usada!

        // var e;
        // e = 10;   Se usado var ao invés do tipo um valor deve ser passado no declaração
        // O Java infere o tipo da variavel no momento da declaração!

    }

}
