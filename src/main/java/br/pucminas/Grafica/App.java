package br.pucminas.Grafica;

public class App {
    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Grafica graf = new Grafica();
        graf.imprimir(new DocumentoColorido());
    }
}
