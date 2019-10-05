package br.pucminas.atvlab.Encapsulamento.teste;

public class Livro {
    protected String nome;
    protected double custo;
    protected double preco;
    protected double paginas;
    protected float comissao;
    protected short qntVotos;
    protected Avaliacao avaliacao;

    public void votar(float nota, String descricao) {
        avaliacao = new Avaliacao(nota, descricao);
        qntVotos++;
    }

    /**
     * @return the avaliacao
     */
    public float getAvaliacao() {
        return avaliacao.getNota();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the qntVotos
     */
    public short getQntVotos() {
        return qntVotos;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

}
