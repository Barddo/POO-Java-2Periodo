package br.pucminas.Grafica;

/**
 * Tanque
 */
public abstract class Tanque {
    protected double capacidade;
    protected double quantidade;
    protected double minimo;
    protected double consumo;

    public Tanque() {
        this.capacidade = 1000;
        this.quantidade = 0;
        this.minimo = 100;
    }

    public String notifica(Impressora imp) {
        if (imp.getTanqueColorido().getQuantidade() > imp.getTanqueColorido().getMinimo()) {
            return "Tanque Colorido abaixo do esperado";
        }
        if (imp.getTanquePB().getQuantidade() > imp.getTanquePB().getMinimo()) {
            return "Tanque Preto e Branco abaixo do esperado";
        }
        return "";

    }

    public double getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getMinimo() {
        return this.minimo;
    }

    /**
     * @return the consumo
     */
    public double getConsumo() {
        return consumo;
    }
}