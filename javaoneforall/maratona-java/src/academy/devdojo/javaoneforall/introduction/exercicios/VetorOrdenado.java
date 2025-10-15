package academy.devdojo.javaoneforall.introduction.exercicios;

import java.util.Random;
import java.util.Scanner;

public class VetorOrdenado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Informe o numero de valores a serem gerados: ");
        int n = input.nextInt();
        System.out.print("Informe o valores que deseja gerar aleatoriamente de 0 a k: ");
        int k = input.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(0, k + 1);
        }
        System.out.println("Vetor original: " + printVetor(vetor));

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado: " + printVetor(vetor));

    }

    static String printVetor(int[] vetor) {
        String str = "[ ";
        for (int i = 0; i < vetor.length; i++) {
            str += vetor[i] + (i < vetor.length - 1 ? ", " : " ]");
        }
        return str;
    }



}
