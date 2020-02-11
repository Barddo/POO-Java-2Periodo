package br.pucminas.periodo2.Grafica;

/**
 * Tanque
 */
public abstract class Tanque {
    protected final double capacidade;
    protected final double minimo;
    protected double quantidade;
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
        String aux = new StringBuilder()
            .append("Capacidade: ")
            .append(this.getCapacidade()).append("ml")
            .append(". Quantidade: ")
            .append(this.getQuantidade()).append("ml").toString();
        return aux;
    }
}
