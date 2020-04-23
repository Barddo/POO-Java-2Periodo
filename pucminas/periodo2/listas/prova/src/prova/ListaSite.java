package prova;

public class ListaSite {
    private CelulaSite primeiro;
    private CelulaSite ultimo;

    public ListaSite() {
        primeiro = new CelulaSite();

        ultimo = primeiro;
    }

    public void inserirFinal(Site st) {
        CelulaSite aux = new CelulaSite();

        ultimo.proximo = aux;

        aux.item = st;

        ultimo = ultimo.proximo;
    }

    public void inserirIncio(Site st) {
        CelulaSite aux = new CelulaSite();

        aux = primeiro.proximo;

        primeiro.proximo = new CelulaSite();
        primeiro.proximo.item = st;

        primeiro.proximo.proximo = aux;
    }

    public Site retirar(String nome) {
        CelulaSite aux, anterior;

        anterior = primeiro;

        aux = primeiro.proximo;

        while (aux != null) {
            if (aux.item.getNome() == nome) {
                anterior.proximo = aux.proximo;

                if (aux == ultimo) {
                    ultimo = anterior;
                }
                return aux.item;
            } else {
                anterior = aux;
                aux = aux.proximo;
            }
        }
        return null;
    }

    public Site localizaEInsereNoInicio(String nome) {
        Site siteLocalizado = localizar(nome);
        retirar(nome);
        inserirIncio(siteLocalizado);
        return siteLocalizado;
    }

    public Site localizar(String nome) {
        CelulaSite aux;

        aux = primeiro.proximo;

        while (aux != null) {
            if (aux.item.getNome() == nome) {
                return aux.item;
            } else {
                aux = aux.proximo;
            }
        }
        return null;
    }

    public Boolean listaVazia() {
        if (primeiro == ultimo) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        CelulaSite aux;

        aux = primeiro.proximo;

        if (aux == null) {
            System.out.println("A lista está vazia.");
        } else {
            while (aux != null) {
                System.out.println("Nome: " + aux.item.getNome() + ", Link: " + aux.item.getLink());

                aux = aux.proximo;
            }
        }
    }
}
