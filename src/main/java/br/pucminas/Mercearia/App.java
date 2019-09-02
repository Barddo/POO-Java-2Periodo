package br.pucminas.Mercearia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Java");
        Mercearia merc = new Mercearia();
        int loop = 1;
        while (loop != 0) {
            menu();
            loop = validaValor(0, 5);
            switch (loop) {
            case 0:
                System.exit(0);
                break;
            case 1:
                boolean op = true;
                System.out.println("Digite o nome do produto");
                String nome = readLine();
                System.out.println("Digite o custo do produto");
                float custo = 0;
                while (op) {
                    try {
                        custo = Float.parseFloat(readLine());
                        op = false;
                    } catch (Exception e) {
                        System.out.println("Entrada inválida, digite novamente.");
                    }
                }
                System.out.println("Digite a categoria do produto. ");
                System.out.println("1 - Comida, 2 - Bebida, 3 - Material de Limpeza");
                int categoria = validaValor(1, 3);

                merc.adicionaProduto(nome, custo, categoria);
                break;
            case 2:
                System.out.println(merc.mostraProdutos());
                System.out.println("Digite o produto");
                System.out.println(validaReais(merc.getPrecoFinal()));
                break;
            case 3:
                System.out.println(merc.mostraProdutos());
                System.out.println("Digite o produto");
                System.out.println(validaReais(merc.getProdutoSemImposto()));
                break;
            case 4:
                System.out.println(merc.mostraProdutos());
                System.out.println("Digite o produto");
                System.out.println(validaReais(merc.getLucroPorVenda()));
                break;
            case 5:
                System.out.println(merc.mostraProdutos());
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

    public static int read() {
        Scanner in = new Scanner(System.in);
        int i = 0;
        try {
            i = in.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            i = App.read();
        }
        return i;
    }

    public static int validaValor(int menor, int maior) {
        int numero = 0;
        try {
            numero = App.read();
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

    public static String validaReais(Double d) {
        Locale ptBr = new Locale("pt", "BR");
        NumberFormat formatador = NumberFormat.getCurrencyInstance(ptBr);
        String moeda = formatador.format(d);
        return moeda;
    }

    public static void menu() {
        System.out.print("\033\143");
        System.out.println("Super Ultra Relogio 3000");
        System.out.println("0 - Sair");
        System.out.println("1 - Adiciona produto");
        System.out.println("2 - Preço final do produto");
        System.out.println("3 - Preço do produto sem impostos");
        System.out.println("4 - Lucro da venda do produto");
        System.out.println("5 - Produtos listados");
        System.out.println("Digite a opção desejada");
    }

    public static int validaEntrada() {
        int numOperador = 0;
        try {
            numOperador = App.read();
            if (numOperador < 0 || numOperador > 5) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            numOperador = validaEntrada();
        }
        return numOperador;
    }
}