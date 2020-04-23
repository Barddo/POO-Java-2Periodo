package app;

public class Produto {

    double preco;
    int codBarra;
    String nome;

    public Produto(int codBarra, String nome, double preco) {
        this.codBarra = codBarra;
        this.nome = nome;
        this.preco = preco;
    }

	public int getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(int codBarra) {
		this.codBarra = codBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

    @Override
    public String toString() {
        return "Produto{" +
            "preco=" + preco +
            ", codBarra=" + codBarra +
            ", nome='" + nome + '\'' +
            '}';
    }
}
