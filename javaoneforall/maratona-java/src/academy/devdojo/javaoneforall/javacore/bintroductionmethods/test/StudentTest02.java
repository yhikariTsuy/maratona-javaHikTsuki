package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.nome = "Gon";
        student01.idade = 14;
        student01.sexo = 'M';

        student02.nome = "Killua";
        student02.idade = 14;
        student02.sexo = 'M';

        student01.imprime();
        student02.imprime();
    }
}
