package br.pucminas.periodo2.Mercearia;

/**
 * Produto
 */
public class Produto {

    private final String nome;
    private final float custo;
    private double imposto;
    private String categoria;

    public Produto(String nome, float custo, String categoria) {
        this.nome = nome;
        this.custo = custo;
        this.setImposto(categoria);

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
    public String getCategoria() {
        return categoria;
    }

    /**
     * @return the imposto
     */
    public double getImposto() {
        return this.custo * imposto;
    }

    public void setImposto(String categoria) {
        switch (categoria.toLowerCase()) {
            case "comida":
                this.imposto = Categoria.COMIDA.getImposto();
                this.categoria = Categoria.COMIDA.getDescricao();
                break;
            case "bebida":
                this.imposto = Categoria.BEBIDA.getImposto();
                this.categoria = Categoria.BEBIDA.getDescricao();
                break;
            case "material de limpeza":
                this.imposto = Categoria.MATERIALLIMPEZA.getImposto();
                this.categoria = Categoria.MATERIALLIMPEZA.getDescricao();
                break;
            default:
                this.imposto = 1000000;
                break;
        }
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }
}
