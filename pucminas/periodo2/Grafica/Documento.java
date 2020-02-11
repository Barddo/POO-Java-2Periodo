package br.pucminas.periodo2.Grafica;

/**
 * Documento
 */
public abstract class Documento {
    protected int qntPaginas;
    protected double precoPag;

    public abstract void imprimir(Grafica g);

    public abstract double valorImpressao();

    public abstract double consumoTinta(Impressora imp);

    /**
     * @return the qntPaginas
     */
    public int getQntPaginas() {
        return qntPaginas;
    }

    /**
     * @param qntPaginas the qntPaginas to set
     */
    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
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
