package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Frieren";
        estudante.idade = 100000;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
