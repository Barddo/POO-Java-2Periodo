package Relogio;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Relogio r = new Relogio();
        r.ajusteData(20, 12);
        r.ajusteHora(23, 61, 10);

        r.exibeInfomacoes();
    }
}
