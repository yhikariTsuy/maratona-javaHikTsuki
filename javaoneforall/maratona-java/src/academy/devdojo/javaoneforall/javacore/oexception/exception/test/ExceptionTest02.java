package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        createNewFile();
    }

    private static void createNewFile() throws IOException{
        File file = new File("C:\\Users\\Hitori\\Documents\\Java\\maratona-java-main\\maratona-java\\file\\test.txt");
        try{
            boolean isCreate = file.createNewFile();
            System.out.println("Created File " + isCreate);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
