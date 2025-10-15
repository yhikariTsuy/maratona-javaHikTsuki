package academy.devdojo.javaoneforall.introduction.conteudos;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[2][2];

        dias[0][0] = 12;
        dias[0][1] = 13;

        dias[1][0] = 15;
        dias[1][1] = 24;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=====");

        for (int [] arrBase : dias) {
            for (int dia : arrBase) {
                System.out.print(dia + " ");
            }
            System.out.println();
        }
    }
}
