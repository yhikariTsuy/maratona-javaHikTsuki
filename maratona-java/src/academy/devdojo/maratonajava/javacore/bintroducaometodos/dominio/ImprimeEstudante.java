package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

public class ImprimeEstudante {
    public void Imprime(Estudante estudante) {
        System.out.println("==================");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
