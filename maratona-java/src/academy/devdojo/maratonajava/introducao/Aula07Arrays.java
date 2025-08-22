package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        int [] idades = new int[4];
        int sumArray = 0;

        idades[0] = 10;
        idades[1] = 15;
        idades[2] = 24;
        idades[3] = 22;

        for (int i = 0; i < 4 ; i++) {
            sumArray += idades[i];
        }

        System.out.println(sumArray);
    }
}
