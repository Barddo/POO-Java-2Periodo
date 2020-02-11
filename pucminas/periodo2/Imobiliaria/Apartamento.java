package br.pucminas.periodo2.Imobiliaria;

import java.time.LocalDate;

/**
 * Apartamento
 */
public class Apartamento extends Imovel {

    @Override
    protected double aluguel() {
        double precoAluguel = this.getValor() * 0.4;
        int ano = this.getAno();
        int desconto = 0;
        while ((LocalDate.now().getYear() - ano) / 5 >= 1) {
            desconto += 5;
            if (this.getDescontoMaximo() <= desconto) {
                precoAluguel *= 0.95;
                ano -= 5;
            }
        }
        return precoAluguel;
    }

}
