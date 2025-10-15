package academy.devdojo.maratonajava.javacore.gassociacao.test;

import java.util.Random;
import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Software: Question&Answer");
        System.out.print  ("Digite sua pergunta e eu direi Sim ou Não: ");
        String pergunta = input.nextLine();

        String resposta = "SÑ";
        int randomInt = random.nextInt(2);
        char randomChar = resposta.charAt(randomInt);
        System.out.println(randomChar+"....");

    }
}
