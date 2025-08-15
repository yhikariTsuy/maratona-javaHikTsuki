package academy.devdojo.maratonajava.javacore.csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Evangelion", "TV", 24, "Drama");
        anime.imprime();

    }
}
