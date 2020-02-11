package br.pucminas.periodo2.Agenda;

import java.util.Calendar;

public class Contato extends ContatoBasico {
    protected final Calendar dataNascimento;

    public Contato(String nome, Calendar dataNascimento) {
        super(nome);
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getDados() {
        return super.getDados() + "Nascido em " + dataNascimento.get(Calendar.DATE) + "/"
            + dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR) + "\nIdade: ";
    }

}
