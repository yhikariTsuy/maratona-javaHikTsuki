package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.Reader1;
import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
