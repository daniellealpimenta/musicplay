import musicplay.Musica;
import musicplay.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Bereanos", 4.37, "Kami Kam", "Rap Gospel");
        Podcast podcast1 = new Podcast("Como seguir uma Carreira em Python?",240.0,"Python","Hashtag", true);

        musica1.reproduzir();
        musica1.reproduzir();
        musica1.reproduzir();
        musica1.reproduzir();
        musica1.reproduzir();
        musica1.reproduzir();
        musica1.reproduzir();
        musica1.reproduzir();

        musica1.curtir();
        musica1.curtir();
        musica1.curtir();
        musica1.curtir();
        musica1.curtir();
        musica1.curtir();

        musica1.classificar();

        musica1.exibirDados();

        podcast1.reproduzir();
        podcast1.reproduzir();
        podcast1.reproduzir();
        podcast1.reproduzir();

        podcast1.curtir();
        podcast1.curtir();
        podcast1.curtir();

        podcast1.classificar();

        podcast1.exibirDados();
    }
}