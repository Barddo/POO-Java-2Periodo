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
        this.imposto = (imposto / 100);
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
}