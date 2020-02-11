package br.pucminas.periodo2.Banco.test;

import br.pucminas.periodo2.Banco.modelo.CalculadorDeImposto;
import br.pucminas.periodo2.Banco.modelo.ContaCorrente;
import br.pucminas.periodo2.Banco.modelo.SeguroDeVida;

//classe Teste
public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());

    }

}
