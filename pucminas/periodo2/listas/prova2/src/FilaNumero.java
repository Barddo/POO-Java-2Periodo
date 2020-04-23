
public class FilaNumero {

    private CelulaNumero frente;
    private CelulaNumero tras;

    public FilaNumero() {
        CelulaNumero cli;

        cli = new CelulaNumero();
        frente = cli;
        tras = cli;
    }

    public Boolean filaVazia() {
        return frente == tras;
    }

    public void enfileirar(Numero cli) {
        tras.proximo = new CelulaNumero();

        tras = tras.proximo;
        tras.item = cli;
    }

    public Numero desenfileirar() {

        CelulaNumero aux;
        Numero cli;

        if (!(filaVazia())) {
            aux = frente.proximo;

            frente.proximo = aux.proximo;

            cli = aux.item;
            aux.proximo = null;

            if (aux == tras)
                tras = frente;

            return (cli);
        }
        return null;
    }

    public FilaNumero desenfileirarPares() {
        FilaNumero auxFila = new FilaNumero();

        int index = 1;
        CelulaNumero cliente = frente.proximo;
        while (cliente != null) {
            if (index % 2 == 0) {
                auxFila.enfileirar(cliente.item);
            }
            cliente = cliente.proximo;
            index++;
        }
        return auxFila;
    }

    public FilaNumero desenfileirarImpares() {
        FilaNumero auxFila = new FilaNumero();

        int index = 1;
        CelulaNumero cliente = frente.proximo;
        while (cliente != null) {
            if (index % 2 == 1) {
                auxFila.enfileirar(cliente.item);
            }
            cliente = cliente.proximo;
            index++;
        }
        return auxFila;
    }

    public Numero obterPrimeiro() {
        return frente.proximo.item;
    }

    public void imprimir() {
        CelulaNumero cliente = frente.proximo;
        do {
            System.out.println(cliente.item.getNum());
            cliente = cliente.proximo;
        } while (cliente != null);
    }
}
