package Mercearia;

/**
 * Produto
 */
public class Produto {

    private String nome = "";
    private float custo = 0;
    Categoria categoria;

    public Produto(String nome,float custo, Categoria categoria,float imposto) {
        this.nome = nome;
        this.custo =custo;
        this.categoria = categoria;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }
}