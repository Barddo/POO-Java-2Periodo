package br.pucminas.periodo2.Relogio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * main Relogio
 */
public class App {
    public static void main(String[] args) throws IOException {
        Relogio r = new Relogio();
        boolean loop = true;

        while (true) {
            menu();
            int opcao = validaEntrada();
            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    r.ajusteHora(readInt("Digite as horas:"), readInt("Digite os minutos:"),
                        readInt("Digite os segundos:"));
                    System.out.println(r.exibeInfomacoes());
                    break;
                case 2:
                    r.ajusteData(readInt("Digite o dia:"), readInt("Digite o mês:"));
                    System.out.println(r.exibeInfomacoes());
                    break;
                case 3:
                    r.passarTempo(readInt("Digite os segundos:"));
                    System.out.println(r.exibeInfomacoes());
                    break;
                case 4:
                    System.out.println(r.exibeInfomacoes());
                    break;
                case 5:
                    r.reiniciar();
                    break;
                case 6:
                    System.out.println("Bissexto? " + r.bissexto());
                    break;
                case 7:
                    System.out.println("Dia do ano: " + r.getDiaAno());
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
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
        System.out.println("6 - Descobrir se o ano atual é bissexto");
        System.out.println("7 - Dia do ano");
        System.out.println("Digite a opção desejada");
    }

    public static int readInt(String textoSaida) {
        System.out.println(textoSaida);
        String operacao;
        int numero;
        try {
            operacao = App.readLine();
            numero = Integer.parseInt(operacao);
            if (numero < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            numero = readInt(textoSaida);
        }
        return numero;
    }

    public static int validaEntrada() {
        String operacao;
        int numOperador;
        try {
            operacao = App.readLine();
            numOperador = Integer.parseInt(operacao);
            if (numOperador < 0 || numOperador > 7) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            numOperador = validaEntrada();
        }
        return numOperador;
    }
}
