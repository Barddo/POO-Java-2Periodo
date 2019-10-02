package br.pucminas.Veiculo;

/**
 * Veiculo
 */
public class Veiculo {

    private boolean gasolina = true;
    private double tanqueCombustivel;
    private double distanciaPercorrida;
    private double tamanhoTanque;

    public Veiculo(boolean gasolina, double tamanhoTanque) {
        this.init(gasolina, tamanhoTanque);
    }

    private void init(boolean gasolina, double tamanhoTanque) {
        this.gasolina = gasolina;
        this.distanciaPercorrida = 0;
        if (tamanhoTanque >= 40 && tamanhoTanque <= 50) {
            this.tamanhoTanque = tamanhoTanque;
        } else {
            this.tamanhoTanque = 40;
        }
        setTanqueCombustivel(this.tamanhoTanque);
    }

    public void deslocar(double distancia) {
        double acumulador = 0;
        if (distancia > 0) {
            acumulador += distancia;
        }
        this.distanciaPercorrida += acumulador;
        if (this.gasolina) {
            this.tanqueCombustivel -= acumulador * 0.1000;
        } else {
            this.tanqueCombustivel -= acumulador * 0.1428;
        }
        validaTanque();
    }

    public void abasteceTanque(double litros) {
        boolean ehValido = litros < tamanhoTanque || litros > 0;
        double acc = 0;
        acc += ehValido ? litros : 0;
        setTanqueCombustivel(acc);
    }

    /**
     * @return the distanciaPercorrida
     */
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    /**
     * @return the tanqueCombustivel
     */
    public double getTanqueCombustivel() {
        return this.tanqueCombustivel;
    }

    /**
     * @param tanqueCombustivel the tanqueCombustivel to set
     */
    public void setTanqueCombustivel(double tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
        if (this.tanqueCombustivel < 0) {
            this.tanqueCombustivel = 0;
        }
    }

    /**
     * @return se é gasolina ou alcool
     */
    public String getTipoCombustivel() {
        if (this.gasolina) {
            return "Gasolina";
        } else {
            return "Alcool";
        }
    }

    public boolean alerta() {
        return getTanqueCombustivel() < 5;
    }

    private void validaTanque() {
        if (this.tanqueCombustivel <= 0) {
            this.tanqueCombustivel = 0;
        }
    }
}
