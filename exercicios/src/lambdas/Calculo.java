package lambdas;

// Força a interface a ter apenas um método, já que é uma interface funcional
@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String muitoLegal() {
        return "muito legal";
    }
}
