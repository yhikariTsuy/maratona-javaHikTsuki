package academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain;

public class Functionary {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : this.salarios) {
                System.out.print(salario + " ");
            }
        }
        mediaDosSalarios();
    }

    public void mediaDosSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : this.salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia Salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double[] getSalarios() {
        return salarios;
    }
    public double getMedia() {
        return media;
    }
}


