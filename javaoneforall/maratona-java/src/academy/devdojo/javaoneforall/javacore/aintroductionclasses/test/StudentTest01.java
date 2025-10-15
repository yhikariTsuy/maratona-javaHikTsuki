package academy.devdojo.javaoneforall.javacore.aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.nome = "Frieren";
        student.idade = 100000;
        student.sexo = 'F';

        System.out.println(student.nome);
        System.out.println(student.idade);
        System.out.println(student.sexo);
    }
}
