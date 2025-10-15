package academy.devdojo.javaoneforall.javacore.wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
//      BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("folder2/new.txt");
        boolean isCreatedFile = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("folder2/new_path.txt ");
        FileTime filetime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.createFile(path);
        Files.setLastModifiedTime(path, filetime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
