package academy.devdojo.javaoneforall.javacore.bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.Student;
import academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain.PrintStudent;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent impr = new PrintStudent();

        student01.nome = "Gon";
        student01.idade = 14;
        student01.sexo = 'M';

        student02.nome = "Killua";
        student02.idade = 14;
        student02.sexo = 'M';

        impr.Imprime(student01);
        impr.Imprime(student02);

    }
}
