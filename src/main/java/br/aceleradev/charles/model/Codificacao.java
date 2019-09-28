package br.aceleradev.charles.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * codificacao
 */
public class Codificacao {

    private String token = "51a6e418c369a7c376c178e4c5a7eaca4a4add7b";
    private String path = "/home/charl3ff/Music/answer.json";
    private String url = "https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=" + token;
    JSONObject json;

    public Codificacao() throws JSONException, IOException {
        json = this.readJsonFromUrl();
        String decodificado = this.decodifica(json.get("cifrado").toString());
        String sha1= null;
        try {
            sha1 = this.geraSha1(decodificado);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        json.put("decifrado", decodificado);
        json.put("resumo_criptografico", sha1);
        this.salvaJSON(json);
    }

    public void salvaJSON(JSONObject json) {
        try {
            json.write(new FileWriter(new File(path))).append(json.toString()).close();
        } catch (JSONException e) {
            System.err.println("JSON Expection");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Impossível ler o JSON");
            e.printStackTrace();
        }
    }

    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public JSONObject readJsonFromUrl() throws IOException, JSONException {
        InputStream is = new URL(this.url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public String geraSha1(String decodificado) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(decodificado.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public String decodifica(String textoCodificado) {
        int asciiConstant = 32;
        int biggerUpperCase = 90;
        int numero_casas = 7;
        int numeroAlfabeto = 26;
        StringBuilder aux = new StringBuilder();
        char alphabet;
        for (int i = 0; i < textoCodificado.length(); i++) {
            alphabet = textoCodificado.charAt(i);
            if (Character.isLetter(alphabet)) {
                if (Character.isUpperCase(alphabet) && alphabet > (biggerUpperCase - numero_casas)) {
                    alphabet = (char) ((alphabet - numeroAlfabeto) + numero_casas);
                } else {
                    if (Character.isLowerCase(alphabet)
                            && alphabet > ((biggerUpperCase + asciiConstant) - numero_casas)) {
                        alphabet = (char) ((alphabet - numeroAlfabeto) + numero_casas);
                    }
                }
                aux.append(textoCodificado.replace(alphabet, (char) (alphabet + numero_casas)).charAt(i));
            } else {
                aux.append(alphabet);
            }
        }
        return aux.toString();
    }
}
