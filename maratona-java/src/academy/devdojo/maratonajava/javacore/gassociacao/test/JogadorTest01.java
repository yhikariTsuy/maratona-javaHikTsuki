package academy.devdojo.maratonajava.javacore.gassociacao.test;

import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Cristiano");
        Jogador jogador3 = new Jogador("Alex");
        Jogador [] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
