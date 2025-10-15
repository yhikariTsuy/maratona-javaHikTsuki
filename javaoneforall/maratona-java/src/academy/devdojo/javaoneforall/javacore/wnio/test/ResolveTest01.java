package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/hitori");
        Path archive = Paths.get("dev/file.txt");
        Path resolve = dir.resolve(archive);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/hitori");
        Path relative = Paths.get("dev");
        Path file = Paths.get("/file.txt");


        System.out.println("| 1 : " + absolute.resolve(relative));
        System.out.println("| 2 : " + absolute.resolve(file));
        System.out.println("| 3 : " + relative.resolve(absolute));
        System.out.println("| 4 : " + relative.resolve(file));
        System.out.println("| 5 : " + file.resolve(absolute));
        System.out.println("| 6 : " + file.resolve(relative));

    }
}
