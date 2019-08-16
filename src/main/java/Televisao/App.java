package Televisao;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        String escolha = "";
        System.out.println("Super Ultra Televisão 3000");
        Televisao tv = new Televisao();
    }

    public static void menu() {
        System.out.flush();
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Mudar o canal");
        System.out.println("4 - Exibir o canal atual");
        System.out.println("5 - Aumentar o volume");
        System.out.println("6 - Aumentar o volume");
        System.out.println("0 - Sair");
    }
}
