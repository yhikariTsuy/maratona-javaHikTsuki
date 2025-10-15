package academy.devdojo.javaoneforall.javacore.einicializationblock.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memoria para o objeto
    // 2 - Cada atribuito de classe é criado e inicializado com valores default ou o que quer que seja passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        episodios = new int[24];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
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
