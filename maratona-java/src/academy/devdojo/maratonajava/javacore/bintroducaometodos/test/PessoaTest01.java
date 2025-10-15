package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraiya");
        pessoa.setIdade(70);
        pessoa.imprime();

        //    System.out.println(pessoa.getNome());
        //    System.out.println(pessoa.getIdade());
    }
}
