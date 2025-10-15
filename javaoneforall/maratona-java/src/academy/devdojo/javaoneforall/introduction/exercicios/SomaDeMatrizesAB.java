package academy.devdojo.javaoneforall.introduction.exercicios;

public class SomaDeMatrizesAB {
    public static void main(String[] args) {
        int [][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] matrizB = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};

        int [][] sumMatriz = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                sumMatriz[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for (int[] ints : sumMatriz) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}

