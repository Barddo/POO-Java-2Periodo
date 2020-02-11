package br.pucminas.periodo2.atvlab.ArquivosEVetores.atv2;

import java.io.*;
import java.util.Scanner;

/**
 * Atividade 2
 */
public class GeradorRelatorio {
    private final String[] nomes;
    private final double[] valoresCompra;
    private final int tamanhoArr;

    public GeradorRelatorio() {
        tamanhoArr = 5;
        this.nomes = new String[tamanhoArr];
        this.valoresCompra = new double[tamanhoArr];
    }

    public void leVendas() throws IOException {
        Scanner in = new Scanner(new FileReader(".\\src\\main\\java\\atvlab\\atv2\\vendasClientes.txt"));
        int index = 0;
        String[] dadosClientes;
        String line;
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
        BufferedWriter writer;
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
