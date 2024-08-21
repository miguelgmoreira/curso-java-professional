package classe;

public class DataTeste {

    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(6, 5, 2005);
        System.out.println(d1.obterDataFormata());
    }
}
