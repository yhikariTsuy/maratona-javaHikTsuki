package academy.devdojo.javaoneforall.javacore.aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Flame";
        professor.idade =  27;
        professor.sexo = 'F';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
