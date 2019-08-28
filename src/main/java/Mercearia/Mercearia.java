package Mercearia;

import java.util.ArrayList;

/**
 * Mercearia
 */
public class Mercearia {
    Produto produto;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    private float lucro = 25;

    public Mercearia() {

    }

    public double getPrecoFinal() {
    }

    public double getPrecoFinal() {

    }

    public double getProdutoSemImposto(Produto produto) {
        return (produto.getCusto() * lucro);
    }

    public double getLucroPorVenda(Produto produto) {
        float preco = produto.getCusto();
    }

    public double getLucroTotal() {

    }
}