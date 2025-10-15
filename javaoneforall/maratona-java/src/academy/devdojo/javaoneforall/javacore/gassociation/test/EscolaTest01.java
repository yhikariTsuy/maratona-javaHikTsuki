package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Escola;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraiya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
