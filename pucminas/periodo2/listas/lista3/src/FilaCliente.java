import java.time.LocalDateTime;

public class FilaCliente {

    private CelulaCliente frente; // referência ao cliente que está na frente da fila. Esse cliente é utilizado apenas para controle.
    private CelulaCliente tras;   // referência ao cliente que está na última posição da fila.

    // Construtor que cria uma fila vazia inicializando o cliente da frente da fila e os atributos de controle da fila (frente e tras).
    public FilaCliente() {
        CelulaCliente cli;
        LocalDateTime horaChegada;

        horaChegada = LocalDateTime.now();
        cli = new CelulaCliente(" ", horaChegada);
        frente = cli;
        tras = cli;
    }

    // Verifica se a fila está vazia. Em caso afirmativo, retorna true e em caso negativo retorna false.
    public Boolean filaVazia() {
        // Se a fila apresentar apenas o elemento de controle, ela está vazia.
        return frente == tras;
    }

    // Insere o item da fila cli, passado como parâmetro para esse método, no final da fila.
    public void enfileirar(Cliente cli) {
        // inserção do novo cliente no final da fila.
        tras.proximo = new CelulaCliente(" ", LocalDateTime.now());

        // atualização do atributo de controle tras.
        tras = tras.proximo;
        tras.item = cli;
    }

    // Retira o cliente que ocupa a primeira posição da fila. Se a fila estiver vazia, esse método deve retornar null; caso contrário, esse método deve retornar o cliente retirado da fila.
    public Cliente desenfileirar() {

        CelulaCliente aux;
        Cliente cli;

        if (!(filaVazia())) {
            // aux aponta para o cliente da fila que será retornado/desenfileirado, ou seja, o primeiro cliente da fila.
            aux = frente.proximo;

            // atualização do primeiro cliente da fila.
            frente.proximo = aux.proximo;

            cli = aux.item;
            aux.proximo = null;

            if (aux == tras)
                tras = frente;

            return (cli);
        }
        return null;
    }

    public Cliente obterPrimeiro() {
        return frente.proximo.item;
    }

    public int obterNumeroClientes() {
        int cnt = 0;
        CelulaCliente cliente = frente.proximo;
        cnt++;
        while (true) {
            cliente = cliente.proximo;
            if (cliente == null) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    public void imprimir() {
        CelulaCliente cliente = frente;
        do {
            System.out.println(cliente.item.getNome());
            cliente = cliente.proximo;
        } while (cliente != null);
    }

    public void concatenar(FilaCliente fila) {
        CelulaCliente iterate = fila.frente;
        do {
            tras.proximo = iterate;
            iterate = iterate.proximo;
        } while (iterate != null);
    }

    public FilaCliente copiar() {
        FilaCliente clone = new FilaCliente();
        CelulaCliente cliente = frente.proximo;
        while (cliente != null) {
            clone.enfileirar(cliente.item);
            cliente = cliente.proximo;
        }
        return clone;
    }

    public int obterNumClientesAFrente(String nomeCliente) {
        int numClientes = 0;
        CelulaCliente cliente = frente.proximo;
        do {
            if (cliente.item.getNome().equals(nomeCliente))
                break;

            numClientes++;
            cliente = cliente.proximo;
        } while (cliente != null);
        return numClientes;
    }

    public double obterTempoMedioEspera() {
        long segMedio = 0L;
        CelulaCliente cliente = frente.proximo;
        while (cliente.proximo != null) {
            segMedio += cliente.proximo.item.getHorarioChegada().toLocalTime().toSecondOfDay() -
                cliente.item.getHorarioChegada().toLocalTime().toSecondOfDay();
            cliente = cliente.proximo;
        }
        return (double) segMedio / obterNumeroClientes();
    }
}
