package academy.devdojo.javaoneforall.javacore.dcontructor.test;

import academy.devdojo.javaoneforall.javacore.dcontructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Evangelion", "TV", 24, "Drama", "Gainax");
        anime.imprime();
        System.out.println("=================");

    }
}
