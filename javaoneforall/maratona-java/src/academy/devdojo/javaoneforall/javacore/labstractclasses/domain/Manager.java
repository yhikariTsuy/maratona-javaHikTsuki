package academy.devdojo.javaoneforall.javacore.labstractclasses.domain;

public class Manager extends Functionary {
    public Manager(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaBonificacao() {
       this.salario += salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
