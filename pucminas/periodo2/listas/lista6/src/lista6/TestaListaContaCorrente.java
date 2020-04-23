package lista6;

public class TestaListaContaCorrente {
    
    public static void main(String[] args) {
        ContaCorrente cc;
        ListaContaCorrente banco, bancoNovo, bancoCopia;
        banco = new ListaContaCorrente();
        cc = new ContaCorrente("Eveline", 36, 707, 500.00);
        banco.inserirFinal(cc);
        cc = new ContaCorrente("João", 45, 801, 500.00);
        banco.inserirFinal(cc);
        cc = new ContaCorrente("José", 71, 917, 900.00);
        banco.inserirFinal(cc);
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: João, Agência: 45, Número da conta-corrente: 801, Saldo atual: 500.00
        // Titular: José, Agência: 71, Número da conta-corrente: 917, Saldo atual: 900.00
        banco.depositar(801, 500.00);
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: João, Agência: 45, Número da conta-corrente: 801, Saldo atual: 1000.00
        // Titular: José, Agência: 71, Número da conta-corrente: 917, Saldo atual: 900.00
        bancoNovo = new ListaContaCorrente();
        cc = new ContaCorrente("Ana", 70, 17, 700.00);
        bancoNovo.inserirFinal(cc);
        banco.concatenar(bancoNovo);
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: João, Agência: 45, Número da conta-corrente: 801, Saldo atual: 1000.00
        // Titular: José, Agência: 71, Número da conta-corrente: 917, Saldo atual: 900.00
        // Titular: Ana, Agência: 70, Número da conta-corrente: 17, Saldo: 700.00
        System.out.println(
                "A instituição financeira apresenta " + banco.obterNumContasCorrentes() + " contas-correntes.");
        // 4 contas-correntes.
        bancoCopia = banco.copiar();
        System.out.println("Contas-correntes presentes na cópia do banco:");
        bancoCopia.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: João, Agência: 45, Número da conta-corrente: 801, Saldo atual: 1000.00
        // Titular: José, Agência: 71, Número da conta-corrente: 917, Saldo atual: 900.00
        // Titular: Ana, Agência: 70, Número da conta-corrente: 17, Saldo: 700.00
        banco.eliminarContasCorrentesPosicoesPares();
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        // Titular: José, Agência: 71, Número da conta-corrente: 917, Saldo atual: 900.00
        banco.eliminarContasCorrentesPosicoesPares();
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
        banco.eliminarContasCorrentesPosicoesPares();
        System.out.println("Contas-correntes presentes no banco:");
        banco.imprimir();
        // Titular: Eveline, Agência: 36, Número da conta-corrente: 707, Saldo atual: 500.00
    }
}
