package br.pucminas.periodo2.Grafica;

/**
 * DocumentoColorido
 */
public class DocumentoColorido extends Documento {

    public DocumentoColorido(int qntPaginas) {
        super.qntPaginas = qntPaginas;
        this.precoPag = 1.2;
    }

    @Override
    public void imprimir(Grafica g) {
        double qnt = g.getImpressora().getTanqueColorido().getQuantidade();
        g.impressora.getTanqueColorido().setQuantidade(qnt - this.consumoTinta(g.getImpressora()));
    }

    @Override
    public double valorImpressao() {
        return this.precoPag * super.qntPaginas;
    }

    @Override
    public double consumoTinta(Impressora imp) {
        System.out.println(super.qntPaginas * imp.getTanqueColorido().getConsumo());
        return super.qntPaginas * imp.getTanqueColorido().getConsumo();
    }
}
