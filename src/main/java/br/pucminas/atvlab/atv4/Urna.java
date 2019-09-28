package br.pucminas.atvlab.atv4;

/**
 * Urna
 */
public class Urna {
    public Voto[] votos = new Voto[85];
    public int[] qntVotos = new int[6];

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
        StringBuilder aux = new StringBuilder();
        aux.append("Quantidade de votos no primeiro candidado: " + qntVotos[1]);
        aux.append("\n");
        aux.append("Quantidade de votos no segundo candidado: " + qntVotos[2]);
        aux.append("\n");
        aux.append("Quantidade de votos no terceiro candidado: " + qntVotos[3]);
        aux.append("\n");
        aux.append("Quantidade de votos indecidos: " + imprimeIndecisos());
        aux.append("\n");
        aux.append("Quantidade de votos nulos: " + imprimeNulos());
        return aux.toString();
    }
}