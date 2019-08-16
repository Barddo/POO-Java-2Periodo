package Televisao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * Televisao
 */
public class Televisao {

    public int volume = 20;
    private int canal = 3;
    public boolean estado = false;

    public Televisao() throws InterruptedException {
        this.ligar();
    }

    public void interpreta() throws InterruptedException {
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

    private void ligar() throws InterruptedException {
        if (this.estado == false) {
            System.out.println("Ligando...");
            TimeUnit.SECONDS.sleep(2);
            // System.console().wait(2000);
            this.estado = true;
        } else {
            System.out.println("Televisão já ligada");
        }
    }

    private void desligar() throws InterruptedException {
        if (this.estado) {
            System.out.println("Desligando...");
            // System.console().wait(2000);
            this.estado = false;
            System.out.println("Televisão desligada");
        } else {
            System.out.println("Televisão já desligada");
        }
    }

    private void aumentaVolume() {
        this.volume += validaValor("Digite o volume: ", 0, 100);
    }

    private void diminuiVolume() {
        this.volume -= validaValor("Digite o volume: ", 0, 100);
    }

    private void trocaCanal() {
        this.canal = validaValor("Digite o canal: ", 2, 85);
        this.exibeCanal();
    }

    private void exibeCanal() {
        System.out.println("Canal " + this.canal);
    }

    private int validaEntrada() {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String operacao;
        int numOperador = 0;
        try {
            operacao = bufferedReader.readLine();
            numOperador = Integer.parseInt(operacao);
            if (numOperador > 6) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
        }
        return numOperador;
    }

    private int validaValor(String textoSaida, int menor, int maior) {
        System.out.println(textoSaida);
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String operacao;
        int numero = 0;
        try {
            operacao = bufferedReader.readLine();
            numero = Integer.parseInt(operacao);
            if (numero < menor || numero > maior) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
        }
        return numero;
    }

}