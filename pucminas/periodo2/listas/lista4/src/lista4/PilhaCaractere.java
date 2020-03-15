package lista4;

public class PilhaCaractere {

    private CelulaCaractere fundo; // referência à célula que está no fundo da pilha. Essa célula é utilizada
    // apenas para controle.
    private CelulaCaractere topo; // referência à célula que está no topo da pilha.
    private Caractere apagador;


    // Construtor que cria uma pilha "vazia" inicializando a célula do fundo da
    // pilha e os atributos de controle da pilha (fundo e topo).
    PilhaCaractere() {
        CelulaCaractere aux = new CelulaCaractere();
        fundo = aux;
        topo = aux;
    }

    PilhaCaractere(Caractere apagador) {
        this.apagador = apagador;
        CelulaCaractere aux = new CelulaCaractere();
        fundo = aux;
        topo = aux;
    }

    // Insere o item, passado como parâmetro para esse método, no topo da pilha.
    public void empilhar(Caractere l) {
        if (temApagador() && l.equals(apagador)) {
            desempilhar();
        } else {
            // inserção da nova célula no topo da pilha.
            CelulaCaractere aux = new CelulaCaractere();
            aux.proximo = topo;
            aux.item = l;

            // atualização do atributo de controle topo.
            topo = aux;
        }
    }

    // Retira o item que está no topo da pilha. Se a pilha estiver vazia, esse
    // método deve retornar null; caso contrário, esse método deve retornar o item
    // retirado da pilha.
    public Caractere desempilhar() {
        // se a pilha estiver vazia, esse método deve retornar null.
        Caractere aux = null;

        if (!pilhaVazia()) {
            // aux aponta para o item da pilha que será retornado/desempilhado, ou seja, o
            // item do topo.
            aux = topo.item;

            // atualização do atributo de controle topo.
            topo = topo.proximo;

        }
        return (aux);
    }

    // Verifica se a pilha está vazia. Em caso afirmativo, retorna true e em caso
    // negativo retorna false.
    public Boolean pilhaVazia() {
        // se a pilha apresentar apenas a célula sentinela, ela está vazia.
        return fundo == topo;
    }

    public boolean temApagador() {
        return apagador != null;
    }

    public Caractere obterTopo() {
        return topo.item;
    }

    public int obterNumeroItens() {
        int tamanho = 0;
        CelulaCaractere celula = topo;
        while (celula.proximo != null) {
            celula = celula.proximo;
            tamanho++;
        }
        return tamanho;
    }

    public String imprimir() {
        PilhaCaractere pilhaAux = new PilhaCaractere();
        CelulaCaractere celula = topo;

        while (celula.proximo != null) {
            pilhaAux.empilhar(celula.item);
            celula = celula.proximo;
        }

        return pilhaAux.imprimirInverso();
    }

    public String imprimirInverso() {
        StringBuilder stb = new StringBuilder();
        CelulaCaractere celula = topo;
        while (celula.proximo != null) {
            stb.append(celula.item.getLetra());
            celula = celula.proximo;
        }
        return stb.toString().trim();
    }

    public int obterNumeroItensAcima(char c) {
        int nums = 0;
        CelulaCaractere celula = topo;
        while (celula.proximo != null) {
            if (celula.item.getLetra() == c) {
                break;
            }
            nums++;
            celula = celula.proximo;
        }
        if (nums >= obterNumeroItens()) {
            nums = -1;
        }
        return nums;
    }
}
