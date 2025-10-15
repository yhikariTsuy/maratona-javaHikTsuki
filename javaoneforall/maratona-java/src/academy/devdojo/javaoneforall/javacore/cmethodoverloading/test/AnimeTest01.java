package academy.devdojo.javaoneforall.javacore.cmethodoverloading.test;

import academy.devdojo.javaoneforall.javacore.cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Evangelion", "TV", 24, "Drama");
        anime.imprime();

    }
}
