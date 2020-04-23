package prova;

public class TestaLista {

    public static void main(String[] args) {
        ListaSite listaSite = new ListaSite();

        listaSite.inserirFinal(new Site("google", "google.com"));
        listaSite.inserirFinal(new Site("twitter", "twitter.com"));
        listaSite.inserirFinal(new Site("reddit", "reddit.com"));
        listaSite.inserirFinal(new Site("g1", "g1.com"));
        listaSite.imprimir();

        System.out.println("-----------------------------");
        listaSite.localizaEInsereNoInicio("reddit");
        listaSite.imprimir();

    }
}
