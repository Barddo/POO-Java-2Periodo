package br.pucminas.Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        Calculadora calc = new Calculadora();
        String loop = "";
        boolean op = true;
        do {
            calc.LerNumeros(calc.readInt("Entre com o primeiro número"), calc.readInt("Entre com o segundo número"));
            calc.RealizaOperacao();
            System.out.println("Digite algo para prosseguir.");
            System.out.println("Caso deseje sair, digite 0");
            loop = App.readLine();
            if (loop == "0") {
                op = false;
            }
        } while (op);

    }

    public static String readLine() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        return bufferedReader.readLine();
    }

}
