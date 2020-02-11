package br.pucminas.periodo2.atvlab.ArquivosEVetores.atv3;

import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ComparadorArquivos
 */
public class ComparadorArquivos {
    private final int tamanhoArr = 20;
    private int iguais = 0;

    public ComparadorArquivos() {

    }

    public int[] leArquivo(String prefix) throws IOException {
        int[] ints = new int[tamanhoArr];
        Object[] params = new Object[]{prefix};
        String fileName = MessageFormat.format(".\\src\\main\\java\\atvlab\\atv3\\sequencia{0}.txt", params);
        Scanner in = new Scanner(new FileReader(fileName));
        int index = 0;
        String line;
        while (in.hasNext()) {
            line = in.nextLine();
            ints[index] = Integer.parseInt(line);
            index++;
        }
        in.close();
        return ints;
    }

    public int[] comparaArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < getTamanhoArr(); i++) {
            if (arr1[i] == arr2[i]) {
                arr.add(arr1[i]);
                iguais++;
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * @return the tamanhoArr
     */
    public int getTamanhoArr() {
        return tamanhoArr;
    }

    /**
     * @return the iguais
     */
    public int getIguais() {
        return iguais;
    }
}
