package academy.devdojo.javaoneforall.introduction.exercicios;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos que deseja: ");
        int n = input.nextInt();

        System.out.println("Sequencia de Fibonacci com " + n + " termos:");
        System.out.println(resultado(sequenciaFibonacci(n)));

    }

    static long[] sequenciaFibonacci(int n) {
        long[] seqFibonacci = new long[n];

        seqFibonacci[0] = 0;
        seqFibonacci[1] = 1;
        for (int i = 2; i < n ; i++) {
            seqFibonacci[i] = seqFibonacci[i-1] + seqFibonacci[i-2];
        }
        return seqFibonacci;
    }

    static String resultado(long[] seqFibonacci) {
        String resposta = "[ ";
        for (int i = 0; i < seqFibonacci.length; i++) {
            resposta += seqFibonacci[i] + (i < seqFibonacci.length - 1 ? ", " : " ]");
        }
        return resposta;
    }
}
