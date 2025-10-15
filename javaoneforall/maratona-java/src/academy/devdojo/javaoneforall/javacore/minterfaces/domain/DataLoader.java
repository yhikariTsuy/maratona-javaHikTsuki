package academy.devdojo.javaoneforall.javacore.minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões...");
    }
}
