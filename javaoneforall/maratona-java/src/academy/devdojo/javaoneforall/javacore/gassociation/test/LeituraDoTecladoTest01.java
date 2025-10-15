package academy.devdojo.javaoneforall.javacore.gassociation.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print  ("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.print  ("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print  ("Digite o seu sexo: [M/F] ");
        char sexo = input.next().charAt(0);
        System.out.println("=========================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("=========================");
    }
}
