package academy.devdojo.javaoneforall.javacore.npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.npolymorphism.service.CalculatorImpost;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 5", 3000);
        Tomato tomato = new Tomato("Americano", 3.90);
        tomato.setDataDeValidade("16/02/2021");

        CalculatorImpost.calcularImposto(tomato);
        System.out.println("----------------------------");
        CalculatorImpost.calcularImposto(product);
    }
}
