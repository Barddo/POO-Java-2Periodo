package br.pucminas.atvlab.atv2;

import java.io.IOException;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) throws IOException {

        GeradorRelatorio gr = new GeradorRelatorio();
        gr.leVendas();
        gr.geraRelatorioVendas();
    }
}
