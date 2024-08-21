package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.12312312312312323; // explícita (CAST)

        int c = 4;
        byte d = (byte) c; // explícita (CAST)
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; // explícita (CAST)
        System.out.println(f);
    }
}
