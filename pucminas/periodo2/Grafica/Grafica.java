package br.pucminas.periodo2.Grafica;

/**
 * Grafica
 */
public class Grafica {
    protected Impressora impressora;
    protected double valor;

    public Grafica() {
        this.impressora = new Impressora();
    }

    public void imprimir(Documento d) {
        d.imprimir(this);
        this.valor += d.valorImpressao();
    }

    public Impressora getImpressora() {
        return this.impressora;
    }

    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
