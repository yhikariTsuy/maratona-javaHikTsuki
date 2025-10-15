package academy.devdojo.javaoneforall.javacore.gassociation.test;

import academy.devdojo.javaoneforall.javacore.gassociation.domain.Jogador;
import academy.devdojo.javaoneforall.javacore.gassociation.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Time time = new Time("Seleção Argentina");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
