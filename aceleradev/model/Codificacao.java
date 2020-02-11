package br.aceleradev.charles.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * codificacao
 */
public class Codificacao {

    final JSONObject json;
    private final String token = "locked";
    private final String url = "https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=" + token;

    public Codificacao() throws JSONException {
        ///////// Lê a API do AceleraDev
        // json = this.readJsonFromUrl();
        ///////// Cria o JSON
        json = new JSONObject();
        json.put("numero_casas", 7);
        json.put("token", token);
        json.put("cifrado",
            "lclyf ipn jvtwbapun kpzhzaly ohz jvtl myvt ahrpun avv thuf pklhz huk wbaapun aolt pu vul wshjl. nvykvu ilss");
        String decodificado = this.decodifica(json.get("cifrado").toString());
        String sha1 = null;
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
            String path = "/home/charl3ff/Music/answer.json";
            FileWriter fw = new FileWriter(new File(path));
            fw.write(json.toString());
            fw.close();
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
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
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
        int numero_casas = 7;
        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < textoCodificado.length(); i++) {
            char c = textoCodificado.charAt(i);
            if (97 <= c && c < 123) {
                c = (char) ((c - numero_casas + 7) % 26 + 97);
            } else if (65 <= c && c < 91) {
                c = ((char) ((c - numero_casas + 13) % 26 + 65));
            } else {
                c = (textoCodificado.charAt(i));
            }
            aux.append(c);
        }
        return aux.toString();
    }
}
