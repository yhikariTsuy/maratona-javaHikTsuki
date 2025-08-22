package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impr = new ImprimeEstudante();

        estudante01.nome = "Gon";
        estudante01.idade = 14;
        estudante01.sexo = 'M';

        estudante02.nome = "Killua";
        estudante02.idade = 14;
        estudante02.sexo = 'M';

        impr.Imprime(estudante01);
        impr.Imprime(estudante02);

    }
}
