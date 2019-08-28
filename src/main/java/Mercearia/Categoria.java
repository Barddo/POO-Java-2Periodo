package Mercearia;

/**
 * Bebidas, 33% Comida, 18% Material de limpeza, 25%
 */
public enum Categoria {
    COMIDA("Comida", 33), BEBIDA("Bebida", 18), MATERIALLIMPEZA("Material de Limpeza", 25);

    private String descricao;
    private float imposto;

    Categoria(String descricao, float imposto) {
        this.descricao = descricao;
        this.imposto = imposto;
    }

    /**
     * @param {} the descricao
     */
    public void adicionaProduto(String nome, float custo, float imposto) {
        Produto prod = new Produto(nome, custo, imposto);
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the imposto
     */
    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
}