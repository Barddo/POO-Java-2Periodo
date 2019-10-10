package br.pucminas.Grafica;

/**
 * Documento
 */
public abstract class Documento {
    protected int qntPaginas;

    public void imprimir(Grafica g) {

    }

    public double valorImpressao() {

    }

    public double consumoTinta(Impressora imp) {
        
    }

    /**
     * @param qntPaginas the qntPaginas to set
     */
    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    /**
     * @return the qntPaginas
     */
    public int getQntPaginas() {
        return qntPaginas;
    }

}