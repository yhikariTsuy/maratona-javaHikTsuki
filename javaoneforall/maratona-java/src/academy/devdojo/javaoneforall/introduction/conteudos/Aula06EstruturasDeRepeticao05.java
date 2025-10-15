package academy.devdojo.javaoneforall.introduction.conteudos;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double price = 30000;
        for (int i = (int) price; i >= 1 ; i--) {
            double totalParcel = price / i;
            if (totalParcel < 1000) {
                continue;
            }
            System.out.printf("Parcel: %d , Price: %.2f%n", i, totalParcel);
        }
    }
}
