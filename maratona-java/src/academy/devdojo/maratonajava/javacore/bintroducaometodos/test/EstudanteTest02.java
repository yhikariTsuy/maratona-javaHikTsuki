package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gon";
        estudante01.idade = 14;
        estudante01.sexo = 'M';

        estudante02.nome = "Killua";
        estudante02.idade = 14;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
