package lista5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Codificação");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        String nomeArquivo = readLine("Digite o nome do arquivo a ser criptografado:");

        ArquivoTextoLeitura arquivoLeituraCod = new ArquivoTextoLeitura();
        arquivoLeituraCod.abrirArquivo(nomeArquivo);

        String nomeArquivoCod = readLine("Digite o nome do arquivo a ser gravado:");
        ArquivoTextoEscrita arquivoEscritaCod = new ArquivoTextoEscrita();

        arquivoEscritaCod.abrirArquivo(nomeArquivoCod);
        String texto = arquivoLeituraCod.ler();

        Codificador codificador = new Codificador();

        while (texto != null) {
            arquivoEscritaCod.escrever(codificador.codifica(texto));
            texto = arquivoLeituraCod.ler();
        }

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Decodificação");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        String nomeArquivoDecod = readLine("Digite o nome do arquivo a ser descriptografado:");

        ArquivoTextoLeitura arquivoLeituraDecod = new ArquivoTextoLeitura();
        arquivoLeituraDecod.abrirArquivo(nomeArquivoDecod);

        String nomeArquivoDecodSalvo = readLine("Digite o nome do arquivo a ser gravado:");
        ArquivoTextoEscrita arquivoEscritaDecod = new ArquivoTextoEscrita();

        arquivoEscritaDecod.abrirArquivo(nomeArquivoDecodSalvo);
        String textoDecod = arquivoLeituraDecod.ler();

        Decodificador decodificador = new Decodificador();

        while (textoDecod != null) {
            arquivoEscritaCod.escrever(decodificador.decodifica(textoDecod));
            textoDecod = arquivoLeituraDecod.ler();
        }

        arquivoLeituraDecod.fecharArquivo();
        arquivoEscritaDecod.fecharArquivo();
        arquivoLeituraCod.fecharArquivo();
        arquivoEscritaCod.fecharArquivo();
    }

    public static String readLine(String msg) {
        System.out.println(msg);
        String i = null;
        try {
            i = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }
}
