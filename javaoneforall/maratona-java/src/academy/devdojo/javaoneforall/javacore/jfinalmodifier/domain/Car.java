package academy.devdojo.javaoneforall.javacore.jfinalmodifier.domain;

public class Car {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Buyer Buyer = new Buyer();

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
