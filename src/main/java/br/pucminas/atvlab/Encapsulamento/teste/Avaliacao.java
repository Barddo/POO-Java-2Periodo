package br.pucminas.atvlab.Encapsulamento.teste;

public class Avaliacao {
    private float nota;
    private String descricao;


    public Avaliacao(float nota, String descricao) {
        this.nota = nota;
        this.descricao = descricao;
    }

    /**
     * @return the nota
     */
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
