package academy.devdojo.javaoneforall.introduction.exercicios;

import java.util.*;

public class Histograma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] conjunto = new int [10];

        int min = 1;
        int max = 5;


        Random random = new Random();
        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = random.nextInt(min, max + 1);
        }

        Map<Integer, Integer> occurrence = new HashMap<>();

        for (int i = min; i <= max; i++) {
            occurrence.put(i, 0);
        }

        for (int valor : conjunto ) {
            if(valor >= min && valor <= max) {
                occurrence.put(valor, occurrence.get(valor) + 1);
            }
        }

        StringBuilder array = new StringBuilder("[ ");
        for (int i = 0; i < 10; i++) {
            array.append(conjunto[i]).append(i < conjunto.length - 1 ? ", " : " ]");
        }
        System.out.println("Conjunto de Inteiros de 1 a 5:\n" + array);


        System.out.print("Deseja ver um Histograma Horizontal ou Vertical? [H/V] ");
        char resposta = input.next().charAt(0);

        switch (resposta) {
            case 'H':
                System.out.println("\nHistograma Horizontal:");
                for (int i = min; i <= max; i++) {
                    System.out.print(i + " ");
                    int qtd = occurrence.get(i);
                    for(int j = 0; j < qtd; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 'V':
                System.out.println("\nHistograma Vertical: ");
                int maxOcr = Collections.max(occurrence.values());

                for (int i = maxOcr; i > 0; i--) {
                    for (int j = min; j <= max ; j++) {
                        if(occurrence.get(j) >= i) {
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }

                for(int i = min; i <= max ; i++) {
                    System.out.print(i + " ");
                }


        }

    }
}
