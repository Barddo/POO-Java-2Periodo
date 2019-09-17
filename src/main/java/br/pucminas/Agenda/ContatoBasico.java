package br.pucminas.Agenda;

import java.util.ArrayList;

abstract public class ContatoBasico {
    protected String nome;
    protected ArrayList<Telefone> telefones;

    public ContatoBasico() {
        nome = "";
        telefones = new ArrayList<Telefone>();
    }

    public ContatoBasico(String nome) {
        this.nome = nome;
        telefones = new ArrayList<Telefone>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public String getDados() {
        String s = nome + "\n";
        for (Telefone t : telefones) {
            s += t.getTelefone() + "\n";
        }
        return s;
    }
}