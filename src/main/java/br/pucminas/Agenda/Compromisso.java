package br.pucminas.Agenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Compromisso
 */
public class Compromisso {
    private String nome;
    Calendar data = new GregorianCalendar();

    public Compromisso(String nome) {
        this.nome = nome;
    }

    public Compromisso(String nome, int day, int month, int year) {
        this.nome = nome;
        setData(year, month, day);
    }

    public String getNome() {
        return this.nome;
    }

    public Calendar getData() {
        return this.data;
    }

    public void setData(int day, int month, int year) {
        this.data.set(year, month, day);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Compromisso nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Compromisso: " + getNome() + ",\nMarcado para: " + getData();
    }

}