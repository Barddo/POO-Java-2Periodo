package br.pucminas.Grafica;

/**
 * Impressora
 */
public class Impressora {
    protected final Tanque tanqueColorido;
    protected final Tanque tanquePB;

    public Impressora() {
        tanqueColorido = new TanqueColorido();
        tanquePB = new TanquePretoBranco();
    }

    public void imprimir(Documento d, Grafica g) {
        d.imprimir(g);
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
