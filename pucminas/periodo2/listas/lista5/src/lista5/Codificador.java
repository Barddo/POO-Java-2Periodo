package lista5;

public class Codificador {

    public String codifica(String textoCodificado) {
        int numero_casas = 7;
        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < textoCodificado.length(); i++) {
            char c = textoCodificado.charAt(i);
            if (97 <= c && c < 123) {
                c = (char) ((c + numero_casas + 7) % 26 + 97);
            } else if (65 <= c && c < 91) {
                c = ((char) ((c + numero_casas + 13) % 26 + 65));
            } else {
                c = (textoCodificado.charAt(i));
            }
            aux.append(c);
        }
        return aux.toString();
    }
}
