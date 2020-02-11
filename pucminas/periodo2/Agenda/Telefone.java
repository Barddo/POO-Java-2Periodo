package br.pucminas.periodo2.Agenda;

public class Telefone {
    private final String numero;
    private final String tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getTelefone() {
        return numero + " " + tipo;
    }
}
