package Relogio;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Relogio r = new Relogio();
        r.ajusteData(12, 6);
        r.ajusteHora(30, 2, 40);
        r.passarTempo(900000);
        r.exibeInfomacoes();
    }
}
