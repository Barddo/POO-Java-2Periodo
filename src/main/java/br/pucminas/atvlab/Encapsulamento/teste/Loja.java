package br.pucminas.atvlab.Encapsulamento.teste;

import java.util.ArrayList;

public class Loja {

    ArrayList<Livro> livros;

    public float mediaAvaliacoes(Livro li) {
        float media = 0;
        int qntAval = 0;
        for (Livro livro : livros) {
            if (livro.equals(li)) {
                media += livro.getAvaliacao();
                qntAval += livro.getQntVotos();
            }
        }
        return media / qntAval;
    }
}
