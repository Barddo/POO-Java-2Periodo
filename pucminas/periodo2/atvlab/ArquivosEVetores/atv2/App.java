package br.pucminas.periodo2.atvlab.ArquivosEVetores.atv2;

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
