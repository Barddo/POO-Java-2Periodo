package Televisao;

import java.io.Console;

/**
 * Televisao
 */
public class Televisao {

    private int volume = 20;
    private int canal = 3;

    public Televisao() throws InterruptedException {
        System.out.println("Ligando...");
        Console.class.wait(2000);
        this.ligar();
    }

    public void ligar() {
        System.out.println("Televisão ligada");
    }

    public void desligar() throws InterruptedException {
        System.out.println("Desligando...");
        Console.class.wait(2000);
        System.out.println("Televisão desligada");
    }

    public void aumentaVolume(int v) {
        this.volume += v;
    }

    public void diminuiVolume(int v) {
        this.volume -= v;
    }

    public void trocaCanal(int c) {
        this.canal = c;
    }

    public void exibeCanal() {
        System.out.println("Canal " + this.canal);
    }

}