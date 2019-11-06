package br.pucminas.Imobiliaria;

import java.util.List;

/**
 * Imobiliaria
 */
public class Imobiliaria {

    private double lucroTotal;

    public void retiraLucro(double valor) {
        this.lucroTotal += valor * 0.12;
    }

    public double getLucroTotal() {
        return this.lucroTotal;
    }

}