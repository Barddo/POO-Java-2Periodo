package br.pucminas.Mercearia;

import java.util.ArrayList;

/**
 * Mercearia
 */
public class Mercearia {
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    private float lucro = 25;
    private float lucroTotal = 0;
    private static int index=0;

    public Mercearia() {
    }

    /**
     * @return the lucro
     */
    public float getLucro() {
        return (lucro / 100);
    }

    public void adicionaProduto(String nome, float custo, int intCategoria) {
        Produto p = new Produto(nome, custo, validaCategoria(intCategoria));
        produtos.add(p);
    }

    private String validaCategoria(int intCategoria) {
        String categoriaValida;
        switch (intCategoria) {
        case 1:
            categoriaValida = "comida";
            break;
        case 2:
            categoriaValida = "bebida";
            break;
        case 3:
            categoriaValida = "material de limpeza";
            break;
        default:
            categoriaValida = "";
            break;
        }
        return categoriaValida;
    }

    public double getPrecoFinal() {
        index = App.validaValor(0, (produtos.size()-1));
        Produto produto = produtos.get(index);
        return ((produto.getCusto() + produto.getImposto()) * (1 + this.getLucro()));
    }

    public double getPrecoFinal(int index) {
        Produto produto = produtos.get(index);
        return ((produto.getCusto() + produto.getImposto()) * (1 + this.getLucro()));
    }

    public double getProdutoSemImposto() {
         index = App.validaValor(0, (produtos.size()-1));
        Produto produto = produtos.get(index);
        return (produto.getCusto() * (1 + this.getLucro()));
    }

    public double getLucroPorVenda() {
         index = App.validaValor(0, produtos.size());        
        Produto produto = produtos.get(index);
        return (this.getPrecoFinal(index) - (produto.getImposto() + produto.getCusto()));
    }

    public float getLucroTotal() {
        return this.lucroTotal;
    }

    public String mostraProdutos() {
        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < produtos.size(); i++) {
            aux.append("Produto " + i + ":\n");
            aux.append(produtos.get(i).getNome());
        }
        return aux.toString();
    }
}