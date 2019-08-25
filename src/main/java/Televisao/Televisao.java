package Televisao;

import java.util.concurrent.TimeUnit;

/**
 * Televisao
 */
public class Televisao {

    private int volume;
    private int canal;
    private boolean estado;
    
    public Televisao() throws InterruptedException {
        this.canal = 3;
        this.volume = 20;
        this.ligar();
    }

    /**
     * 
     * @throws InterruptedException
     */
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
        case 7:
            this.exibeVolume();
            break;
        default:
            break;
        }
    }

    /**
     * 
     * Liga a televisão
     */
    private void ligar() throws InterruptedException {
        if (this.estado == false) {
            System.out.println("Ligando...");
            TimeUnit.SECONDS.sleep(2);
            this.estado = true;
        } else {
            System.out.println("Televisão já ligada");
        }
    }

    /**
     * 
     * Desliga a televisão
     */
    private void desligar() throws InterruptedException {
        if (this.estado) {
            System.out.println("Desligando...");
            this.estado = false;
            System.out.println("Televisão desligada");
        } else {
            System.out.println("Televisão já desligada");
        }
    }

    private void aumentaVolume() {
        this.volume += validaValor("Digite o volume: ", 0, 100);
        this.exibeVolume();
    }

    private void diminuiVolume() {
        this.volume -= validaValor("Digite o volume: ", 0, 100);
        this.exibeVolume();
    }

    private void trocaCanal() {
        this.canal = validaValor("Digite o canal: ", 2, 85);
        this.exibeCanal();
    }

    private void exibeCanal() {
        System.out.println("Canal " + this.canal);
    }

    private void exibeVolume() {
        System.out.println("Volume " + this.volume);
    }

    /**
     * @return Estado da Televisão (ligado ou desligado)
     * 
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Lê String e valida se é uma entrada válida
     * 
     * @return Numero validado
     */
    private int validaEntrada() {
        String operacao;
        int numOperador = 0;
        try {
            operacao = App.readLine();
            numOperador = Integer.parseInt(operacao);
            if (numOperador > 7) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
        }
        return numOperador;
    }

    /**
     * Recebe String, e valida a transformação em int
     * 
     * @param textoSaida Texto a ser pedido para o usuário
     * @param menor      Menor valor possível de entrada
     * @param maior      Maior valor possível de entrada
     * @return Numero validado
     */
    private int validaValor(String textoSaida, int menor, int maior) {
        System.out.println(textoSaida);
        String operacao;
        int numero = 0;
        try {
            operacao = App.readLine();
            numero = Integer.parseInt(operacao);
            if (numero < menor || numero > maior) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Entrada inválida. ");
            numero = this.validaValor(textoSaida, menor, maior);
        }
        return numero;
    }
}