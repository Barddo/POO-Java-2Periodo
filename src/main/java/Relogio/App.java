package Relogio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * main Relogio
 */
public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        Relogio r = new Relogio();
        boolean loop = true;
        while (loop) {
            menu();
            r.interpreta();
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Digite algo para prosseguir");
            readLine();
        }
    }

    public static String readLine() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        return bufferedReader.readLine();
    }

    public static void menu() {
        System.out.print("\033\143");
        System.out.println("Super Ultra Relogio 3000");
        System.out.println("0 - Sair");
        System.out.println("1 - Ajuste Hora");
        System.out.println("2 - Ajuste Data");
        System.out.println("3 - passar tempo ");
        System.out.println("4 - Exibir data e hora atual");
        System.out.println("5 - Reiniciar");
        System.out.println("Digite a opção desejada");
    }

}
