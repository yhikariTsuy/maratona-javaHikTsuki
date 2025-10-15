package academy.devdojo.javaoneforall.javacore.minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
//    private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do banco de dados...");
    }

}
