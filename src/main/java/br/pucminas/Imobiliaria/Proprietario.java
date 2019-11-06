package br.pucminas.Imobiliaria;

import java.util.List;

/**
 * Proprietario
 */
public class Proprietario {
    private List<Imovel> imoveis;

    public double relatorio(Imobiliaria imobiliaria) {
        double aux = 0;
        for (Imovel imovel : imoveis) {
            aux += imovel.aluguel();
        }
        return aux - imobiliaria.getLucroTotal();
    }
}