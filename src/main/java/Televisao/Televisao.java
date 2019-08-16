package Televisao;

import java.io.Console;

/**
 * Televisao
 */
public class Televisao {

    private int volume = 20;
    private int canal = 3;
    private boolean estado = false;

    public Televisao() throws InterruptedException {
        this.ligar();
    }

    public void interpreta() throws InterruptedException {
        System.out.flush();
        int opcao = validaEntrada();

        switch (opcao) {
        case 0:
            System.exit(0);
            break;
        case 1:
            this.ligar();
            break;
        case 2:
            this.desligar();
            break;
        case 3:
            this.trocaCanal();
            break;
        case 4:
            this.exibeCanal();
            break;
        case 5:
            this.aumentaVolume();
            break;
        case 6:
            this.diminuiVolume();
            break;
        default:
            break;
        }
    }

    private int validaEntrada() {
        String operacao = System.console().readLine();
        int numOperador = 0;
        try {
            numOperador = Integer.parseInt(operacao);
            if (numOperador > 6) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            operacao = System.console().readLine();
        }
        return numOperador;
    }

    public void ligar() throws InterruptedException {
        if (!this.estado) {
            System.out.println("Ligando...");
            System.out.wait(2000);
            this.estado = true;
        } else {
            System.out.println("Televisão já ligada");
        }
    }

    public void desligar() throws InterruptedException {
        if (this.estado) {
            System.out.println("Desligando...");
            System.out.wait(2000);
            this.estado = false;
            System.out.println("Televisão desligada");
        } else {
            System.out.println("Televisão já desligada");
        }
    }

    public void aumentaVolume() {
        this.volume += validaValor("Digite o volume: ", 0, 100);
    }

    public void diminuiVolume() {
        this.volume -= validaValor("Digite o volume: ", 0, 100);
    }

    public void trocaCanal() {
        this.canal = validaValor("Digite o canal: ", 2, 85);
    }

    public void exibeCanal() {
        System.out.println("Canal " + this.canal);
    }

    private int validaValor(String textoSaida, int menor, int maior) {
        System.out.println(textoSaida);
        String operacao = System.console().readLine();

        int numero = 0;
        try {
            numero = Integer.parseInt(operacao);
            if (numero < menor || numero > maior) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            operacao = System.console().readLine();
        }
        return numero;
    }

}