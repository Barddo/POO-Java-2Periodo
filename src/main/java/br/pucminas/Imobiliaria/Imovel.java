package br.pucminas.Imobiliaria;

/**
 * Imovel
 */
public abstract class Imovel {

    protected double valor;
    private float descontoMaximo;
    private String endereco;
    private int ano;

    protected abstract double aluguel();

    public double getValor() {
        return this.valor;
    }

    public float getDescontoMaximo() {
        return this.descontoMaximo;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getAno() {
        return this.ano;
    }

}