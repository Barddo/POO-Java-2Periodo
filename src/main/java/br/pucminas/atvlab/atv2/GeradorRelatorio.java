package br.pucminas.atvlab.atv2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Atividade 2
 */
public class GeradorRelatorio {
    private String[] nomes;
    private double[] valoresCompra;
    private int tamanhoArr;

    public GeradorRelatorio() {
        tamanhoArr = 5;
        this.nomes = new String[tamanhoArr];
        this.valoresCompra = new double[tamanhoArr];
    }

    public void leVendas() throws IOException {
        Scanner in = new Scanner(new FileReader(".\\src\\main\\java\\atvlab\\atv2\\vendasClientes.txt"));
        int index = 0;
        String[] dadosClientes = null;
        String line = null;
        while (in.hasNext()) {
            line = in.nextLine();
            dadosClientes = line.split("-");
            nomes[index] = dadosClientes[0];
            valoresCompra[index] = Double.parseDouble(dadosClientes[1]);
            index++;
        }
        in.close();

    }

    public void geraRelatorioVendas() throws IOException {
        BufferedWriter writer = null;
        String nomeArquivoSaida = "descontosClientes.txt";
        writer = new BufferedWriter(new FileWriter(new File(nomeArquivoSaida)));
        for (int i = 0; i < this.tamanhoArr; i++) {
            writer.write("Cliente " + nomes[i] + ". ");
            writer.write("Valor com Desconto " + calculaDesconto(valoresCompra[i]));
            writer.newLine();
        }
        writer.close();
    }

    public double calculaDesconto(double valor) {
        return valor >= 1800 ? valor * 0.8 : valor * 0.85;
    }
}