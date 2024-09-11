package musicplay;

public class Musica extends  Audio{

    private String autor;
    private String genero;

    public Musica(String titulo, double duracao, String autor, String genero) {
        super(titulo, duracao);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("O autor é: " + getAutor());
        System.out.println("O gênero é: " + getGenero());
    }
}
