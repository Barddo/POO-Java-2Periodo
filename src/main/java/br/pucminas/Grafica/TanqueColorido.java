package br.pucminas.Grafica;

/**
 * TanqueColorido
 */
public class TanqueColorido extends Tanque {

    public TanqueColorido() {
        super();
        super.consumo = 2.5;
    }

    @Override
    public String notifica(Impressora imp) {
        if (imp.getTanqueColorido().getQuantidade() <= imp.getTanqueColorido().getMinimo())
            return "Tanque Colorido abaixo do esperado";
        else
            return "Tanque acima do mínimo";
    }
}