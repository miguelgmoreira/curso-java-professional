package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        final double FATOR = 5 / 9.0;
        final int AJUSTE = 32;
        int valorEmFarenheit = 86;
        double valorEmCelsius = (valorEmFarenheit - AJUSTE) * FATOR;

        System.out.println("Valor em celsius: " + valorEmCelsius);
    }

}
