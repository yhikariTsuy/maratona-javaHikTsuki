package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Arthur");
        funcionario.setIdade(32);
        funcionario.setSalarios(new double []{1200, 987.32, 2000});

        funcionario.imprime();
        System.out.println("Media: " + funcionario.getMedia());
    }
}
