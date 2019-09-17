package br.pucminas.Agenda;

import java.util.ArrayList;

/**
 * Agenda
 */
public class Agenda {
    private ArrayList<ContatoBasico> contatos;

    Agenda() {
        contatos = new ArrayList<ContatoBasico>();
    }

    public void inserir(ContatoBasico c) {
        contatos.add(c);
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