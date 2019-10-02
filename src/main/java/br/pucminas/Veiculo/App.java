package br.pucminas.Veiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#00.00");
        System.out.println("1 - Gasolina\n2- Alcool");
        int tipoCombustivel = validaValor(1, 2);

        System.out.println("Digite o tamanho do tanque de cobustível - 40 a 50 litros");
        double tamanhoCombust = validaValor(40, 50);
        Veiculo mustang = new Veiculo(tipoCombustivel == 1, tamanhoCombust);
        int loop = 1;
        while (true) {
            menu();
            loop = validaValor(0, 4);
            switch (loop) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Digite a distância:");
                    mustang.deslocar(App.read());
                    if (mustang.alerta()) {
                        System.out.println("Tanque em reserva");
                        System.out.println("Digite algo para prosseguir");
                        in.next();
                    }
                    break;
                case 2:
                    System.out.println("Digite quanto deseja abastecer:");
                    mustang.abasteceTanque(App.read());
                    break;
                case 3:
                    System.out.println("Há " + decimalFormat.format(mustang.getTanqueCombustivel()) + " litros " + "de "
                        + mustang.getTipoCombustivel());
                    System.out.println("Digite algo para prosseguir");
                    in.next();
                    break;
                case 4:
                    System.out.println("Super Mustang 68 vermelho fosco V8 percorreu "
                        + decimalFormat.format(mustang.getDistanciaPercorrida()) + "Km");
                    System.out.println("Digite algo para prosseguir");
                    in.next();
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println("Digite algo para prosseguir");
                    in.next();
                    break;
            }
        }
    }

    public static double read() {
        Scanner in = new Scanner(System.in);
        double i;
        try {
            i = in.nextDouble();
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            i = App.read();
        }
        return i;
    }

    public static int validaValor(int menor, int maior) {
        int numero;
        try {
            numero = (int) App.read();
            if (numero < menor || numero > maior) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            numero = validaValor(menor, maior);
        }
        return numero;
    }

    public static String readLine() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        return bufferedReader.readLine();
    }

    public static void menu() {
        System.out.print("\033\143");
        System.out.println("Super Mustang 68 fosco V8");
        System.out.println("0 - Sair");
        System.out.println("1 - Andar");
        System.out.println("2 - Abastecer");
        System.out.println("3 - Exibir combustível");
        System.out.println("4 - Exibir distância percorrida");
        System.out.println("Digite a opção desejada");
    }
}
