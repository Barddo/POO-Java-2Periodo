package br.pucminas.Grafica;

/**
 * Grafica
 */
public class Grafica {
    protected Impressora impressora;
    protected double valorColorido;
    protected double valorPB;

    public Grafica() {
        
    }
    public void imprimir(Documento d) {

    }

    public Impressora getImpressora() {
        return this.impressora;
    }

    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }

    public double getValorColorido() {
        return this.valorColorido;
    }

    public void setValorColorido(double valorColorido) {
        this.valorColorido = valorColorido;
    }

    public double getValorPB() {
        return this.valorPB;
    }

    public void setValorPB(double valorPB) {
        this.valorPB = valorPB;
    }
}