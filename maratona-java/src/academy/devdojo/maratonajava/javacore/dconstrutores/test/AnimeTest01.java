package academy.devdojo.maratonajava.javacore.dconstrutores.test;

import academy.devdojo.maratonajava.javacore.dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Evangelion", "TV", 24, "Drama", "Gainax");
        anime.imprime();
        System.out.println("=================");

    }
}
