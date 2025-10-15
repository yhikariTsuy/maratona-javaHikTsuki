package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/hitori");
        Path clazz = Paths.get("/home/hitori/devdojofoda/HelloWorld.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println("Path: " + pathToClazz);

        Path absolute1 = Paths.get("/home/hitori");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/hitori/devdojofoda/HelloWorld.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.203102");

        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1));
        System.out.println("3 " + absolute1.relativize(absolute2));
        System.out.println("4 " + relative1.relativize(relative2));
    }
}
