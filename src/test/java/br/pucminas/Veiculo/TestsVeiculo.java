package br.pucminas.Veiculo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * TestsVeiculo
 */
public class TestsVeiculo {

    @Test
    public void testaMovimentoGasolina() {
        Veiculo vei = new Veiculo(true, 50);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        vei.deslocar(30);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        assertEquals(47, vei.getTanqueCombustivel(), 0.00001);
    }

    @Test
    public void testaMovimentoAlcool() {
        Veiculo vei = new Veiculo(true, 50);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        vei.deslocar(30);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        assertEquals(45.716, vei.getTanqueCombustivel(), 0.00001);
    }

}
