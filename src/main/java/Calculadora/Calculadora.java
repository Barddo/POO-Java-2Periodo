package Calculadora;

import java.io.IOException;
import java.util.ArrayList;

public class Calculadora {
    public double resultado;
    private int primeiroNumero, segundoNumero;
    String[] operacoes = new String[] { "+", "-", "*", "/", "^" };

    private boolean EhValido(String tentativa) {
        ArrayList<String> op = new ArrayList<String>();
        for (int i = 0; i < this.operacoes.length; i++) {
            op.add(this.operacoes[i]);
        }
        boolean elementoExiste = op.contains(tentativa);
        boolean naoVazio = (!tentativa.isEmpty());
        return (elementoExiste && naoVazio);
    }

    private String validaOperador(String textoSaida) throws IOException {
        System.out.println(textoSaida);
        String operacao = App.readLine();
        while (!EhValido(operacao)) {
            System.out.println("Entrada inválida");
            System.out.println(textoSaida);
            operacao = App.readLine();
        }
        return operacao;
    }

    public void LerNumeros(int valor1, int valor2) {
        this.primeiroNumero = valor1;
        this.segundoNumero = valor2;
    }

    public int readInt(String textoSaida) throws IOException{
        System.out.println(textoSaida);
        String operacao;
        int numero = 0;
        try {
            operacao = App.readLine();
            numero = Integer.parseInt(operacao);
            if (numero < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite novamente:");
            numero = this.readInt(textoSaida);
        }
        return numero;
    }

    public void RealizaOperacao() throws IOException {
        String operador = validaOperador(
                "Entre com a operação + (adição), - (subtração), * (multipicação), / (divisão), ^ (expoente) :");
        switch (operador) {
        case "+":
        case "adição":
            resultado = this.primeiroNumero + this.segundoNumero;
            break;
        case "-":
        case "subtração":
            resultado = this.primeiroNumero - this.segundoNumero;
            break;
        case "*":
        case "multipicação":
            resultado = this.primeiroNumero * this.segundoNumero;
            break;
        case "/":
        case "divisão":
            resultado = this.primeiroNumero / this.segundoNumero;
            break;
        case "^":
        case "expoente":
            resultado = Math.pow(this.primeiroNumero, this.segundoNumero);
            break;
        default:
            resultado = 0;
            break;
        }
        System.out.println("Resultado: " + this.primeiroNumero + operador + this.segundoNumero+" = " + resultado);
    }
}