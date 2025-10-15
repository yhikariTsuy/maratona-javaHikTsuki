package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Aluno;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Local;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Aureole");
        Aluno aluno = new Aluno("Frieren", 1000);
        Professor professor = new Professor("Flame", "Maga Suprema");

        Aluno[] alunosParaSeminario = new Aluno[]{aluno};
        Seminario seminario = new Seminario("A Jornada Para Além do Fim", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = new Seminario[]{seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
