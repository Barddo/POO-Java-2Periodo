package br.pucminas.Grafica;

/**
 * Impressora
 */
public class Impressora {
    protected Tanque tanqueColorido;
    protected Tanque tanquePB;

    public Impressora() {
        tanqueColorido = new TanqueColorido();
        tanquePB = new TanquePretoBranco();
    }

    public void imprimir(Documento d, Grafica g) {

    }

    /**
     * @return the tanqueColorido
     */
    public Tanque getTanqueColorido() {
        return tanqueColorido;
    }

    /**
     * @return the tanquePB
     */
    public Tanque getTanquePB() {
        return tanquePB;
    }
}