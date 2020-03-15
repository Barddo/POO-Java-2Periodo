package lista4;

public class Caractere {

    private char letra;

    Caractere() {
        letra = ' ';
    }

    Caractere(char l) {
        letra = l;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char l) {
        letra = l;
    }

    @Override
    public String toString() {
        return String.valueOf(letra);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caractere)) return false;

        Caractere caractere = (Caractere) o;

        return letra == caractere.letra;
    }

    @Override
    public int hashCode() {
        return letra;
    }
}
