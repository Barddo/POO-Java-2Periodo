import java.time.LocalDateTime;
import java.time.Month;

public class TestaFila {

    public static void main(String[] args) {
        Cliente cli;
        FilaCliente filaLanchonete;
        filaLanchonete = new FilaCliente();
        cli = new Cliente("Eveline", LocalDateTime.of(2019, Month.FEBRUARY, 26, 20, 50, 00));
        filaLanchonete.enfileirar(cli);
        cli = new Cliente("João", LocalDateTime.of(2019, Month.FEBRUARY, 26, 20, 53, 25));
        filaLanchonete.enfileirar(cli);
        cli = new Cliente("Ana", LocalDateTime.of(2019, Month.FEBRUARY, 26, 20, 54, 17));
        filaLanchonete.enfileirar(cli);
        System.out.println("Os clientes presentes na fila são, nessa ordem:");
        filaLanchonete.imprimir(); // Eveline João Ana

        System.out.println("Existem " + filaLanchonete.obterNumClientesAFrente("Ana") +
            " clientes à frente do cliente Ana"); // 2 clientes
        System.out.println("Existem " + filaLanchonete.obterNumClientesAFrente("João") +
            " clientes à frente do cliente João"); // 1 cliente
        System.out.println("Existem " + filaLanchonete.obterNumClientesAFrente("Eveline") +
            " clientes à frente do cliente Eveline"); // 0 clientes

        System.out.println("Os clientes esperaram, em média, " +
            filaLanchonete.obterTempoMedioEspera()/60 + " segundos na fila.");

        FilaCliente fila2 = filaLanchonete.copiar();
        System.out.println("Os clientes presentes na fila cópia são, nessa ordem:");
        fila2.imprimir(); // Eveline João Ana
    }
}
