package br.pucminas.periodo2.Agenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Compromisso
 */
public class Compromisso {
    final Calendar data = new GregorianCalendar();
    private String nome;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData() {
        return this.data;
    }

    public void setData(int day, int month, int year) {
        this.data.set(year, month, day);
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
