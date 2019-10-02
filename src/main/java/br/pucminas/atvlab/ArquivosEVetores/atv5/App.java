package br.pucminas.atvlab.ArquivosEVetores.atv5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        List<Integer> numeros = pares(leNumeros());
        for (int var : numeros) {
            System.out.println(var);
        }
    }

    public static List<Integer> pares(List<Integer> numeros) {
        for (int index = 0; index < numeros.size(); index++) {
            if (numeros.get(index) % 2 == 0) {
                numeros.remove(index);
            }
        }
        return numeros;
    }

    public static List<Integer> leNumeros() {
        List<Integer> nums = new ArrayList<Integer>();
        Scanner in = null;
        try {
            in = new Scanner(new FileReader("./src/main/java/atvlab/atv5/numeros.txt"));
            int index = 1;
            String line;
            line = in.next();
            while (in.hasNext()) {
                nums.add(Integer.parseInt(line));
                index++;
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
            System.err.println("Não foi possível encotrar o arquivo");
        } catch (NullPointerException e) {
            e.getMessage();
            e.printStackTrace();
            System.err.println("Acesso indisponível");
        } finally {
            Objects.requireNonNull(in).close();
        }
        return nums;
    }
}
