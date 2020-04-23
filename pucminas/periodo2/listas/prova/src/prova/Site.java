package prova;

public class Site {

    private String link;
    private String nome;

    public Site(String nome, String link) {
        this.link = link;
        this.nome = nome;
    }

    public Site() {

    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
