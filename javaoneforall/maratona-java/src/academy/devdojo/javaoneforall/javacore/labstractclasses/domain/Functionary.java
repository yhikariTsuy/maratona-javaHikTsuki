package academy.devdojo.javaoneforall.javacore.labstractclasses.domain;

public abstract class Functionary extends Person {
    protected String nome;
    protected double salario;

    public Functionary(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonificacao();
    }

    public abstract void calculaBonificacao();

    @Override
    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
