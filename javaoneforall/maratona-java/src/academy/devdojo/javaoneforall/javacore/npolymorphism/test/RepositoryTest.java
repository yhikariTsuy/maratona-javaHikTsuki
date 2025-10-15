package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.npolymorphism.service.RepositoryFile;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryFile();
        repository.salvar();

    }
}
