package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setNome("Jiraiya");
        person.setIdade(70);
        person.imprime();

        //    System.out.println(pessoa.getNome());
        //    System.out.println(pessoa.getIdade());
    }
}
