
public class TestaListaContaCorrente {

    public static void main(String[] args) {
        ContaCorrente cc;
        ListaContaCorrente banco;
        banco = new ListaContaCorrente();
        cc = new ContaCorrente("Eveline", 36, 707, 500.00);
        banco.inserirFinal(cc);
        cc = new ContaCorrente("João", 45, 801, 500.00);
        banco.inserirFinal(cc);
        cc = new ContaCorrente("José", 71, 917, 1000.00);
        banco.inserirFinal(cc);
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: João, Agência: 45, Número da conta-corrente: 801, Saldo atual: 500.00
        // Titular: José, Agência: 71, Número da conta-corrente: 917, Saldo atual: 1000.00
        banco.sacar(917, 250.0);
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: João, Agência: 45, Número da conta-corrente: 801, Saldo atual: 500.00
        // Titular: José, Agência: 71, Número da conta-corrente: 917, Saldo atual: 750.00
        cc = banco.obterCCMaiorSaldo();
        System.out.println("A conta-corrente de maior saldo é a de número " +
            cc.getNumContaCorrente() + ". Seu saldo é de: " + cc.getSaldo());
        // A conta-corrente de maior saldo é a de número 917. Seu saldo é de: 750.00.
        cc = banco.retirarFinal();
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: João, Agência: 45, Número da conta-corrente: 801, Saldo atual: 500.00
    }

}
