package br.pucminas.Grafica;

/**
 * TanquePretoBranco
 */
public class TanquePretoBranco extends Tanque {

    public TanquePretoBranco() {
        super();
        super.consumo = 1;
    }

    @Override
    public String notifica(Impressora imp) {
        if (imp.getTanquePB().getQuantidade() <= imp.getTanquePB().getMinimo())
            return "Tanque Preto e Branco abaixo do esperado";
        else
            return "Tanque acima do mínimo";
    }
}