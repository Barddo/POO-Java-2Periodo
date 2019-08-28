package Mercearia;

/**
 * Produto
 */
public class Produto {

    private String nome;
    private float custo;
    Categoria categoria;

    public Produto(String nome,float custo,float imposto) {
        this.nome = nome;
        this.custo =custo;
        this.categoria.setImposto(imposto);
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
     * @return the imposto
     */
    public float getImposto() {
        return categoria.getImposto();
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }
}