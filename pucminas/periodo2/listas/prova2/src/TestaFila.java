
public class TestaFila {

    public static void main(String[] args) {
        FilaNumero filaNumero = new FilaNumero();
        filaNumero.enfileirar(new Numero(2));
        filaNumero.enfileirar(new Numero(1));
        filaNumero.enfileirar(new Numero(4));
        filaNumero.enfileirar(new Numero(3));
        filaNumero.enfileirar(new Numero(6));
        filaNumero.enfileirar(new Numero(5));
        filaNumero.enfileirar(new Numero(8));
        filaNumero.enfileirar(new Numero(7));

        filaNumero.imprimir();
        System.out.println("------------------------------------------");

        System.out.println("indices pares: ");
        FilaNumero filaPares = filaNumero.desenfileirarPares();
        filaPares.imprimir();
        System.out.println("------------------------------------------");

        System.out.println("indices impares: ");
        FilaNumero filaImpares = filaNumero.desenfileirarImpares();
        filaImpares.imprimir();
        System.out.println("------------------------------------------");

    }
}
