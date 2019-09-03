package br.pucminas.Veiculo;

/**
 * Veiculo
 */
public class Veiculo {

    private boolean gasolina = true;
    private double tanqueCombustivel;
    private double distanciaPercorrida;
    private int tamanhoTanque;

    public Veiculo(boolean gasolina, int tamanhoTanque) {
        this.init(gasolina, tamanhoTanque);
    }

    private void init(boolean gasolina, int tamanhoTanque) {
        this.gasolina = gasolina;
        this.distanciaPercorrida = 0;
        if (tamanhoTanque < 40 || tamanhoTanque > 50) {
            this.tamanhoTanque = tamanhoTanque;
        } else {
            this.tamanhoTanque = 40;
        }
        this.tanqueCombustivel = this.tamanhoTanque;
    }

    public void anda(float distancia) {
        this.distanciaPercorrida += distancia;
        this.validaDistancia(distancia);
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
        return tanqueCombustivel;
    }

    public String validaTanque() {
        if (this.tanqueCombustivel < 5) {
            return "Tanque em reserva";
        }
        return "";
    }

    public void validaDistancia(double dist) {
        if (this.gasolina) {
            this.tanqueCombustivel -= (dist *= 0.1000);
        } else {
            this.tanqueCombustivel -= (dist *= 0.1428);
        }
    }
}