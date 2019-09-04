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
        this.distanciaPercorrida += distancia > 0 ? distancia : 0;
        if (this.gasolina) {
            this.tanqueCombustivel -= distancia *= 0.1000;
        } else {
            this.tanqueCombustivel -= distancia *= 0.1428;
        }
    }

    public boolean abasteceTanque(double litros) {
        boolean ehValido = litros < tamanhoTanque || litros > 0;
        double acc = 0;
        acc += ehValido ? litros : 0;
        setTanqueCombustivel(acc);
        return ehValido;
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
     * @return se é gasolina ou alcool
     */
    public String getTipoCombustivel() {
        if (this.gasolina) {
            return "Gasolina";
        } else {
            return "Alcool";
        }
    }

    private String validaTanque() {
        if (getTanqueCombustivel() < 5) {
            return "Tanque em reserva";
        }
        return "";
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
}