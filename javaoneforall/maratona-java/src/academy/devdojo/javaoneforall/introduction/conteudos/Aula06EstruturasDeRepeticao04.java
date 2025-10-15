package academy.devdojo.javaoneforall.introduction.conteudos;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 25350;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                System.out.printf("%dx de R$ %.2f%n", parcela, valorParcela);
                break;
            }
        }

        // ou em formato While...

        double price = 25350.00;
        double limit = 1000.00;

        int instantament = 1;
        while (price / instantament >= limit) {
            instantament++;
        }
        System.out.printf("%dx de R$ %.2f%n", instantament, price / instantament );

    }
}
