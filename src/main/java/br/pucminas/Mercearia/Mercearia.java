package br.pucminas.Mercearia;

import java.util.ArrayList;

/**
 * Mercearia
 */
public class Mercearia {
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    private float lucro = 25;
    private double lucroTotal = 0;

    public Mercearia() {

    }

    /**
     * @return the lucro
     */
    public float getLucro() {
        return (lucro / 100);
    }

    public void adicionaProduto(String nome, float custo, String categoria) {
        Produto p = new Produto(nome, custo, categoria);
        produtos.add(p);
    }

    // FIXME Entender melhor o exercício para refazer este método.

    // public void vendeProduto() {
    // Object[] arrProdutos = this.produtos.toArray();
    // produtos.forEach();
    // this.lucroTotal += (getPrecoFinal(produto) - custo);
    // }

    public double getPrecoFinal(Produto produto) {
        return ((produto.getCusto() + produto.getImposto()) * (1 + this.getLucro()));
    }

    public double getProdutoSemImposto(Produto produto) {
        return (produto.getCusto() * (1 + this.getLucro()));
    }

    public double getLucroPorVenda(Produto produto) {
        return (getPrecoFinal(produto) - (produto.getImposto() + produto.getCusto()));
    }

    public double getLucroTotal() {
        return this.lucroTotal;
    }

    /**
     * @return the produtos
     */
    // TODO Melhorar retorno, tratar melhor da saída
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}