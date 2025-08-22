package academy.devdojo.maratonajava.javacore.gassociacao.test;

import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Seminario;

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
