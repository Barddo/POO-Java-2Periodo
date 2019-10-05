package br.pucminas.atvlab.Encapsulamento.teste;

public class LivroFisico extends Livro {

    public LivroFisico() {
        super();
    }

    @Override
    public void setPreco(double custo) {
        super.setCusto(custo + (paginas * 0.03));
        super.comissao = (float) (super.custo * 0.08);
        super.setPreco(custo + comissao);
    }
}
