package app;

public class App {

    int comparacoesSeq = 0;

    int comparacoesBin = 0;

    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////

        int tamVetor = 10_000_000;
        // maior que isso pode estourar a memória da JVM.
        Produto[] vet = new Produto[tamVetor];

        int procurado = tamVetor - 10;
        ///////////////////////////////////////////////////////////

        for (int i = 0; i < tamVetor; i++) {
            vet[i] = new Produto(i, "Produto " + i, i * (i * 5 / 2 + 3) / 90);
        }

        App app = new App();

        long timeStart = System.currentTimeMillis();

        Produto sequencial = app.pesquisaSequencial(vet, procurado);

        System.out.println("Produto encontrado: " + sequencial);
        System.out.println("A pesquisa sequencial durou " + (System.currentTimeMillis() - timeStart)
            + " milissegundos");
        System.out.println("E foram feitas " + app.comparacoesSeq + " comparacoes");
        System.out
            .println("----------------------------------------------------------------------");
        long timeStartBin = System.currentTimeMillis();

        Produto binaria = app.pesquisaBinaria(vet, procurado, 0, tamVetor);

        System.out.println("Produto encontrado: " + binaria);
        System.out.println("A pesquisa binaria durou " + (System.currentTimeMillis() - timeStartBin)
            + " milissegundos");
        System.out.println("E foram feitas " + app.comparacoesBin + " comparacoes");
    }

    public Produto pesquisaSequencial(Produto[] vet, int codBarra) {

        for (Produto produto : vet) {
            comparacoesSeq++;
            if (produto.codBarra == codBarra) {
                return produto;
            }
        }
        return null;
    }

    public Produto pesquisaBinaria(Produto[] vet, int codBarra, int inicio, int fim) {
        comparacoesBin++;
        if (inicio > fim) {
            return null;
        }
        int meio = (inicio + fim) / 2;
        if (vet[meio].codBarra == codBarra) {
            return vet[meio];
        }

        if (codBarra > meio) {
            return pesquisaBinaria(vet, codBarra, meio + 1, fim);
        }

        if (codBarra < meio) {
            return pesquisaBinaria(vet, codBarra, inicio, meio - 1);
        }
        return null;
    }
}
