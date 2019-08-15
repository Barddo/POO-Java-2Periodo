package Relogio;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Relogio r = new Relogio();
        r.ajusteHora(24, 61, 10);
        r.ajusteData(20, 12);

        r.exibeInfomacoes();
    }
}
