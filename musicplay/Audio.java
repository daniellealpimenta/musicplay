package musicplay;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private String classificacao;

    public Audio(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void reproduzir() {
        this.totalDeReproducoes += 150;
    }

    public void curtir(){
        this.curtidas += 100;
    }

    public void classificar() {
        if (totalDeReproducoes >= 1000) {
            this.classificacao = "★★★★★";
        } else if (totalDeReproducoes < 1000 && totalDeReproducoes >= 800) {
            this.classificacao = "★★★★";
        } else if (totalDeReproducoes < 800 && totalDeReproducoes >= 600) {
            this.classificacao = "★★★";
        } else if (totalDeReproducoes < 600 && totalDeReproducoes >= 400) {
            this.classificacao = "★★";
        } else if (totalDeReproducoes < 400 && totalDeReproducoes >= 200) {
            this.classificacao = "★";
        } else {
            this.classificacao = "";
        }
    }

    public void exibirDados(){
        System.out.println("\nNome: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " min");
        System.out.println("Total de Reproduções: " + getTotalDeReproducoes());
        System.out.println("Total de Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());
    }
}
