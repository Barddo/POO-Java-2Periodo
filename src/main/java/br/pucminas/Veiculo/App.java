package br.pucminas.Veiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        DecimalFormat decimalFormat = new DecimalFormat("#00.00");
        System.out.println("1 - Gasolina\n2- Alcool");
        int tipoCombustivel = validaValor(1, 2);

        System.out.println("Digite o tamanho do tanque de cobustível - 40 a 50 litros");
        double tamanhoCombust = App.read();
        Veiculo mustang = new Veiculo(tipoCombustivel == 1 ? true : false, tamanhoCombust);
        int loop = 1;
        while (loop != 0) {
            menu();
            loop = validaValor(0, 5);
            switch (loop) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Digite a distância:");
                mustang.deslocar(App.read());
                break;
            case 2:
                System.out.println("Digite quanto deseja abastecer:");
                mustang.abasteceTanque(App.read());
                break;
            case 3:
                System.out.println("Há " + decimalFormat.format(mustang.getTanqueCombustivel()) + " litros " + "de "
                        + mustang.getTipoCombustivel());
                break;
            case 4:
                System.out.println("Super Mustang 68 vermelho fosco V8 percorreu "
                        + decimalFormat.format(mustang.getDistanciaPercorrida()) + "Km");
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

    public static double read() {
        Scanner in = new Scanner(System.in);
        double i = 0;
        try {
            i = in.nextDouble();
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            i = App.read();
        }
        return i;
    }

    public static int validaValor(int menor, int maior) {
        int numero = 0;
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
        System.out.println("3 - Exibir informações");
        System.out.println("4 - Exibir distância percorrida");
        System.out.println("Digite a opção desejada");
    }
}