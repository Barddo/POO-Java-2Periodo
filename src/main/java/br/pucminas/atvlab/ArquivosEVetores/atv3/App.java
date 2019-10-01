package br.pucminas.atvlab.ArquivosEVetores.atv3;

import java.io.IOException;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) throws IOException {
        ComparadorArquivos ca = new ComparadorArquivos();
        int[] ints = ca.comparaArrays(ca.leArquivo("1"), ca.leArquivo("2"));
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println("Número de valores iguais: "+ ca.getIguais());
    }
}
