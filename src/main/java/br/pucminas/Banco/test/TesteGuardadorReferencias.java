package br.pucminas.Banco.test;


import br.pucminas.Banco.modelo.Conta;
import br.pucminas.Banco.modelo.ContaCorrente;
import br.pucminas.Banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());

    }

}
