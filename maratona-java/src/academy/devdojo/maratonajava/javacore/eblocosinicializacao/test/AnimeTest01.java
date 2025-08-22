package academy.devdojo.maratonajava.javacore.eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
