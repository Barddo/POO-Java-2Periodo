package br.pucminas.atvlab.ArquivosEVetores.atv4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Urna urna = new Urna();
        leVotos(urna);
        decodificaVotos(urna);
        System.out.println(urna.toString());
    }

    public static void leVotos(Urna urna) {
        Scanner in = null;
        try {
            in = new Scanner(new FileReader("./src/main/java/atvlab/atv4/votos.txt"));
            int index = 1;
            String line;
            line = in.next();
            while (in.hasNext()) {
                urna.getVotos()[index].setEscolha(Integer.parseInt(line));
                line = in.next();
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
    }

    public static void decodificaVotos(Urna urna) {
        for (int i = 0; i < urna.getVotos().length; i++) {
            switch (urna.getVotosPorPosicao(i).getEscolha()) {
                case 1:
                    urna.qntVotos[1]++;
                    break;
                case 2:
                    urna.qntVotos[2]++;
                    break;
                case 3:
                    urna.qntVotos[3]++;
                    break;
                case 4:
                    urna.qntVotos[4]++;
                    break;
                case 5:
                    urna.qntVotos[5]++;
                    break;
                default:
                    break;
            }
        }
    }

}
