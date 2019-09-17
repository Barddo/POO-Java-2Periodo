package br.pucminas.Agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Agenda
 */
public class Agenda {
    private ArrayList<ContatoBasico> contatos;
    protected ArrayList<Compromisso> compromissos;

    Agenda() {
        contatos = new ArrayList<ContatoBasico>();
    }

    public void inserir(ContatoBasico c) {
        contatos.add(c);
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
        int i = 0;
        while (compromissos.iterator().hasNext()) {
            aux.append(compromissos.get(i).toString());
            i++;
        }
        return aux.toString();
    }

    public ContatoBasico buscar(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            ContatoBasico c = contatos.get(i);
            if (c.getNome().equalsIgnoreCase(nome))
                return contatos.get(i);
        }
        return null;
    }

    public ContatoBasico buscar(int pos) {
        if (pos >= 0 && pos < contatos.size()) {
            return contatos.get(pos);
        }
        return null;
    }

    public Contato[] buscarTodos(String palavraChave) {
        ArrayList<ContatoBasico> todos = new ArrayList<ContatoBasico>();
        for (int i = 0; i < contatos.size(); i++) {
            ContatoBasico contato = contatos.get(i);
            if (contato.getDados().contains(palavraChave))
                todos.add(contato);
        }
        Contato[] vet = new Contato[todos.size()];

        return (todos.toArray(vet));
    }

    public Contato[] buscarTodos() {
        Contato[] vet = new Contato[contatos.size()];

        return (contatos.toArray(vet));
    }

    public int getQuantidade() {
        return contatos.size();
    }
}
