package br.pucminas.Grafica;

/**
 * DocumentoPretoBranco
 */
public class DocumentoPretoBranco extends Documento {

    public DocumentoPretoBranco(int qntPaginas) {
        super.qntPaginas = qntPaginas;
        this.precoPag = 0.2;
    }

    @Override
    public void imprimir(Grafica g) {
        double qnt = g.getImpressora().getTanquePB().getQuantidade();
        g.impressora.getTanquePB().setQuantidade(qnt - this.consumoTinta(g.getImpressora()));
    }

    @Override
    public double valorImpressao() {
        return this.precoPag * super.qntPaginas;
    }

    @Override
    public double consumoTinta(Impressora imp) {
        System.out.println(super.qntPaginas * imp.getTanquePB().getConsumo());
        return super.qntPaginas * imp.getTanquePB().getConsumo();
    }
}