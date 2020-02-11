package br.pucminas.periodo2.Grafica;

public class App {
    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Grafica graf = new Grafica();
        System.out.println(graf.getImpressora().getTanqueColorido().notifica(graf.getImpressora()));
        graf.imprimir(new DocumentoColorido(100));
        System.out.println(graf.getImpressora().getTanqueColorido().notifica(graf.getImpressora()));
        System.out.println(graf.getImpressora().getTanqueColorido().toString());

        System.out.println(graf.getImpressora().getTanquePB().notifica(graf.getImpressora()));
        graf.imprimir(new DocumentoPretoBranco(400));
        System.out.println(graf.getImpressora().getTanquePB().toString());
        System.out.println(graf.getImpressora().getTanquePB().notifica(graf.getImpressora()));
    }
}
