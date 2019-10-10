package br.pucminas.Grafica;

/**
 * DocumentoPretoBranco
 */
public class DocumentoPretoBranco extends Documento {
    private double precoPag;

    public DocumentoPretoBranco() {
        this.precoPag = 0.2;
    }

    @Override
    public double valorImpressao() {
        return super.qntPaginas * this.precoPag;
    }

    @Override
    public double consumoTinta(Impressora imp) {
        double qnt = imp.getTanquePB().getQuantidade();
        imp.getTanquePB().setQuantidade(qnt - (super.qntPaginas * imp.getTanquePB().getConsumo()));
    }

    public void imprimir() {

    }
}