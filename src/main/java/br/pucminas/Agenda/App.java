package br.pucminas.Agenda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Agenda agenda;
        agenda = new Agenda();
        int loop = 1;
        while (true) {
            menu();
            loop = validaEntrada(0, 5);
            switch (loop) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    int repeteDias = 0;
                    int vezes = 0;
                    System.out.println("Digite o nome do compromisso");
                    String nome = readLine();
                    int dia = readInt("Digite o dia");
                    int mes = readInt("Digite o mes");
                    int ano = readInt("Digite o ano");
                    System.out.println("O compromisso se repete?");
                    int repete = validaEntrada(0, 1);
                    if (repete == 1) {
                        repeteDias = readInt("De quanto em quantos dias?");
                        vezes = readInt("Quantas vezes o compromisso se repetirá?");
                    }
                    agenda.adicionaCompromisso(nome, dia, mes, ano, repeteDias, vezes);
                    break;
                case 2:
                    System.out.println(agenda.imprimeCompromissos());
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Digite algo para prosseguir");
            Scanner in = new Scanner(System.in);
            in.next();
        }
    }

    public static String readLine() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        return bufferedReader.readLine();
    }

    public static void menu() {
        System.out.print("\033\143");
        System.out.println("Agenda");
        System.out.println("0 - Sair");
        System.out.println("1 - Adiciona Compromisso");
        System.out.println("2 - Exibir compromissos");
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

    public static int validaEntrada(int menor, int maior) {
        String operacao;
        int numOperador;
        try {
            operacao = App.readLine();
            numOperador = Integer.parseInt(operacao);
            if (numOperador < menor || numOperador > maior) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            numOperador = validaEntrada(menor, maior);
        }
        return numOperador;
    }
}
