package academy.devdojo.javaoneforall.javacore.labstractclasses.domain;

public class Developer extends Functionary {

    public Developer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonificacao() {
        this.salario += salario * 0.5;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
