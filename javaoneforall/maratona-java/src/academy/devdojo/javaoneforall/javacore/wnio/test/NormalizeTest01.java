package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directoryProject = "home/hitori/dev";
        String fileTxt = "../../file.txt";
        Path path1 = Paths.get(directoryProject, fileTxt);
        System.out.println("Path: " + path1);
        System.out.println("Path: " + path1.normalize());
        Path path2 = Paths.get("/home/./hitori/./dev");
        System.out.println("Path: " + path2);
        System.out.println("Path: " + path2.normalize());

    }
}
