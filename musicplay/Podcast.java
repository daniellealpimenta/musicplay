package musicplay;

public class Podcast extends Audio{

    private String tema;
    private String convidado;
    private boolean temPatrocinio;

    public Podcast(String titulo, double duracao, String tema, String convidado, boolean temPatrocinio) {
        super(titulo, duracao);
        this.tema = tema;
        this.convidado = convidado;
        this.temPatrocinio = temPatrocinio;
    }

    public String getTema() {
        return tema;
    }

    public String getConvidado() {
        return convidado;
    }

    public boolean isTemPatrocinio() {
        return temPatrocinio;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("O tema do Podcast é: " + getTema());
        System.out.println("O convidado da vez é: " + getConvidado());
        System.out.println("Tem patrocínio no PodCast? " + (isTemPatrocinio() ? "sim" : "não"));
    }
}
