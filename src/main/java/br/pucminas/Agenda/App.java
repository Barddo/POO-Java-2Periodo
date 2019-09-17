package br.pucminas.Agenda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        Agenda a;
        a = new Agenda();

        Contato cb;
        cb = new Contato("Teste", new GregorianCalendar(1980, 10, 28));
        cb.setTelefone(new Telefone("3333-5555", "Telefone residencial"));
        cb.setTelefone(new Telefone("99111-1111", "Telefone celular"));
        a.inserir(cb);

        ContatoBasico obj = a.buscar("Teste"); // pesquisa por nome

        if (obj != null) {
            System.out.println(obj.getDados());
            // mostraDados(obj);
        } else
            System.out.println("Contato nao encontrado!");
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
        int numero = 0;
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
        int numOperador = 0;
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
