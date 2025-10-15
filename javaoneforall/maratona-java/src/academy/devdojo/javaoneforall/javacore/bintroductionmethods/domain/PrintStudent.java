package academy.devdojo.javaoneforall.javacore.bintroductionmethods.domain;

public class PrintStudent {
    public void Imprime(Student student) {
        System.out.println("==================");
        System.out.println(student.nome);
        System.out.println(student.idade);
        System.out.println(student.sexo);
    }
}
