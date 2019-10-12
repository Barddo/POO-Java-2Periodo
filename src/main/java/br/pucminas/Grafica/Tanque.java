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
        this.quantidade = 500;
        this.minimo = 100;
    }

    public abstract String notifica(Impressora imp);

    public double getCapacidade() {
        return this.capacidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = (quantidade > 0) && (quantidade <= this.capacidade) ? quantidade : this.capacidade;
    }

    public double getMinimo() {
        return this.minimo;
    }

    /**
     * @return the consumo
     */
    public double getConsumo() {
        return this.consumo;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        aux.append("Capacidade: ");
        aux.append(this.getCapacidade() + "ml");
        aux.append(". Quantidade: ");
        aux.append(this.getQuantidade() + "ml");
        return aux.toString();
    }
}