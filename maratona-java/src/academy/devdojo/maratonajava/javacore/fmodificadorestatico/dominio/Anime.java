package academy.devdojo.maratonajava.javacore.fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de iniciealização é executado quando a JVM carregar classe
    // 1 - Alocado espaço em memoria para o objeto
    // 2 - Cada atribuito de classe é criado e inicializado com valores default ou o que quer que seja passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização estatico");
        episodios = new int[48];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização não-estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
