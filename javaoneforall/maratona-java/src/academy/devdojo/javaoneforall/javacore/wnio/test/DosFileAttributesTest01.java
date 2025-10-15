package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/test.txt");
        if (Files.notExists(path)) Files.createFile(path);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        Files.setAttribute(path, "dos:hidden", false);
        Files.setAttribute(path, "dos:readonly", false);

        System.out.println("file is hidden: " + dosFileAttributes.isHidden());
        System.out.println("file is only read: " + dosFileAttributes.isReadOnly());

        System.out.println("========================");

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println("file is hidden: " + fileAttributeView.readAttributes().isHidden());
        System.out.println("file is only read: " + fileAttributeView.readAttributes().isReadOnly());

    }
}
