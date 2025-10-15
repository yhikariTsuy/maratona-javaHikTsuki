package academy.devdojo.javaoneforall.javacore.vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Folder Created: " + isDirectoryCreated);
        File fileInDirectory = new File(fileDirectory, "file.txt");
        boolean isFileCreated = fileInDirectory.createNewFile();
        System.out.println("File Created: " + isFileCreated);

        File fileRenamed = new File(fileDirectory, "file_renamed.txt");
        boolean isRenamed = fileInDirectory.renameTo(fileRenamed);
        System.out.println("File Renamed: " + isRenamed);

        File directoryRenamed = new File("folder_renamed");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Directory Renamed: " + isDirectoryRenamed);
    }
}
