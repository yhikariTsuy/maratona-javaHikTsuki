package academy.devdojo.javaoneforall.javacore.npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.npolymorphism.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados...");
    }
}
