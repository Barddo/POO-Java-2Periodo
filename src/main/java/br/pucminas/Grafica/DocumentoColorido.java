package br.pucminas.Grafica;

/**
 * DocumentoColorido
 */
public class DocumentoColorido extends Documento {
    private double precoPag;

    public DocumentoColorido() {
        precoPag = 1.2;
    }

    @Override
    public double valorImpressao() {

    }

    @Override
    public double consumoTinta(Impressora imp) {
imp.tanques[0]
    }

    public void imprimir() {

    }

    /**
     * @return the precoPag
     */
    public double getPrecoPag() {
        return precoPag;
    }

    /**
     * @param precoPag the precoPag to set
     */
    public void setPrecoPag(double precoPag) {
        this.precoPag = precoPag;
    }

}