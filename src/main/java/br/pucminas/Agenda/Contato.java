package br.pucminas.Agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato extends ContatoBasico {
    protected Calendar dataNascimento;
    protected ArrayList<Compromisso> compromissos;

    public Contato(String nome, Calendar dataNascimento) {
        super(nome);
        this.dataNascimento = dataNascimento;
    }

    public void adicionaCompromisso(String nome, int dia, int mes, int ano, int repeticaoDias, int vezes) {
        Compromisso compromisso = new Compromisso(nome, dia, mes, ano);
        compromissos.add(compromisso);
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.DATE, dia);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.YEAR, ano);
        if (repeticaoDias != 0) {
            for (int i = 0; i < vezes; i++) {
                cal.roll(Calendar.DATE, repeticaoDias);
                compromissos.add(
                        new Compromisso(nome, cal.get(Calendar.DATE), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR)));
            }
        }
    }

    public void adicionaCompromisso(String nome, int dia, int mes, int ano) {
        Compromisso compromisso = new Compromisso(nome, dia, mes, ano);
        compromissos.add(compromisso);
    }

    public String imprimeCompromissos() {
        StringBuilder aux = new StringBuilder();
        while (compromissos.iterator().hasNext()) {
            aux.append(compromissos.toString());
        }
        return aux.toString();
    }

    @Override
    public String getDados() {
        return super.getDados() + "Nascido em " + dataNascimento.get(Calendar.DATE) + "/"
                + dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR) + "\nIdade: ";
    }

}