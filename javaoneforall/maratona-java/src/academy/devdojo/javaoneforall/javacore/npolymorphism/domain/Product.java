package academy.devdojo.javaoneforall.javacore.npolymorphism.domain;

public abstract class Product implements Tax {
    protected String nome;
    protected double valor;

    public Product(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
