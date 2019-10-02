package br.pucminas.atvlab.ArquivosEVetores.atv4;

/**
 * Urna
 */
public class Urna {
    public final Voto[] votos = new Voto[85];
    public final int[] qntVotos = new int[6];

    /**
     * @return the votos
     */
    public Voto[] getVotos() {
        return votos;
    }

    /**
     * @return the votos
     */
    public Voto getVotosPorPosicao(int index) {
        return votos[index];
    }

    public int imprimeIndecisos() {
        return qntVotos[5];
    }

    public int imprimeNulos() {
        return qntVotos[4];
    }

    @Override
    public String toString() {
        String aux = "Quantidade de votos no primeiro candidado: " + qntVotos[1] +
            "\n" +
            "Quantidade de votos no segundo candidado: " + qntVotos[2] +
            "\n" +
            "Quantidade de votos no terceiro candidado: " + qntVotos[3] +
            "\n" +
            "Quantidade de votos indecidos: " + imprimeIndecisos() +
            "\n" +
            "Quantidade de votos nulos: " + imprimeNulos();
        return aux;
    }
}
