package fundamentos;

public class SwitchCase {

    public static void main(String[] args) {

        String faixa = "preta";
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
                break;
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
                break;
            case "roxa":
                System.out.println("Sei o Heian Godan");
                break;
            case "verde":
                System.out.println("Sei o Heian Yodan");
                break;
            case "laranja":
                System.out.println("Sei o Heian Sondan");
                break;
            case "vermelha":
                System.out.println("Sei o Heian Sondan");
                break;
            case "amarela":
                System.out.println("Sei o Heian Sondan");
                break;
            default:
                System.out.println("Não sei de nada");
        }
    }
}
